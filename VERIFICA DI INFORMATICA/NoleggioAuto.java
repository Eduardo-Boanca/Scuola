public class NoleggioAuto {
    private String targa_auto;
    private double prezzo_noleggio;
    private Orario ora_inizio_noleggio;
    private Orario ora_fine_noleggio;
    private Orario oraTotale;

    // costruttore
    public NoleggioAuto(String myTarga, double myPrezzo, int myOra_inizio, int myMinuti_inizio, int myOra_fine,
            int myMinuti_fine) {
        this.targa_auto = myTarga;
        this.prezzo_noleggio = myPrezzo;
        // this.ora_inizio_noleggio = myOra_inizio;
        // this.ora_fine_noleggio = myOra_fine;
        // this.ora_inizio_noleggio = myMinuti_inizio;
        // this.ora_fine_noleggio = myMinuti_fine;
        this.ora_inizio_noleggio = new Orario(myOra_inizio, myMinuti_inizio);
        this.ora_fine_noleggio = new Orario(myOra_fine, myMinuti_fine);
    }

    // costruttore copia
    public NoleggioAuto(NoleggioAuto auto1) {
        this.targa_auto = auto1.getTarga();
        this.prezzo_noleggio = auto1.getPrezzo();
        this.ora_inizio_noleggio = new Orario(auto1.getOra_inizio());
        this.ora_fine_noleggio = new Orario(auto1.getOra_fine());
    }

    // costruttore default
    public NoleggioAuto() {
    }

    public String getTarga() {
        return this.targa_auto;
    }

    public void setTarga(String myTarga) {
        this.targa_auto = myTarga;
    }

    public double getPrezzo() {
        return this.prezzo_noleggio;
    }

    public void setPrezzo(double myPrezzo) {
        this.prezzo_noleggio = myPrezzo;
    }

    public Orario getOra_inizio() {
        return this.ora_inizio_noleggio;
    }

    public void setOra_inizio(int hh, int mm) {
        this.ora_inizio_noleggio.setOra(hh);
        this.ora_inizio_noleggio.setMinuti(mm);
    }

    public Orario getOra_fine() {
        return this.ora_fine_noleggio;
    }

    public void setOra_fine(int hh, int mm) {
        this.ora_fine_noleggio.setOra(hh);
        this.ora_fine_noleggio.setMinuti(mm);
    }

    public Orario getOraTotale() {
        return this.oraTotale;
    }

    public void setOraTotale(Orario myOraTotale) {
        this.oraTotale = myOraTotale;
    }

    public int compareToDurata(NoleggioAuto auto2) {
        int compareTo;
        if (this.durataNoleggio() == auto2.durataNoleggio())
            compareTo = 0; // sono uguali
        else {
            if (this.durataNoleggio() > auto2.durataNoleggio())
                compareTo = 1; // auto2 ha una durata maggiore
            else
                compareTo = -1; // auto2 ha una durata minore
        }
        return compareTo;
    }

    public int durataNoleggio() {

        int durata;
        int oraInizio = this.ora_inizio_noleggio.getOra();
        int oraFine = this.ora_fine_noleggio.getOra();
        int minutiInizio = this.ora_inizio_noleggio.getMinuti();
        int minutiFine = this.ora_fine_noleggio.getMinuti();
        if (oraInizio == oraFine)
            durata = minutiFine - minutiInizio;
        else {
            if (minutiInizio == 0 && minutiFine == 0)
                durata = (oraFine - oraInizio) * 60;
            else {
                durata = (60 - minutiInizio) - minutiFine;
                durata += (oraFine - oraInizio - 1) * 60;
            }
        }
        return durata;
    }

    public double prezzoTotale() {
        return this.durataNoleggio() * (prezzo_noleggio / 60);
    }

    public int compareToPrezzo(NoleggioAuto auto2) {
        int compara;
        if (this.prezzoTotale() == auto2.prezzoTotale())
            compara = 0;
        else {
            if (this.prezzoTotale() > auto2.prezzoTotale())
                compara = 1;
            else
                compara = -1;
        }
        return compara;
    }

}
