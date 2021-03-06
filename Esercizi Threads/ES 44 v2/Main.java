/**** MAIN ****/

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //fa partire 10 thread e fa il calcolo con numeri diversi
        for (int i = 1; i <= 10; i++) {
            Tabellina tabellina = new Tabellina(i);
            Thread thread = new Thread(tabellina);
            thread.start();
            //join() ogni esecuzione del thread aspetterà la fine
            //dell'esecuzione del thread precedente 
            //prima di eseguire il codice, questo rende l'esecuzione ordinata
            try {
                thread.join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
