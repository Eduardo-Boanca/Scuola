public class Film extends Opera implements Recensibile{
    
    private String casa_distributrice;
    private int stelle_recensione;

    // costruttore
    public Opera(String MyTitolo, String MyAutore, int MyAnno_pubblicazione, String MyCasa_distributrice, int MyStelle_recensione) {
        super(MyTitolo, MyAutore, MyAnno_pubblicazione);
        this.casa_distributrice = MyCasa_distributrice;
        this.stelle_recensione = MyStelle_recensione;
    }

    // costruttore di default
    public Opera() {
    }

    // costruttore di copia
    public Opera(Opera opera) {
        this.titolo = opera.getTitolo();
        this.autore = opera.getTitolo();
        this.anno_pubblicazione = opera.getAnno_pubb();
    }

    public void setCasa_Distro(String casa_distributrice) {
        this.casa_distributrice = casa_distributrice;
    };

    public String getCasa_Distro() {
        return this.casa_distributrice;
    };

    public void setStelle_Recensioni(int stelle_recensione) {
        this.stelle_recensione = stelle_recensione;
    };

    public String getStelle_Recensioni() {
        return this.stelle_recensione;
    };
    
    public boolean equals(Libro obj) {
        boolean result = true;
        if (!(this.titolo == (obj.getTitolo())))
            return false;

        if (!(this.autore == (obj.getAutore())))
            return false;
       
        if (!(this.anno_pubblicazione == (obj.getAnno_pubb())))
            return false;
        
        return result;
    }
}
