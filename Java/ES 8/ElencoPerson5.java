import java.io.*;

public class ElencoPerson5 {
  BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
  private Person5[] elenco = new Person5[30];
  private int firstPosition;
  private int lengthMax;// grandezza massima
  private int lunghezzaElenco = 30;

  public ElencoPerson5() {
    Person5 person = new Person5();
    person.setFirstName("");
    for (int i = 0; i < lunghezzaElenco; i++) {
      this.elenco[i] = person;
    }
    this.firstPosition = 0;
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

  public void setFirstPosition(int pos) {
    this.firstPosition = pos;
  }

  public int addPerson(Person5 person) {
    int val = 0;

    if (this.firstPosition != 30) {
      this.elenco[this.firstPosition] = person;
      this.firstPosition += 1;
    } else {
      val = 1;
    }

    return val;
  }

  public void update(Person5 person, int posizione) {
    this.elenco[posizione - 1] = person;
  }

  public String readIndex(int pos) {
    String str = "";
    str = "La Persona in posizione" + pos + " è " + this.elenco[pos - 1].presentati();
    return str;
  }

  public String completeList()
    {
      String str = "";
      if(this.firstPosition == 0)
      {
        str = "Non sono presenti persone all'interno dell'elenco";
      }
      else
      {
        for(int i = 0; i < this.firstPosition; i++)
        {
          str += this.elenco[i].presentati() + "\n";         
        }
      }
      return str;
    }

  public void editPerson(int posizione, Person5 person) {
    this.elenco[posizione - 1] = person;
  }

  public void deletePerson(int numeroPersona, Person5 person) {
    Person5 person = new Person5();

  }
}
