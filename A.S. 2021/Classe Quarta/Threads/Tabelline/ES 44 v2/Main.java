/**** MAIN ****/

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //fa partire 10 thread e fa il calcolo con numeri diversi
        for (int i = 1; i <= 10; i++) {
            Tabellina tabellina = new Tabellina(i);
            Thread threads = new Thread(tabellina);
            threads.start();
            //join(), il thread aspetterà finché lo stesso thread
            //ha finito la sua esecuzione e quindi il thread successivo
            //può iniziare la sua esecuzione, rendendo l’esecuzione ordinata
            try {
                threads.join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
