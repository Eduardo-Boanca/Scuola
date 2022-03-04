public class Libro extends Opera implements Recensibile {

    private String casa_editrice;
    private int voto_in_decimi;

    // costruttore
    public Opera(String MyTitolo, String MyAutore, int MyAnno_pubblicazione, String MyCasa_editrice, int MyVoto_in_decimi) {
            super(MyTitolo, MyAutore, MyAnno_pubblicazione);
            this.casa_editrice = MyCasa_editrice;
            this.voto_in_decimi = MyVoto_in_decimi;
        }

    // costruttore di default
    public Opera() {
        }

    // costruttore di copia
    public Libro(Libro obj) {
        super(obj.getTitolo(), obj.getAutore(), obj.getAnno_pubb());
        this.casa_editrice = obj.getCasa_Editor();
        this.voto_in_decimi = obj.getRecensione();
    }

    public void setCasa_Editor(String casa_editrice) {
        this.casa_editrice = casa_editrice;
    };

    public String getCasa_Editor() {
        return this.casa_editrice;
    };

    public void setVoto_Decimi(int voto_in_decimi) {
        this.voto_in_decimi = voto_in_decimi;
    };

    public String getVoto_Decimi() {
        return this.voto_in_decimi;
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
