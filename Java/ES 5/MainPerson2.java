public class MainPerson2
{
  public static void main(String[] args)
  {
    Person2 person = new Person2("Eduardo", "Boanca", "maschio", 17, 1.75, false);
    Person2 person2 = new Person2("Nicole", "Bianchi", "femmina", 17, 1.67, false);
    Person2 person3 = new Person2(person2);
    
    if(person.comparePerson(person, person2) == true) 
    {
      System.out.println("Queste due persone sono uguali");
    }
    else
    {
      System.out.println("Queste due persone non sono uguali");
    }
  }
}
