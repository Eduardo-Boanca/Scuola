import java.io.BufferedReader;
import java.io.InputStreamReader;

/*----------------------------------------------------------------------------------------------------
Eduardo Boanca 4C Informatica 1/10/2021
ES 2: Effettuare l'input di un numero N che dica con quante persone si svolge l'input.
Gestire l'eccezione in caso di input non numerico quando necessario.
Calcolo al fondo della media delle età in una variabile di tipo Float.    
Opzionale : Dire di quale persona si sta facendo l'input (Es. "Inserire l'età della persona numero: 5").
Opzionale : Dire quale persona è più vecchia/giovane.
-----------------------------------------------------------------------------------------------------*/

public class esercizio {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        int n = 0, età = 0, min = 120, max = 0, err = 0;
        float media = 0;

        do {

            System.out.print("Salve, inserisca il numero di persone di cui si vuole fare la media: "); //ho tolto ln dal print per fare input su stessa riga
            try 
            {
                err = 0;
                String numeroLetto = tastiera.readLine();
                n = Integer.valueOf(numeroLetto).intValue();

            } 
            catch (Exception e) 
            {
                System.out.println("\nNON HAI INSERITO UN NUMERO");
                err = 1;
            }
        } while (err == 1 || n < 2); //n deve essere maggiore di due perche non ha senso fare la media di una persona

        for (int i = 1; i <= n; i++) {

            do {
                System.out.println("Persona " + i);
                System.out.print("Età: ");//ho tolto ln dal print per fare input su stessa riga
                try 
                {
                    err = 0;
                    String numeroLetto = tastiera.readLine();
                    età = Integer.valueOf(numeroLetto).intValue();
                    err = 0;
                } 
                catch (Exception e) 
                {
                    System.out.println("\nNON HAI INSERITO UN NUMERO");
                    err = 1;
                }
            } while (err == 1);

            media = media + età;
            if (età < min)
                min = età;
            if (età > max)
                max = età;
        }

        media = media / n;
        System.out.println("La media dell'età è " + media);
        System.out.println("La persona più anziana ha l'età di " + max);
        System.out.println("La persona più giovane ha l'età di " + min);

    }
}