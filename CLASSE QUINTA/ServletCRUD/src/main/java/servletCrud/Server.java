package servletCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Server {
    // La classe Connection permette di connettersi ad un database.
    Connection connection;
    // La classe Statement permette di eseguire una query al database.
    Statement statement;
    // La classe ResultSet contiene il risultato della query effettuata sul
    // database.
    ResultSet resultSet;

    /**
     * Il costruttore prende come parametro formale la stringa di connessione
     * al database.
     */
    public Server(String connectionString) {
        try {
            // La classe DriverManager è il servizio di base per la gestione
            // dei driver JDBC, mentre il metodo getConnection() permette di
            // creare una connessione al database identificato dalla stringa
            // fornita come parametro attuale.
            connection = DriverManager.getConnection(connectionString);
            // Il metodo createStatement() crea un oggetto Statement utilizzato
            // per inviare istruzioni SQL al database.
            statement = connection.createStatement();
        } catch (SQLException ex) {
            throw new RuntimeException("Impossibile connettersi al database");
        }
    }

    /**
     * Il metodo memorizza in un ArrayList l'elenco di tutte le categorie
     * presenti nella tabella Categories.
     * @return elenco di oggetti Category
     */
    public List<Category> selectCategories() {
        List<Category> list = new ArrayList();
        try {
            // Il metodo executeQuery() dell'interfaccia Statement esegue una
            // istruzione SQL fornita come parametro attuale, e restituisce un
            // singolo oggetto ResultSet.
            resultSet = statement.executeQuery("select * from Categories");
            while (resultSet.next()) {
                // I metodi getInt() e getString() dell'interfaccia ResultSet
                // recuperano il valore nella colonna passata come parametro
                // attuale ai metodi, dell'attuale riga dell'oggetto ResultSet.
                // Il metodo getInt() trasforma il valore in un intero, mentre
                // il metodo getString() lo trasforma in una stringa.
                // Il parametro passato nei metodi può essere un numero o una
                // stringa. Il primo identifica la posizione della colonna, il
                // secondo l'attributo della tabella nel database.
                list.add((Category) (new Category(resultSet.getInt(1),
                        resultSet.getString(2))));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return list;
    }

    /**
     * Il metodo memorizza in un ArrayList l'elenco di tutti i negozi
     * presenti nella tabella Showrooms.
     * @return elenco di oggetti Showroom
     */
    public List<Showroom> selectShowrooms() {
        List<Showroom> list = new ArrayList();
        Showroom ss = null;
        try {
            resultSet = statement.executeQuery("select * from Showrooms");
            while (resultSet.next()) {
                ss = new Showroom(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));
                ss.setPhone(resultSet.getString(5));
                ss.setSite(resultSet.getString(6));
                list.add((Showroom) ss);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return list;
    }

    /**
     * Il metodo memorizza in un ArrayList l'elenco di tutti i prodotti
     * presenti nella tabella Products, ognuno associato alla relativa
     * categoria.
     * @return elenco di oggetti Product
     */
    public List<Product> selectProducts() {
        List<Product> list = new ArrayList();
        Category sc = null;
        Product sp = null;
        try {
            resultSet = statement.executeQuery("select * from Products, "
                    + "Categories where id_category=Categories.id");
            while (resultSet.next()) {
                if (sc == null || sc.getId() != resultSet.getInt(6)) {
                    sc = new Category(resultSet.getInt(6), resultSet.getString(7));
                }
                sp = new Product(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3),resultSet.getFloat(4), (Category) sc);
                list.add((Product) sp);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return list;
    }

    /**
     * Il metodo seleziona dal database l'istanza di Categories identificata
     * dalla chiave primaria passata come parametro al metodo.
     * @param id chiave primaria che identifica l'istanza nella tabella
     * Categories.
     * @return l'oggetto Category con i dati estratti dal database.
     */
    public Category selectCategory(int id) {
        Category c = null;
        try {
            resultSet = statement.executeQuery("select * from Categories where id=" + id);
            if (resultSet.next()) {
                c = (Category) (new Category(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return c;
    }

    /**
     * Il metodo seleziona dal database l'istanza di Showroom identificata
     * dalla chiave primaria passata come parametro al metodo.
     * @param id chiave primaria che identifica l'istanza nella tabella
     * Showrooms.
     * @return l'oggetto Showroom con i dati estratti dal database.
     */
    public Showroom selectShowroom(int id) {
        Showroom ss = null;
        try {
            resultSet = statement.executeQuery("select * from Showrooms where id=" + id);
            if (resultSet.next()) {
                ss = new Showroom(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));
                ss.setPhone(resultSet.getString(5));
                ss.setSite(resultSet.getString(6));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return (Showroom) ss;
    }

    /**
     * Il metodo seleziona dal database l'istanza di Products identificata
     * dalla chiave primaria passata come parametro al metodo.
     * @param id chiave primaria che identifica l'istanza nella tabella
     * Products.
     * @return l'oggetto Product con i dati estratti dal database.
     */
    public Product selectProduct(int id) {
        Category sc = null;
        Product sp = null;
        try {
            resultSet = statement.executeQuery("select * from Products, Categories "
                    + "where id_category=Categories.id and Products.id=" + id);
            if (resultSet.next()) {
                sc = new Category(resultSet.getInt(6), resultSet.getString(7));
                sp = new Product(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3),resultSet.getFloat(4), (Category) sc);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return (Product) sp;
    }

    public int deleteProduct(Product p){
        return deleteProduct(p.getId());
    }

    public int deleteProduct(int id) {
        int n = 0;
        try {
            n = statement.executeUpdate("delete from Products where id=" + id);
            statement.executeUpdate("delete from ProductsShowrooms where id_product=" + id);
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return n;
    }

    public int deleteShowroom(Showroom s){
        return deleteShowroom(s.getId());
    }

    public int deleteShowroom(int id) {
        int n = 0;
        try {
            n = statement.executeUpdate("delete from Showroom where id=" + id);
            statement.executeUpdate("delete from ProductsShowrooms where id_showroom=" + id);
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return n;
    }

    public int deleteCategory(Category c){
        return deleteCategory(c.getId());
    }

    public int deleteCategory(int id) {
        int n = 0;
        try {
            statement.executeUpdate("delete from Products "
                    + " where id_category=" + id);
            n = statement.executeUpdate("delete from Categories where id=" + id);
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
        return n;
    }

    public int updateCategory(Category c) {
        try {
            return statement.executeUpdate("update Categories set description='"
                    + c.getDescription() + "' where id=" + c.getId());
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int updateShowroom(Showroom s) {
        try {
            return statement.executeUpdate("update Showrooms set phone='"
                    + s.getPhone() + "', site='" + s.getSite() + "' where id=" + s.getId());
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int updateProduct(Product p) {
        try {
            return statement.executeUpdate("update Products set description='"
                    + p.getDescription() + "', price=" + p.getPrice() + ", id_category="
                    + p.getCategory().getId() + " where id=" + p.getId());
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int insertProduct(Product p) {
        try {
            return statement.executeUpdate("insert into Products (name,description"
                    + ",price,id_category) values ('" + p.getName() + "','" + p.getDescription()
                    + "'," + p.getPrice() + "," + p.getCategory().getId() + ")");
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int insertShowroom(Showroom s) {
        try {
            return statement.executeUpdate("insert into Showrooms (name,address"
                    + ",city,phone,site) values ('" + s.getName() + "','" + s.getAddress()
                    + "','" + s.getCity() + "','" + s.getPhone() + "','" + s.getSite() + "')");
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }

    public int insertCategory(Category c) {
        try {
            return statement.executeUpdate("insert into Categories (description)"
                    + " values ('" + c.getDescription() + "')");
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        }
    }
}

