public class MainPerson3 {
  public static void main(String[] args) {

    DataN date1 = new DataN("30", "11", "2003");
    DataN date2 = new DataN("28", "2", "2001");
    DataN date3 = new DataN("13", "2", "1997");
    Person3 person = new Person3("Eduardo", "Boanca", "maschio", 17, 1.75, false, date1);
    Person3 person2 = new Person3("Nicole", "Bianchi", "femmina", 17, 1.67, false, date2);
    Person3 person3 = new Person3("Pietro", "Salvo", "maschio", 20, 1.67, false, date3);
    // Person3 person3 = new Person3(person);

    // person.presentati();
    // System.out.println("\n");
    // person2.presentati();
    // System.out.println("\n");
    // person3.presentati();
    // System.out.println("\n");

    if (person.isMaggiorenne() == true)
      System.out.println("La persona è maggiorenne");
    else
      System.out.println("La persona è minorenne");

    if (person2.isMaggiorenne() == true)
      System.out.println("La persona è maggiorenne");
    else
      System.out.println("La persona è minorenne");

    if (person3.isMaggiorenne() == true)
      System.out.println("La persona è maggiorenne");
    else
      System.out.println("La persona è minorenne");

    // if (date1.checkDate())
    // System.out.println("La data1 è giusta");
    // else
    // System.out.println("La data1 è sbagliata");

    // if (date2.checkDate())
    // System.out.println("La data2 è giusta");
    // else
    // System.out.println("La data2 è sbagliata");

    // if (date3.checkDate())
    // System.out.println("La data2 è giusta");
    // else
    // System.out.println("La data2 è sbagliata");

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
