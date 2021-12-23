class Punto
{
    private int x;
    private int y;

    public Punto(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void muovi(int x, int y)
    {
        this.x+=x;
        this.y+=y;
    }

    public void presentati()
    {
        System.out.println("Sono un punto in posizione \n X: "+this.x+"\n"+" Y: "+this.y);
    }

    public double getDistance(Punto object)
    {
      double d=Math.sqrt(Math.pow(object.x-this.x,2)+Math.pow(object.y-this.y,2));
      return d;
    }

    public void disegna(){
      
      int a;
      
      for(int i=0;i<50;i++)
      for(int j=0;j<30;j++)
      {
        if(this.x==i && this.y==j)
        System.out.print("X");
        else
        System.out.print(" ");
      }
    }
}