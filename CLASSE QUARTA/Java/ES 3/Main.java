public class Main
{
  public static void main(String[] args)
  {
    Automobile auto = new Automobile("FG5432GX","MCLAREN",600,1,300);
    Automobile auto2 = new Automobile();

    auto2.setTarga("FG5432GX");
    auto2.setMarca("MCLAREN");
    auto2.setCavalli(600);
    auto2.setStato(1);
    auto2.setVelocita(300);
    
    if (auto.compareCar(auto,auto2)==true)
      
      System.out.println("Le due auto sono uguali");
    
    else
      
      System.out.println("Le due auto sono diverse");
  }
}
