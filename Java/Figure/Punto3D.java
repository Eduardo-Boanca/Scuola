class Punto3D extends Punto
{
    private int z;

    public Punto3D(int x, int y ,int z)
    {
        super(x,y);
        this.z = z;   
    }

    public Punto3D(Punto3D oggetto)
    {
        super(oggetto.getX(),oggetto.getY());
        this.z = oggetto.getZ();   
    }

    public int getZ()
    {
        return this.z;
    }

    public void presentati()
    {
        System.out.println("Sono un punto3D in posizione \n X: " + this.getX()+ "\n" + " Y: " + this.getY() + "\n" + " Z: " + this.z);
    }

    public double getDistance(Punto3D object)
    {
        return Math.sqrt( Math.sqrt(Math.pow(object.getX() - this.getX(),2) + Math.pow(object.getZ() - this.z,2)) + Math.pow(object.getY() - this.getY(),2));
    }
    
    public void muovi(int x,int y,int z)
    {
        super.muovi(x,y);
        this.z= this.z + z;
    }

    public boolean equals(Punto3D oggetto)
    {
        boolean equals = true;
        if(!(this.z==oggetto.getZ()&&super.equals(oggetto)))
            equals = false;
        return equals;
    }
}