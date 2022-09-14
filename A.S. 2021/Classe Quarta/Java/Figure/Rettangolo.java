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

    public void setBase(int base)
    {
        this.base = base;
    }

    public int getBase()
    {
        return this.base;
    }

    public void setAltezza(int altezza)
    {
        this.altezza = altezza;
    }

    public int getAltezza()
    {
        return this.altezza;
    }

    public double getPerimetro()
    {
        return (this.base * 2) + (this.altezza * 2); 
    }

    public double getArea()
    {
        return this.base * this.altezza; 
    }

    public void presentati()
    {
        System.out.println("Sono un rettangolo");
        super.presentati();
        System.out.println(" Base: "+this.base+"\n"+" Altezza: "+this.altezza+"\n"+" Perimetro: "+this.getPerimetro()+"\n"+" Altezza: "+this.getArea());
    }

    public boolean equals(Rettangolo oggetto)
    {
        boolean equals = true;
        if(!(this.base==oggetto.getBase()&&this.altezza==oggetto.getAltezza()&&super.equals(oggetto)))
            equals = false;
        return equals;
    }

    public void disegna()
    {
        for(int i=0;i<getY()-((altezza-1)/2);i++)
            System.out.println();
        for(int i=0;i<altezza;i++)
        {
            for(int j=0;j<getX()-((base-1)/2);j++)
                System.out.print(" ");
            for(int j=0;j<base;j++)
                System.out.printf("*");
            System.out.println();
        }
        System.out.println();
    }
}