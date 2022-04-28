import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;

public class CSVReaderFile {

    public static void main(String[] args) throws IOException {

        boolean firstLine = true;
        ArrayList<String> Dati = new ArrayList<String>();

        try (CSVReader reader = new CSVReader(new FileReader("MezziPubblici_tutti.csv"))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                } else {
                    Dati.add(lineInArray[41]);
                    System.out.println(Dati);
                    // System.out.println("Data e Ora " + lineInArray[0] + "      Codice Postale " + lineInArray[1]
                    //         + "     Sesso " + lineInArray[2]);
                }
            }
        }

    }
}