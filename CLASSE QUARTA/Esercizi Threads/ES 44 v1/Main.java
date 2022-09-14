/**** MAIN ****/

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //fa partire 10 thread e fa il calcolo con numeri diversi
        for (int i = 1; i <= 10; i++) {
            Tabellina tabellina = new Tabellina(i);
            Thread thread = new Thread(tabellina);
            thread.start();
        }
    }
}
