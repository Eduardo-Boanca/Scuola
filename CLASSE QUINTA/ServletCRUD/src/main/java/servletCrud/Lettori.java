package servletCrud;

public class Lettori {

    private int id;
    private String nome;
    private String cognome;
    private String numero_telefono;
    private String email;

    public Lettori(int id, String nome, String cognome, String numeroTelefono, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        numero_telefono = numeroTelefono;
        this.email = email;
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

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
