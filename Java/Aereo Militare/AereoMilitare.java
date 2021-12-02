public class AereoMilitare extends Aereo{
    private double velocità;
    public double peso;

    public AereoMilitare(String myModello, String myMarca, int myAnno, double myVelocità, double myPeso)
    {   
        super(myModello, myMarca, myAnno);
        this.velocità = myVelocità;
        this.peso = myPeso;
    }

    public double getVelocità()
    {
        return this.velocità;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public String emergenza() {
        return "Aprire la calotta e gettarsi con il paracadute!";
    }

    @Override
    void presentati() {
        System.out.println("Faccio parte della famiglia degli aerei");
        super.presentati();
        System.out.print("Vado ad una velocità di " + this.velocità + " e peso " + this.peso + " kg");
    }

}
