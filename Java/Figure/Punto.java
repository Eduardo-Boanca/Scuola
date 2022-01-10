class Punto
{
    private int x;
    private int y;

    public Punto(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return this.x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return this.y;
    }

    public void muovi(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void presentati()
    {
        System.out.println("Sono un punto in posizione \n X: "+this.x+"\n"+" Y: "+this.y);
    }

    public double getDistance(Punto object)
    {
        return Math.sqrt(Math.pow(object.x - this.x,2) +Math.pow(object.y - this.y,2));
    }

    public void disegna()
    {
        for(int i=0;i<y;i++)
            System.out.println();
        for(int j=0;j<x;j++)
            System.out.print(" ");
        System.out.print("*");
        System.out.println();
    }

    public boolean equals(Punto oggetto)
    {
        boolean equals = true;
        if(!(this.x==oggetto.getX()&&this.y==oggetto.getY()))
            equals = false;
        return equals;
    }
}