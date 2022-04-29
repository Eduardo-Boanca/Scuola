import java.io. *;    
import java.util.List;   
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


//main
public class Main2 {
  public static void main(String args[]) {
    Lista l = new Lista();//Crea l'oggetto p di classe persona
    String nome="";
    String cognome="";
    Persona p = new Persona();
    String stringa1 = "";
    int indice1 = 0;
    boolean controllo1 = false;
    do {
      do {
        do {
          controllo1 = false;
          Function.clearConsole(); // metodo che pulisce lo schermo
          System.out.println("Menu' generale\n");
          System.out.println("1) Inserisci persona\n");
          System.out.println("2) Elimina persona\n");
          System.out.println("3) Cerca persona\n");
          System.out.println("4) Visualizza lista delle persone\n");
          System.out.println("5) Import json\n");
          System.out.println("6) Import csv\n");
          System.out.println("7) Export json\n");
          System.out.println("8) Export csv\n");
          System.out.println("9) Esci dal programma\n");
          System.out.print("\nInserire il numero --> ");
          InputStreamReader input = new InputStreamReader(System.in);
          BufferedReader tastiera = new BufferedReader(input);
          try {
            stringa1 = tastiera.readLine();
            indice1 = Integer.parseInt(stringa1);
          } catch (Exception e) {
            Function.clearConsole();
            System.out.println("Il numero non e' esatto\n");
            controllo1 = true;
          }
        } while (controllo1 == true);
      } while (indice1 < 1 || indice1 > 9);

      switch (indice1) {
        case 1: {
          nome=p.input_nome();
          cognome=p.input_cognome();
          Persona p_ = new Persona(nome,cognome);
          //String nome_cognome=nome+" "+cognome;
          Function.clearConsole();
          l.inserisci(p_);
          Function.clearConsole();
          Function.pause();
          break;
        }
        case 2: {
          Function.clearConsole();
          nome=p.input_nome();
          cognome=p.input_cognome();
          Persona p_ = new Persona(nome,cognome);
          //String nome_cognome=nome+" "+cognome;
          l.elimina(p_);
          Function.pause();
          break;
        }
        case 3: {
          Function.clearConsole();
          nome=p.input_nome();
          cognome=p.input_cognome();
          Persona p_ = new Persona(nome,cognome);
          //String nome_cognome=nome+" "+cognome;
          l.contiene(p_);
          Function.pause();
          break;
        }
        case 4: {
          Function.clearConsole();
          l.stampa();
          Function.pause();
          break;
        }
        case 5: {
          Function.clearConsole();
          /*
          JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("Import.json"))
        {
            Object obj = jsonParser.parse(reader);
 
            JSONArray persona = (JSONArray) obj;
          
              for (int i = 0; i < persona.size(); i++){ 
           JSONObject employeeObject = (JSONObject) persona.get(i);
        
        nome = (String) employeeObject.get("nome");    
         
     
         cognome = (String) employeeObject.get("cognome");  
        Persone p_in = new Persone (nome,cognome);
        l.inserisci(p_in);
        
        }
    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */
          Function.pause();
          break;
        }
        case 6: {
          Function.clearConsole();

        String csvFile = "Import.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] pp = line.split(cvsSplitBy);

                System.out.println("Nome : " + pp[0] + " , Cognome : " + pp[1] );
                //String ppp = pp[0] + " " + pp[1];
                Persona ppp = new Persona(pp[0],pp[1]);
                l.inserisci(ppp);
                System.out.println("Inserimento riuscito");
                Function.pause();
                Function.clearConsole();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
          break;
        }
        case 7: {
          Function.clearConsole();
          /*
          JSONArray nome_completo = new JSONArray();
          nome=p.input_nome();
          cognome=p.input_cognome();
          String nome_cognome=nome+" "+cognome;
          //nome_completo.put("nome completo", nome_cognome);
          nome.add("nome");
          cognome.add();
          String my_file = "Export.json";
          try
          {
		      FileWriter file = new FileWriter(my_file);

            file.write(nome_completo.toJSONString());
            file.flush();

          } catch (IOException e)
          {
            e.printStackTrace();
          }

        System.out.print(nome_completo);
        */
          Function.pause();
          break;
        }
        case 8: {
          Function.clearConsole();
          try(FileWriter myWriter = new FileWriter("Export.csv"))
        { 
                myWriter.append("Nome,Cognome\n");
                Nodo temp = l.getTesta();
                do
                {
                    myWriter.write(temp.getDato().getNome()+","+temp.getDato().getCognome());
                    temp=temp.getSuccessivo();
                }while(temp!=null);
            myWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("File non trovato");
        }  
          Function.pause();
          break;
        }
      }
      Function.clearConsole();
    } while (indice1 < 9);
  }
}
