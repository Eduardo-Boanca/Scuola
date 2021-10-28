public class MainPerson2 {
  public static void main(String[] args) {
    Person2 person = new Person2("Eduardo", "Boanca", "maschio", 17, 1.75, false);
    Person2 person2 = new Person2("Nicole", "Bianchi", "femmina", 17, 1.67, false);
    Person2 person3 = new Person2(person);
    DataN date1 = new DataN("30", "11", "2003");
    DataN date2 = new DataN("21", "Gennaio", "2003");

    person.presentati();
    person2.presentati();
    person3.presentati();

    if (date1.checkDate())
      System.out.println("La data1 è giusta");
    else
      System.out.println("La data1 è sbagliata");

    if (date2.checkDate())
      System.out.println("La data2 è giusta");
    else
      System.out.println("La data2 è sbagliata");

    // if(person.equals(person2))
    // System.out.println("La prima persona è uguale alla seconda persona");
    // else
    // System.out.println("La prima persona non è uguale alla seconda persona");

    // if(person.equals(person3))
    // System.out.println("La prima persona è uguale alla terza persona");
    // else
    // System.out.println("La prima persona non è uguale alla terza persona");

    // if(person2.equals(person3))
    // System.out.println("La seconda persona è uguale alla terza persona");
    // else
    // System.out.println("La seconda persona non è uguale alla terza persona");

    // if(person.compareTo(person2)==0)
    // System.out.println("Nell'ordine alfabetico sono nella stessa posizione");
    // else
    // if(person.compareTo(person2)<0)
    // System.out.println("La prima persona nell'ordine alfabetico si trova prima
    // della seconda persona");
    // else
    // System.out.println("La seconda nell'ordine alfabetico si trova prima della
    // prima persona'");

    // if(person.compareTo(person3)==0)
    // System.out.println("Nell'ordine alfabetico sono nella stessa posizione");
    // else
    // if(person.compareTo(person3)<0)
    // System.out.println("La prima persona nell'ordine alfabetico si trova prima
    // della terza persona");
    // else
    // System.out.println("La terza nell'ordine alfabetico si trova prima della
    // prima persona'");

  }
}
