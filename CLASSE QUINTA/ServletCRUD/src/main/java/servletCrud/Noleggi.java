package servletCrud;

import java.util.Date;

public class Noleggi {

    private int id;
    private int lettore_id;
    private long isbn;
    private Date data_prestito;
    private Date data_restituzione_effettiva;

    public Noleggi(int id, int lettoreId, long isbn, Date dataPrestito, Date dataRestituzioneEffettiva) {
        this.id = id;
        lettore_id = lettoreId;
        this.isbn = isbn;
        data_prestito = dataPrestito;
        data_restituzione_effettiva = dataRestituzioneEffettiva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLettore_id() {
        return lettore_id;
    }

    public void setLettore_id(int lettore_id) {
        this.lettore_id = lettore_id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Date getData_prestito() {
        return data_prestito;
    }

    public void setData_prestito(Date data_prestito) {
        this.data_prestito = data_prestito;
    }

    public Date getData_restituzione_effettiva() {
        return data_restituzione_effettiva;
    }

    public void setData_restituzione_effettiva(Date data_restituzione_effettiva) {
        this.data_restituzione_effettiva = data_restituzione_effettiva;
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
        final Noleggi other = (Noleggi) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String toJson() {
        String s = "{\n\"noleggio\"\n{\n\"id\":\"" + id + "\",\n";
        s += "\"id_lettore\":\"" + lettore_id + "\",\n";
        s += "\"isbn\":\"" + isbn + "\",\n";
        s += "\"data_prestito\":\"" + data_prestito + "\",\n";
        s += "\"data_restituzione\":\"" + data_restituzione_effettiva + "\",\n";
        s += "\n}\n}";
        return s;
    }
}
