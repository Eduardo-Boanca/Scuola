package servletCrud;

public class Libri {
    private long isbn;
    private String titolo;
    private String autore;

    public Libri(long isbn, String titolo, String autore) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public int hashCode() {
        long hash = 7;
        hash = 71 * hash + this.isbn;
        return (int) hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libri other = (Libri) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }

    public String toJson() {
        String s = "{\n\"libro\"\n{\n\"isbn\":\"" + isbn + "\",\n";
        s += "\"titolo\":\"" + titolo + "\",\n";
        s += "\"autore\":\"" + autore + "\",\n";
        s += "\n}\n}";
        return s;
    }
}
