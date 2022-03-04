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
}
