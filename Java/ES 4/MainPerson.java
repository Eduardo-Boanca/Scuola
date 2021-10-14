public class MainPerson
{
  public static void main(String[] args)
  {
    Person person = new Person("Eduardo", "Boanca", "maschio", 17, 1.75);
    Person person2 = new Person();
    person.presentati();
    person2.setFirstName("Alice");
    person2.setLastName("Rossi");
    person2.setGender("femmina");
    person2.setAge(18);
    person2.setHeight(1.70);
  }
}
