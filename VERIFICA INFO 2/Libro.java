public class Libro extends Opera implements Recensibile {

    private String casa_editrice;
    private int voto_in_decimi;

    // costruttore
    public Libro(String MyTitolo, String MyAutore, int MyAnno_pubblicazione, String MyCasa_editrice, int MyVoto_in_decimi) {
        super(MyTitolo, MyAutore, MyAnno_pubblicazione);
        this.casa_editrice = MyCasa_editrice;
        this.voto_in_decimi = MyVoto_in_decimi;
    }

    // costruttore di default
    public Libro() {
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

    public int getVoto_Decimi() {
        return this.voto_in_decimi;
    };

    public int getRecensione() {
        return this.voto_in_decimi;
    }

    public void setRecensione(int MyVoto_in_decimi) {
        voto_in_decimi = MyVoto_in_decimi;
    }

    // public int isBetterThen(Libro libro2) {
    // int result = 0;
    // result = opera.compareTo(libro2);
    // if (result == 0)
    // System.out.println("La recensioni hanno lo stesso voto");
    // if (result < 0)
    // System.out.println("La prima recensione è peggiore");
    // if (result > 0)
    // System.out.println("La prima recensione è migliore");
    // return result;
    // }

    public int isBetterThen(int voto) {
        int result;
        if (voto_in_decimi == voto)
            result = 0;
        else if (voto_in_decimi > voto)
            result = 1;
        else
            result = -1;
        return result;
    }


    public boolean equals(Libro obj) {
        boolean result = true;
        if (!(this.casa_editrice == (obj.getCasa_Editor())))
            return false;

        if (!(this.voto_in_decimi == (obj.getVoto_Decimi())))
            return false;

        return result;
    }

}
