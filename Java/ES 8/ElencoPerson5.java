import java.io.*;

public class ElencoPerson5 {
    private Person5[] elenco;
    private int lengthMax;// grandezza massima
    private int lunghezzaElenco;

    public ElencoPerson5(int MaxLength) {
        this.elenco = new Person5[MaxLength];
        this.lengthMax = MaxLength;
        this.lunghezzaElenco = 0;
    }

    public ElencoPerson5(Person5[] oggetto) {
        elenco = new Person5[oggetto.length];
        this.lengthMax = oggetto.length;
        this.lunghezzaElenco = 0;
        for (int i = 0; i < oggetto.length && i < lengthMax; i++) {
            this.elenco[i] = oggetto[i];
            this.lunghezzaElenco++;
        }
    }

    public int getLength() {
        return this.lunghezzaElenco;
    }

    public int getMaxLength() {
        return this.lengthMax;
    }

    public Person5 getPerson(int position) {
        return this.elenco[position];
    }

    public ElencoPerson5(ElencoPerson5 oggetto) {
        elenco = new Person5[oggetto.getLength()];
        this.lengthMax = oggetto.getMaxLength();
        this.lunghezzaElenco = 0;
        for (int i = 0; i < oggetto.getLength(); i++) {
            this.elenco[i] = oggetto.getPerson(i);
            this.lunghezzaElenco++;
        }
    }

    public void setElenco(Person5[] oggetto) {
        for (int i = 0; i < oggetto.length; i++)
            this.elenco[i] = oggetto[i];
    }

    public Person5[] getElenco() {
        return this.elenco;
    }

    public boolean equals(ElencoPerson5 oggetto) {
        boolean result;
        if (this.getLength() == oggetto.getLength()) {
            result = true;
            for (int i = 0; i < oggetto.getLength(); i++)
                if (this.elenco[i].equals(oggetto.elenco[i]) == false)
                    result = false;
        } else
            result = false;
        return result;

    }

    public void addPerson(Person5 oggetto) {
        if (this.lunghezzaElenco < this.lengthMax) {
            this.elenco[lunghezzaElenco] = oggetto;
            this.lunghezzaElenco++;
        } else
            System.out.println("\nNon è possibile aggiungere altre persone, la lista è piena!\n");
    }

    public void readList() {
        if (this.lunghezzaElenco > 0) {
            for (int i = 0; i < this.lunghezzaElenco; i++) {
                System.out.printf("Persona %d\n", (i + 1));
                this.elenco[i].presentati();
                System.out.println("\n");
            }
        }
        else
            System.out.print("\nLa lista è vuoi, prima riempila\n");
    }


    public void editPerson(int posizione, Person5 person) {
            this.elenco[posizione-1] = person;
            BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Inserisci il nuovo nome della persona");
                person.setFirstName(tastiera.readLine());
      
                System.out.println("Inserisci il nuovo cognome della persona");
                person.setLastName(tastiera.readLine());
      
                System.out.println("Inserisci il nuovo sesso della persona");
                person.setGender(tastiera.readLine());
      
                System.out.println("Inserisci la nuova altezza in metri (es 1.76) della persona");
                person.setHeight(tastiera.readLine());
      
                System.out.println("Inserisci la nuova data di nascita della persona");
                person.getDataNascita().setDataNascita(tastiera.readLine());

                System.out.print("\nInserisci la posizione da aggiornare: ");
                posizione = Integer.valueOf(tastiera.readLine());
              
              } catch (Exception e) {
                System.out.println("Reinserisci i valori facendo più attenzione");
              }
    }

    public void deletePerson(int numeroPersona) {
        if (numeroPersona <= this.lunghezzaElenco && numeroPersona > 0) {
            for (int i = numeroPersona - 1; i < this.lunghezzaElenco; i++)
                this.elenco[i] = this.elenco[i + 1];
            lunghezzaElenco--;
        } else
            System.out.println("\nNon ci sono più persone nell'elenco\n");
    }
}
