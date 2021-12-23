class Rettangolo extends Punto
{
    private int base;
    private int altezza;

    public Rettangolo(int puntoX, int puntoY, int base, int altezza)
    {
        super(puntoX,puntoY);
        this.base=base;
        this.altezza=altezza;
    }

    public int getBase()
    {
        return this.base;
    }

    public int getAltezza()
    {
        return this.altezza;
    }

    public void presentati()
    {
        System.out.println("Sono un rettangolo");
        super.presentati();
        System.out.println("Base: "+this.base+"\n"+"Altezza: "+this.altezza);
    }
}