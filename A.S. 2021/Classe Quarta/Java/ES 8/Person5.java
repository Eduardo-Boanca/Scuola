import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * calsse person5
 */
public class Person5 {// inizio classe

  
  // attributi
  private String firstName, lastName, gender;
  private int age;
  private String height;
  boolean sleeping;
  private DataN dataNascita;

  /**
   * Costruttore default
   */
  public Person5() {

  }

  /**
   * 
   * @param person persona
   */
  public Person5(Person5 person) {
    this.firstName = person.getFirstName();
    this.lastName = person.getLastName();
    this.gender = person.getGender();
    this.age = person.getAge();
    this.height = person.getHeight();
    this.sleeping = person.getSleeping();
    this.dataNascita = person.getDataNascita();
  }

  /**
   * 
   * @param myFirstName nome
   * @param myLastName cognome
   * @param myGender gender
   * @param myAge eta
   * @param myHeight altezza
   * @param MySleeping dormire
   * @param MyDataNascita data di nascita
   */
  // costruttore
  public Person5(String myFirstName, String myLastName, String myGender, int myAge, String myHeight, boolean MySleeping,
      DataN MyDataNascita) {
    this.firstName = myFirstName;
    this.lastName = myLastName;
    this.gender = myGender;
    this.age = myAge;
    this.height = myHeight;
    this.sleeping = MySleeping;
    this.dataNascita = MyDataNascita;
  }

  
  /** 
   * @return String
   */
  public String getFirstName() {
    return this.firstName;
  }

  
  /** 
   * @return String
   */
  public String getLastName() {
    return this.lastName;
  }

  
  /** 
   * @return String
   */
  public String getGender() {
    return this.gender;
  }

  
  /** 
   * @return int
   */
  public int getAge() {
    return this.age;
  }

  
  /** 
   * @return String
   */
  public String getHeight() {
    return this.height;
  }

  
  /** 
   * @return boolean
   */
  public boolean getSleeping() {
    return this.sleeping;
  }

  
  /** 
   * @return DataN
   */
  public DataN getDataNascita() {
    return this.dataNascita;
  }

  
  /** 
   * @param firstName nome
   */
  public void setFirstName(String firstName)// Metodo che valorizza l'attributo targa in base al parametro passato in
                                            // input
  {
    this.firstName = firstName;
  }

  
  /** 
   * @param lastName cognome
   */
  public void setLastName(String lastName) // Metodo che valorizza l'attributo velocita in base al parametro passato in
                                           // input
  {
    this.lastName = lastName;
  }

  
  /** 
   * @param gender gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /** 
   * @param age età
   */
  public void setAge(int age) {
    this.age = age;
  }

  
  /** 
   * @param string stringa
   */
  public void setHeight(String string) {
    this.height = string;
  }

  
  /** 
   * @param sleeping variabile per vedere se dorme
   * @return boolean
   */
  public boolean setSleeping(boolean sleeping) {
    return this.sleeping = sleeping;
  }

  
  /** 
   * @param dataNascita data di nascita
   */
  public void setDataNascita(DataN dataNascita) {
    this.dataNascita = dataNascita;
  }

  
  /** 
   * @return String
   */
  // metodi
  public String presentati() {
    String str = "";
    str += "Il mio nome è " + this.getFirstName();
    str += "Il mio cognome è " + this.getLastName();
    str += "Sono un " + this.getGender();
    str += "Ho " + this.getAge() + " anni";
    str += "Sono alto " + this.getHeight() + "cm";
    str += "Sono nato il " + this.getDataNascita().toString();
    return str;
  }

  
  /** 
   * @return boolean
   */
  boolean isDormendo() {
    if (this.getSleeping() == true)
      System.out.println("Ora sto dormendo");
    else
      System.out.println("Ora non to dormendo");
    return sleeping;
  }

  
  /** 
   * @param person persona
   * @return boolean
   */
  public boolean isEqual(Person5 person) {
    if (this.firstName.equals(person.getFirstName()) && this.lastName.equals(person.getLastName())
        && this.gender.equals(person.getGender()) && this.age == person.getAge() && this.height == person.getHeight())
      return true;
    else
      return false;
  }

  
  /** 
   * @param person persona
   * @return int
   */
  public int compareTo(Person5 person) {
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

  
  /** 
   * @return boolean
   */
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

  
  /** 
   * @param person2 persona
   * @return int
   */
  public int olderThan(Person5 person2) {
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
