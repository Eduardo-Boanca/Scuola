import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;

public class CSVReaderFile {

    public static void main(String[] args) throws IOException {

        boolean firstLine = true;
        ArrayList<String> Dati = new ArrayList<String>();
        
        try (CSVReader reader = new CSVReader(new FileReader("MezziPubblici_tutti.csv"))) {
            String[] lineInArray;

            lineInArray = reader.readNext();
            int colIndex = Arrays.asList(lineInArray).indexOf("9.14 - Dopo lo scoppio della pandemia, hai cambiato il mezzo utilizzato?");
            

            while ((lineInArray = reader.readNext()) != null) {
                    Dati.add(lineInArray[colIndex]);
                    System.out.println("\n" + Dati);

                
            }
        }

    }
}