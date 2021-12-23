
class Parallelepipedo extends Rettangolo
{
  //attrubuti 
  private int l1;
  private int l2;
  private int l3;
  private int puntoX;
  private int puntoY;
  private int puntoZ;

  public Parallelepipedo(int puntoX,int puntoY,int puntoZ,int l1, int l2 ,int l3)
  {
    super(puntoX,puntoY,l1,l2);
    this.puntoZ=puntoZ;
    this.l3=l3;
  }
}