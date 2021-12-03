import java.io.*;

public class MainPerson5 {

  public static int menu() {
    BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
    int scelta;
    boolean correct;
    scelta = 0;
    System.out.println("1 - Aggiungi persona nella lista");
    System.out.println("2 - Mostra la lista");
    System.out.println("3 - Aggiorna gli attributi della persona");
    System.out.println("4 - Rimuovi persona dalla lista");
    System.out.println("5 - Esci");
    System.out.print("Scelta: ");

    do {
      do {
        correct = false;
        try {
          scelta = Integer.valueOf(tastiera.readLine()).intValue();
          correct = true;
        } catch (Exception e) {
          System.out.println("Input non corretto!");
        }
      } while (!correct);
      if (scelta < 1 || scelta > 5) {
        System.out.println("Inserisci un valore compresto tra 1 e 5");
      }
    } while (scelta < 1 || scelta > 5);
    return scelta;
  }

  public static void main(String[] args) {

    // DataN date1 = new DataN("29", "11", "2003");
    // DataN date2 = new DataN("30", "1", "2004");
    // DataN date3 = new DataN("30", "11", "2003");
    // Person5 person = new Person5("Eduardo", "Boanca", "maschio", 17, "1.75",
    // false, date1);
    // Person5 person2 = new Person5("Nicole", "Bianchi", "femmina", 17, "1.67",
    // false, date2);
    // Person5 person3 = new Person5("Pietro", "Salvo", "maschio", 20, "1.67",
    // false, date3);
    // // Person3 person3 = new Person3(person);
    // ElencoPerson5 lista = new ElencoPerson5(30);
    BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
    Person5 person = new Person5();
    ElencoPerson5 elenco = new ElencoPerson5();
    DataN dataNascitaTMP = new DataN();
    int scelta;

    do {
      scelta = menu();
      switch (scelta) {
        case 1:
          try {
            System.out.println("Inserisci il nome della persona");
            person.setFirstName(tastiera.readLine());
            System.out.println("Inserisci il cognome della persona");
            person.setLastName(tastiera.readLine());
            System.out.println("Inserisci il sesso della persona");
            person.setGender(tastiera.readLine());
            System.out.println("Inserisci l'altezza della persona (es 1.75)");
            person.setHeight(tastiera.readLine());
            System.out.println("Inserisci il giorno di nascita della persona");
            dataNascitaTMP.setDay(tastiera.readLine());
            System.out.println("Inserisci il mese di nascita della persona");
            dataNascitaTMP.setMonth(tastiera.readLine());
            System.out.println("Inserisci l'ann di nascita della persona");
            dataNascitaTMP.setYear(tastiera.readLine());

          } catch (Exception e) {
            System.out.println("\nReinserisci i valori, quelli impostati non sono corretti");
          }

          if (elenco.addPerson(person) == 0) {
            System.out.println("Persona aggiunta con successo!");
          } else {
            System.out.println("Il vettore e' pieno!");
          }
          break;
        case 2:
          elenco.completeList();
          break;
        case 3:

          break;
        case 4:

          break;
      }
    } while (scelta != 5);

    // person.presentati();
    // System.out.println("\n");
    // person2.presentati();
    // System.out.println("\n");
    // person3.presentati();
    // System.out.println("\n");

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
