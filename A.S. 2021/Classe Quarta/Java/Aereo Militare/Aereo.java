public class Aereo {
    private String modello;
    private String marca;
    private int anno;

    //Costruttore:
    public Aereo(String myModello, String myMarca, int myAnno) {
        this.modello = myModello;
        this.marca = myMarca;
        this.anno = myAnno;
    }

    public Aereo(Aereo a1)
    {
        this.modello = a1.getModello();
        this.marca = a1.getMarca();
        this.anno = a1.getAnno();
    }

    public String getModello() {
        return this.modello;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAnno() {
        return this.anno;
    }

    void presentati() {
        System.out.println("Sono un " + this.modello + " di marca " + this.marca + " dell'anno " + this.anno);
    }
}