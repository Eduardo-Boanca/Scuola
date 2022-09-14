public abstract class Opera {

    private String titolo;
    private String autore;
    private int anno_pubblicazione;

    // costruttore
    public Opera(String MyTitolo, String MyAutore, int MyAnno_pubblicazione) {
        this.titolo = MyTitolo;
        this.autore = MyAutore;
        this.anno_pubblicazione = MyAnno_pubblicazione;
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

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    };

    public String getTitolo() {
        return this.titolo;
    };

    public void setAutore(String autore) {
        this.autore = autore;
    };

    public String getAutore() {
        return this.autore;
    };

    public void setAnno_pubb(int anno_pubblicazione) {
        this.anno_pubblicazione = anno_pubblicazione;
    };

    public int getAnno_pubb() {
        return this.anno_pubblicazione;
    };

    // toString();
    public void presentati() {
        System.out.printf("\nTitolo: %s", this.titolo);
        System.out.printf("\nAutore: %s", this.autore);
        System.out.printf("\nAnno di pubblicazione: %d\n", this.anno_pubblicazione);
    }

    public boolean equals(Opera obj) {
        boolean result = true;

        if (!(this.titolo == (obj.getTitolo())))
            return false;

        if (!(this.autore == (obj.getAutore())))
            return false;

        if (!(this.anno_pubblicazione == (obj.getAnno_pubb())))
            return false;

        return result;
    }

    public abstract int isBetterThen(int voto);

    // public abstract boolean equals();
}
