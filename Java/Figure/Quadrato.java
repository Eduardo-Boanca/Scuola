class Quadrato extends Punto
{
    private int lato;

    public Quadrato(int x, int y, int lato)
    {
        super(x,y);
        this.lato = lato;
    }

    public Quadrato(Quadrato oggetto)
    {
        super(oggetto.getX(),oggetto.getY());
        this.lato = getLato();
    }

    public void setLato(int lato)
    {
        this.lato = lato;
    }

    public int getLato()
    {
        return this.lato;
    }

    public double getPerimetro()
    {
        return this.lato * 4; 
    }

    public double getArea()
    {
        return this.lato * this.lato; 
    }

    public void presentati()
    {
        System.out.println("Sono un quadrato");
        System.out.println(" Punto centrale in posizione:"+"\n"+"  X="+this.getX()+"\n"+"  Y="+this.getY()+"\n"+" Dimensione lato: "+this.lato+"\n"+" Perimetro: "+this.getPerimetro()+"\n"+" Area: "+this.getArea());
    }

    public boolean equals(Quadrato oggetto)
    {
        boolean equals = true;
        if(!(this.lato==oggetto.getLato()&&super.equals(oggetto)))
            equals = false;
        return equals;
    }

    public void disegna()
    {
        for(int i=0;i<getY()-((lato-1)/2);i++)
            System.out.println();
        for(int i=0;i<lato;i++)
        {
            for(int j=0;j<getX()-((lato-1)/2);j++)
                System.out.print(" ");
            for(int j=0;j<lato;j++)
                System.out.printf("*");
            System.out.println();
        }
        System.out.println();
    }
}