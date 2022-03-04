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
        System.out.printf("\nAnno di pubblicazione %d", this.anno_pubblicazione);
    }

    public int isBetterThen(Opera opera2) {
        int result = 0;
        result = opera.compareTo(opera2);
        if (result == 0)
            System.out.println("La recensioni ");
        if (result < 0)
            System.out.println("La prima recensione è peggiore");
        if (result > 0)
            System.out.println("La prima recensione è migliore");
        return result;
    }

    public abstract boolean equals();
}
