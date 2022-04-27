public class Film extends Opera implements Recensibile {

    private String casa_distributrice;
    private int stelle_recensione;

    // costruttore
    public Film(String MyTitolo, String MyAutore, int MyAnno_pubblicazione, String MyCasa_distributrice,
            int MyStelle_recensione) {
        super(MyTitolo, MyAutore, MyAnno_pubblicazione);
        this.casa_distributrice = MyCasa_distributrice;
        this.stelle_recensione = MyStelle_recensione;
    }

    // costruttore di default
    public Film() {
    }

    // costruttore di copia
    public Film(Film obj) {
        super(obj.getTitolo(), obj.getAutore(), obj.getAnno_pubb());
        this.casa_distributrice = obj.getCasa_Distro();
        this.stelle_recensione = obj.getRecensione();
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

    public int getStelle_Recensioni() {
        return this.stelle_recensione;
    };

    public int getRecensione() {
        return this.stelle_recensione;
    }

    public void setRecensione(int MyStelle_recensione) {
        stelle_recensione = MyStelle_recensione;
    }

    public void presentati() {
        System.out.println("\nIl titolo è " + this.getTitolo());
        System.out.println("\nL'autore è " + this.getAutore());
        System.out.println("\nL'anno di pubblicazione è " + this.getAnno_pubb());
        System.out.println("\nLa casa distributrice è " + this.getCasa_Distro());
        System.out.println("\nIl voto è " + this.getStelle_Recensioni());
    }

    @Override
    public String toString() {
        return "Film: " + this.getTitolo() + " " + this.getAutore() + " " + getAnno_pubb() + " " + getCasa_Distro() + " " + getStelle_Recensioni();
    }

    public int isBetterThen(int voto) {
        int result;
        if (stelle_recensione == voto)
            result = 0;
        else if (stelle_recensione > voto)
            result = 1;
        else
            result = -1;
        return result;
    }

    public boolean equals(Film obj) {
        boolean result = true;

        if(!(super.equals(obj)))
        return false;

        if (!(this.casa_distributrice == (obj.getCasa_Distro())))
            return false;

        if (!(this.stelle_recensione == (obj.getStelle_Recensioni())))
            return false;

        return result;
    }


}
