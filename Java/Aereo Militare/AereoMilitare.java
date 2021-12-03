public class AereoMilitare extends Aereo {
    private double velocità;
    public double peso;

    public AereoMilitare(String myModello, String myMarca, int myAnno, double myVelocità, double myPeso) {
        super(myModello, myMarca, myAnno);
        this.velocità = myVelocità;
        this.peso = myPeso;
    }

    // costruttore di copia
    public AereoMilitare(AereoMilitare a3) {
        super(a3.getModello(), a3.getMarca(), a3.getAnno());
        this.velocità = a3.getVelocità();
        this.peso = a3.getPeso();
    }

    public double getVelocità() {
        return this.velocità;
    }

    public double getPeso() {
        return this.peso;
    }

    public String emergenza() {
        return "Aprire la calotta e gettarsi con il paracadute!";
    }

    public boolean equals(AereoMilitare a3) {
        boolean result = true;
        if (!(this.velocità == (a3.getVelocità())))
            return false;

        if (!(this.peso == (a3.getPeso())))
            return false;

        if (!(this.getModello().equals(a3.getModello())))
            return false;

        if (!(this.getMarca().equals(a3.getMarca())))
            return false;
       
        if (!(this.getAnno() == (a3.getAnno())))
            return false;

        return result;
    }

    @Override
    void presentati() {
        System.out.println("Faccio parte della famiglia degli aerei");
        super.presentati();
        System.out.print("Vado ad una velocità di " + this.velocità + " e peso " + this.peso + " kg");
    }

}
