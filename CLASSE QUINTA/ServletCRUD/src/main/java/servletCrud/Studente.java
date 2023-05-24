package servletCrud;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Studente {
    private int id;
    private String nome;
    private String cognome;
    private Date dataNascita;

    // Costruttore per creare un nuovo studente (senza ID)
    public Studente(String nome, String cognome, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    // Costruttore per creare uno studente con un ID esistente (ad es. dal database)
    public Studente(int id, String nome, String cognome, Date dataNascita) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    public String toJson() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-aaaa");
        String s = "{\n\"studente\": {\n";
        s += "\"id\": \"" + id + "\",\n";
        s += "\"nome\": \"" + nome + "\",\n";
        s += "\"cognome\": \"" + cognome + "\",\n";
        s += "\"dataNascita\": \"" + sdf.format(dataNascita) + "\"\n";
        s += "}\n}";
        return s;
    }
}
