public class MainPerson
{
  public static void main(String[] args)
  {
    Person2 person = new Person2("Eduardo", "Boanca", "maschio", 17, 1.75, false);
    Person2 person2 = new Person2();
    person.presentati();
    person.isDormendo();
    person2.setFirstName("Alice");
    person2.setLastName("Rossi");
    person2.setGender("femmina");
    person2.setAge(18);
    person2.setHeight(1.67);
    person2.setSleeping(true);
    person2.presentati();
    person2.isDormendo();
  }
}
