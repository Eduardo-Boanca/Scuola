public class Automobile
{//inizio classe
  
  //attributi
  private String targa; // aggiungendo private il programma si blocca
  private String marca;
  private int cavalli;
  private int stato; //stato di accensione 0=spento 1=acceso
  private int velocita;

  //costruttore
   public Automobile(String myTarga, String myMarca, int myCavalli, int myStato, int myVelocita)
   {
     this.marca=myMarca; // this = di questo oggetto
     this.targa=myTarga;
     this.cavalli=myCavalli;
     this.stato=myStato;
     this.velocita=myVelocita;
   }
    /*costruttore
   public Automobile( int mystato, String mymarca, String mytarga , int mycavalli, int myvelocita)
   {
     marca=mymarca;
     targa=mytarga;
     cavalli=mycavalli;
     stato=mystato;
     velocita=myvelocita;
   }
  */
  
  public String getTarga()
  {
    return this.targa;
  }

  public int getVelocita()
  {
    return this.velocita;
  }

  public void setTarga(String myTarga) // Metodo che valorizza l'attributo targa in base al parametro passato in input
  {
    targa = myTarga;
  }

  public void setVelocita(int myVelocita) // Metodo che valorizza l'attributo velocita in base al parametro passato in input
  {
    velocita = myVelocita;
  }

  //metodi
  void accendi()
  {
    stato=1;
    velocita=0;
  }

  void spegni()
  {
    stato=0;
    velocita=0;
  }

  void accelera(int incremento)
  {
    velocita=velocita+incremento;
  }

  void presentati()
  {
    System.out.println("la mia targa e' "+this.getTarga());
    System.out.println("la mia marca e' "+marca);if(stato==0)
      System.out.println("io sono spenta");
    else
      System.out.println("io sono accesa");
    System.out.println("la mia velocita e' "+this.getVelocita()+" km/h");
    
  }
}//fine classe 