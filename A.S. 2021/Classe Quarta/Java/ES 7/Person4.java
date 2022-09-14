
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Person4 {// inizio classe

  // attributi
  private String firstName, lastName, gender;
  private int age;
  private double height;
  boolean sleeping;
  private DataN dataNascita;

  public Person4() {

  }

  public Person4(Person4 person) {
    this.firstName = person.getFirstName();
    this.lastName = person.getLastName();
    this.gender = person.getGender();
    this.age = person.getAge();
    this.height = person.getHeight();
    this.sleeping = person.getSleeping();
    this.dataNascita = person.getDataNascita();
  }

  // costruttore
  public Person4(String myFirstName, String myLastName, String myGender, int myAge, double myHeight, boolean MySleeping,
      DataN MyDataNascita) {
    this.firstName = myFirstName;
    this.lastName = myLastName;
    this.gender = myGender;
    this.age = myAge;
    this.height = myHeight;
    this.sleeping = MySleeping;
    this.dataNascita = MyDataNascita;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getGender() {
    return this.gender;
  }

  public int getAge() {
    return this.age;
  }

  public double getHeight() {
    return this.height;
  }

  public boolean getSleeping() {
    return this.sleeping;
  }

  public DataN getDataNascita() {
    return this.dataNascita;
  }

  public void setFirstName(String firstName)// Metodo che valorizza l'attributo targa in base al parametro passato in
                                            // input
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) // Metodo che valorizza l'attributo velocita in base al parametro passato in
                                           // input
  {
    this.lastName = lastName;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public boolean setSleeping(boolean sleeping) {
    return this.sleeping = sleeping;
  }

  public void setDataNascita(DataN dataNascita) {
    this.dataNascita = dataNascita;
  }

  // metodi
  void presentati() {
    System.out.println("Il mio nome è " + this.getFirstName());
    System.out.println("Il mio cognome è " + this.getLastName());
    System.out.println("Sono un " + this.getGender());
    System.out.println("Ho " + this.getAge() + " anni");
    System.out.println("Sono alto " + this.getHeight() + "cm");
    System.out.println("Sono nato il " + this.getDataNascita().toString());
  }

  boolean isDormendo() {
    if (this.getSleeping() == true)
      System.out.println("Ora sto dormendo");
    else
      System.out.println("Ora non to dormendo");
    return sleeping;
  }

  public boolean isEqual(Person4 person) {
    if (this.firstName.equals(person.getFirstName()) && this.lastName.equals(person.getLastName())
        && this.gender.equals(person.getGender()) && this.age == person.getAge() && this.height == person.getHeight())
      return true;
    else
      return false;
  }

  public int compareTo(Person4 person) {
    if (this.lastName.compareTo(person.getLastName()) != 0)
      if (this.lastName.compareTo(person.getLastName()) < 0)
        return -1;
      else
        return 1;
    else if (this.firstName.compareTo(person.getFirstName()) == 0)
      return 0;
    else if (this.firstName.compareTo(person.getFirstName()) < 0)
      return -1;
    else
      return 1;
  }

  public boolean isMaggiorenne() {
    // int compleanno = Integer.valueOf(getDataNascita());
    int mese = Integer.valueOf(getDataNascita().getMonth());
    int giorno = Integer.valueOf(getDataNascita().getDay());
    int anno = Integer.valueOf(getDataNascita().getYear());
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(anno, mese, giorno);

    Period periodo = Period.between(birthday, today);
    long totalDays = ChronoUnit.DAYS.between(birthday, today);
    System.out.println("Tu hai " + periodo.getYears() + " anni, " + periodo.getMonths() + " mesi, e "
        + periodo.getDays() + " giorni. (" + totalDays + " giorni totali)");

    if (periodo.getYears() >= 18)
      return true;
    else
      return false;
  }


  public int olderThan(Person4 person2) {
    int result = 0;
    String birth = this.dataNascita.toString();
    String birth2 = person2.dataNascita.toString();
    result = birth.compareTo(birth2);
    if (result == 0)
      System.out.println("L'età è la stessa");
    if (result < 0)
      System.out.println("La prima persona è più vecchia");
    if (result > 0)
      System.out.println("La prima persona è più giovane");
    return result;
  }



}// fine classe
