import java.lang.Math;

class Cerchio extends Punto{
    private int raggio;

    public Cerchio(int x, int y, int raggio)
    {
        super(x,y);
        this.raggio = raggio;
    }

    public double getArea()
    {
        return this.raggio * 2 * Math.PI; 
    }
}