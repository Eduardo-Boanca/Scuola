import java.lang.Math;

class Sfera extends Punto3D
{
    private int raggio;

    public Sfera(int x, int y, int z, int raggio)
    {
        super(x,y,z);
        this.raggio = raggio;
    }

    public Sfera(Sfera oggetto)
    {
        super(oggetto.getX(),oggetto.getY(),oggetto.getZ());
        this.raggio = getRaggio();
    }

    public void setRaggio(int raggio)
    {
        this.raggio = raggio;
    }

    public int getRaggio()
    {
        return this.raggio;
    }

    public double getSuperficie()
    {
        return 4 * Math.PI * Math.pow(this.raggio,2); 
    }

    public double getVolume()
    {
        return (4 * Math.PI * Math.pow(this.raggio,3)) / 3;
    
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(this.raggio,2);
    }

    public void presentati()
    {
        System.out.println("Sono una sfera");
        System.out.println(" Punto centrale in posizione:"+"\n"+"  X="+this.getX()+"\n"+"  Y="+this.getY()+"\n"+"  Z="+this.getZ()+"\n"+" Raggio: "+this.raggio+"\n"+" Superficie: "+this.getSuperficie()+"\n"+" Volume: "+getVolume());
    }


    public void disegna () {

    }
}