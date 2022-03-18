import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {

    private String name, surname;
    private DataN dataNascita;

    public Persona(String name, String surname, String day, String month, String year) {
        this.name = name;
        this.surname = surname;
        dataNascita = new DataN(day, month, year);
    }

    public Persona() {
        dataNascita = new DataN();
    }

    public Persona(Persona persona) {
        this.name = persona.getName();
        this.surname = persona.getSurname();
        dataNascita = new DataN(persona.getDayBirth(), persona.getMonthBirth(), persona.getYearBirth());
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    /** 
     * @return String
     */
    public String getSurname() {
        return this.surname;
    }

    
    /** 
     * @param day
     */
    public void setDayBirth(String day) {
        this.dataNascita.setDay(day);
    }

    
    /** 
     * @return String
     */
    public String getDayBirth() {
        return dataNascita.getDay();
    }

    
    /** 
     * @param month
     */
    public void setMonthBirth(String month) {
        this.dataNascita.setMonth(month);
    }

    
    /** 
     * @return String
     */
    public String getMonthBirth() {
        return dataNascita.getMonth();
    }

    
    /** 
     * @param year
     */
    public void setYearBirth(String year) {
        this.dataNascita.setYear(year);
    }

    
    /** 
     * @return String
     */
    public String getYearBirth() {
        return dataNascita.getYear();
    }

    
    /** 
     * @return DataN
     */
    public DataN getDataNascita() {
        return this.dataNascita;
    }

    
    /** 
     * @param dataNascita
     */
    public void setDataNascita(DataN dataNascita) {
        this.dataNascita = dataNascita;
      }

    public void presentati() {
        System.out.printf("\nNome: %s", this.name);
        System.out.printf("\nCognome: %s", this.surname);
        System.out.printf("\nNato il %s/%s/%s\n\n", this.getDayBirth(), this.getMonthBirth(),
                this.getYearBirth());
    }

    
    /** 
     * @return boolean
     */
    public boolean isMaggiorenne() {
        // int compleyear = Integer.valueOf(getDataNascita());
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
     * @param person
     * @return int
     */
    public int compareTo(Persona person) {
        if (this.surname.compareTo(person.getSurname()) != 0)
            if (this.surname.compareTo(person.getSurname()) < 0)
                return -1;
            else
                return 1;
        else if (this.name.compareTo(person.getName()) == 0)
            return 0;
        else if (this.name.compareTo(person.getName()) < 0)
            return -1;
        else
            return 1;
    }

    
    /** 
     * @return boolean
     */
    public boolean checkDate() {
        return dataNascita.checkDate();
    }

    
    /** 
     * @return boolean
     */
    public boolean isEtaMaggiorenne() {
        return isMaggiorenne();
    }

}