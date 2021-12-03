public class AereoDiLinea extends Aereo{
    private String compagnia;
    public int passeggeri;

    public AereoDiLinea(String myModello, String myMarca, int myAnno, String myCompagnia, int myPasseggeri)
    {   
        super(myModello, myMarca, myAnno);
        this.compagnia = myCompagnia;
        this.passeggeri = myPasseggeri;
    }

    //costruttore di copia
    public AereoDiLinea(AereoDiLinea a2)
    {
        super(a2.getModello(), a2.getMarca(), a2.getAnno());
        this.compagnia = a2.getCompagnia();
        this.passeggeri = a2.getPasseggeri();
    }

    public String getCompagnia()
    {
        return this.compagnia;
    }

    public int getPasseggeri()
    {
        return this.passeggeri;
    }

    public String emergenza() {
        return "Indossare le mascherine per l'ossigeno.";
    }

    @Override
    void presentati() {
        System.out.println("Faccio parte della famiglia degli aerei");
        super.presentati();
        System.out.print("Faccio parte della compagnia " + this.compagnia + " e posso trasportare " + this.passeggeri + " passeggeri");
    }

}
