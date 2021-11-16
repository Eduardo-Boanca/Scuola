public class Automobile
{//inizio classe

  //attributi
  private String targa; // aggiungendo private il programma si blocca
  private String marca;
  private int cavalli;
  private int stato; //stato di accensione 0=spento 1=acceso
  private int velocita;

  //costruttore di default
  public Automobile()
  {
    //...
  }

  //costruttore
  public Automobile(String myTarga, String myMarca, int myCavalli, int myStato, int myVelocita)
  {
    this.marca=myMarca; // this = di questo oggetto
    this.targa=myTarga;
    this.cavalli=myCavalli;
    this.stato=myStato;
    this.velocita=myVelocita;
  }

  public String getTarga()
  {
    return this.targa;
  }

  public int getVelocita()
  {
    return this.velocita;
  }

  public String getMarca()
  {
    return this.marca;
  }

  public int getStato()
  {
    return this.stato;
  }

  public int getCavalli()
  {
    return this.cavalli;
  }

  public void setTarga(String targa) // Metodo che valorizza l'attributo targa in base al parametro passato in input
  {
    this.targa = targa;
  }

  public void setVelocita(int myVelocita) // Metodo che valorizza l'attributo velocita in base al parametro passato in input
  {
    this.velocita = myVelocita;
  }

  public void setMarca(String myMarca)
  {
    this.marca = myMarca;
  }

  public void setStato(int myStato)
  {
    this.stato = myStato;
  }

  public void setCavalli(int myCavalli)
  {
    this.cavalli = myCavalli;
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

  boolean compareCar(Automobile auto, Automobile auto2)
  {
    if(auto.getTarga().equals(auto2.getTarga()) && auto.getMarca().equals(auto2.getMarca()) && auto.getStato()==auto2.getStato() &&
    auto.getCavalli()==auto2.getCavalli() && auto.getVelocita()==auto2.getVelocita())
    {
      return true; // in questo caso viene ritornato il valore true poiche' i due oggetti sono uguali
    }
    return false; // in questo caso viene ritornato il valore false poiche' i due oggetti sono diversi
  }

}//fine classe
