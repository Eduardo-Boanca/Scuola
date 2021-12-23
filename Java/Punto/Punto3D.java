class Punto3D extends Punto{
    private int z; //profondità
  
    public Punto3D(int x, int y ,int z)
    {
          super(x,y);
          this.z = z;
          
    }
  
    public int getZ()
    {
          return this.z;
    }
  public void presentati()
      {
        super.presentati();
        System.out.println(" Z: "+this.z);
      }
    
    public void muovi(int x,int y,int z)
    {
      super.muovi(x,y);
      this.z= this.z+z;
    }
      
    
  }