package servletCrud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Server {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public Server(String connectionString) {
        try {
            connection = DriverManager.getConnection(connectionString);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            throw new RuntimeException("Impossibile connettersi al database");
        }
    }

    public int insertStudent(Studente s) {
        try {
            String sql = "insert into studenti (nome, cognome, data_nascita) values (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, s.getNome());
            pstmt.setString(2, s.getCognome());

            java.util.Date utilDate = s.getDataNascita();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            pstmt.setDate(3, sqlDate);

            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Errore nell'esecuzione della query: " + ex.getMessage());  // Stampa il messaggio di errore SQL
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int updateStudent(Studente s) {
        try {
            String sql = "UPDATE studenti SET nome = ?, cognome = ?, data_nascita = ? WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, s.getNome());
            pstmt.setString(2, s.getCognome());

            java.util.Date utilDate = s.getDataNascita();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            pstmt.setDate(3, sqlDate);

            pstmt.setInt(4, s.getId());

            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int deleteStudent(int id) {
        int n = 0;
        try {
            n = statement.executeUpdate("delete from studenti where id=" + id);
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return n;
    }

    public List<Studente> selectStudenti() {
        List<Studente> list = new ArrayList<>();
        try {
            resultSet = statement.executeQuery("select * from studenti");
            while (resultSet.next()) {
                list.add(new Studente(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cognome"), resultSet.getDate("data_nascita")));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return list;
    }

    public Studente selectStudent(int id) {
        Studente studente = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM studenti WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                studente = new Studente(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cognome"),
                        resultSet.getDate("data_nascita"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }

        return studente;
    }
}
