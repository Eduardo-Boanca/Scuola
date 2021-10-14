public class Person
{//inizio classe

  //attributi
  private String firstName, lastName, gender;
  private int age;
  private double height;

  //costruttore di default
  public Person()
  {
    //...
  }

  //costruttore
  public Person(String myFirstName, String myLastName, String myGender, int myAge, double myHeight)
  {
    this.firstName = myFirstName;
    this.lastName = myLastName;
    this.gender = myGender;
    this.age = myAge;
    this.height = myHeight;
  }

  public String getFirstName()
  {
    return this.firstName;
  }

  public String getLastName()
  {
    return this.lastName;
  }

  public String getGender()
  {
    return this.gender;
  }

  public int getAge()
  {
    return this.age;
  }

  public double getHeight()
  {
    return this.height;
  }

  public void setFirstName(String firstName)// Metodo che valorizza l'attributo targa in base al parametro passato in input
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) // Metodo che valorizza l'attributo velocita in base al parametro passato in input
  {
    this.lastName = lastName;
  }

  public void setGender(String gender)
  {
    this.gender = gender;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setHeight(double d)
  {
    this.height = d;
  }


  //metodi
  void presentati()
  {
    System.out.println("Il mio nome è "+this.getFirstName());
    System.out.println("Il mio cognome è "+ this.getLastName());
    System.out.println("Sono un "+this.getGender());
    System.out.println("Ho "+this.getAge() +"anni");
    System.out.println("Sono alto "+this.getHeight() +"cm");

  }
}//fine classe
