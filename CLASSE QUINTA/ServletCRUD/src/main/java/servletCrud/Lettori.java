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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lettori other = (Lettori) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String toJson() {
        String s = "{\n\"lettore\"\n{\n\"id\":\"" + id + "\",\n";
        s += "\"name\":\"" + nome + "\",\n";
        s += "\"cognome\":\"" + cognome + "\",\n";
        s += "\"telefono\":\"" + numero_telefono + "\",\n";
        s += "\"email\":\"" + email + "\",\n";
        s += "\n}\n}";
        return s;
    }
}
