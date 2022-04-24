import java.io.*;

public class Main {
    public static final int MAX_RAND_NUM = 1000000;
    public static final int MIN_RAND_NUM = 0;
    public static final int TIME = 2000;

    public static void main(String[] args) throws InterruptedException {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int numOfThread = 0;
        int i = 0;
        boolean correct = false;
        GenerateFactorial num = new GenerateFactorial();

        System.out.print("Inserisci il numero di fattoriali da calcolare: ");

        do {
            try {
                numOfThread = Integer.valueOf(tastiera.readLine()).intValue();
            } catch (Exception e) {
                System.out.println("Input non corretto.");
                System.out.println("Reinserisci Numero.");
                correct = true;
            }
        } while (correct);

        Factorial[] factorials = new Factorial[numOfThread];

        for (i = 0; i < numOfThread; i++) {
            factorials[i] = new Factorial(i);
            factorials[i].setDaemon(true);
            factorials[i].start();

            try {
                factorials[i].join(TIME);
                if (factorials[i].isAlive()) {
                    System.out.println("The factorial of" + " (" + num.getNumRand() + ") " + "is still in progress");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
