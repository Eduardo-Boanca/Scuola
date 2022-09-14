import java.io.*;

public class Main {
    public static final int MAX_RAND_NUM = 100000;
    public static final int MIN_RAND_NUM = 0;
    public static final int TIME = 2000;

    public static void main(String[] args) throws InterruptedException {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int numOfThread = 0;
        int i = 0;
        boolean correct;

        System.out.print("Inserisci il numero di fattoriali da calcolare: ");

        do {
            correct = false;
            try {
                numOfThread = Integer.valueOf(tastiera.readLine()).intValue();
                if(numOfThread < 1) {
                    System.out.println("Non puoi inserire un numero minore di 1");
                    System.out.print("Inserisci il numero di fattoriali da calcolare: ");
                } else  
                    correct = true;

            } catch (Exception e) {
                System.out.println("Input non corretto.");
                System.out.print("Reinserisci Numero:");
            }
        } while (!correct);

        Factorial[] factorials = new Factorial[numOfThread];

        for (i = 0; i < numOfThread; i++) {
            GenerateFactorial numero = new GenerateFactorial();
            factorials[i] = new Factorial(numero.getNumRand());
            factorials[i].setDaemon(true);
            factorials[i].start();

            try {
                factorials[i].join(TIME);
                if (factorials[i].isAlive()) {
                    System.out.println("The factorial of" + " (" + numero.getNumRand() + ") " + "is still in progress");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
