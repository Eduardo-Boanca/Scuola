public class MainPerson2
{
  public static void main(String[] args)
  {
    Person2 person = new Person2("Eduardo", "Boanca", "maschio", 17, 1.75, false);
    Person2 person2 = new Person2("Nicole", "Bianchi", "femmina", 17, 1.67, false);
    Person2 person3 = new Person2(person);

    person.presentati();
    person2.presentati();
    person3.presentati();

    if(person.equals(person2))
      System.out.println("La prima persona è uguale alla seconda persona");
    else
      System.out.println("La prima persona non è uguale alla seconda persona");

    if(person.equals(person3))
      System.out.println("La prima persona è uguale alla terza persona");
    else
      System.out.println("La prima persona non è uguale alla terza persona");

    if(person2.equals(person3))
      System.out.println("La seconda persona è uguale alla terza persona");
    else
      System.out.println("La seconda persona non è uguale alla terza persona");
    
    if(person.compareTo(person2)==0)
      System.out.println("Nell'ordine alfabetico sono nella stessa posizione");
    else
      if(person.compareTo(person2)<0)
        System.out.println("La prima persona nell'ordine alfabetico si trova prima della seconda persona");
      else
        System.out.println("La seconda nell'ordine alfabetico si trova prima della prima persona'");

    if(person.compareTo(person3)==0)
      System.out.println("Nell'ordine alfabetico sono nella stessa posizione");
    else
      if(person.compareTo(person3)<0)
        System.out.println("La prima persona nell'ordine alfabetico si trova prima della terza persona");
      else
        System.out.println("La terza nell'ordine alfabetico si trova prima della prima persona'");
  }
}
