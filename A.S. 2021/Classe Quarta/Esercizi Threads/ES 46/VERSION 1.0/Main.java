import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_RAND_NUM = 1000;
    public static final int TIME = 2000;
    
    public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        List<Factorial> factorials = new ArrayList<>();
        int numOfThread = 0;
        boolean correct = false;
        //Factorial numRand = new Factorial((int) Math.floor(Math.random() * (MAX_RAND_NUM + 1)));

        System.out.print("Inserisci il numero di fattoriali da calcolare: ");

        do {
            correct = false;
            try {
                numOfThread = Integer.valueOf(tastiera.readLine()).intValue();
            } catch (Exception e) {
                System.out.println("Input non corretto.");
                System.out.println("Reinserisci Numero.");
                correct = false;
            }
        }while(correct);

        

        for (int i = 0; i < numOfThread; i++) {
            factorials.add(new Factorial((int) Math.floor(Math.random() * (MAX_RAND_NUM + 1))));
            factorials.get(i).start();
        }

        try {
            // for(int i = 0; i < numOfThread; i++) {

            // }
            for (Factorial fattoriali : factorials) {
                fattoriali.join(TIME);
                if (fattoriali.isAlive())
                    System.out.println("The factorial of " + fattoriali.getFactorialNumber() + " is still in progress");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}