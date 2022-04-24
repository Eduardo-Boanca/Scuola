import java.math.*;

public class Factorial extends Thread {

    private GenerateFactorial num = new GenerateFactorial();
    private int numeroFattoriali;
    private BigInteger factorial = BigInteger.ONE;

    public Factorial(int numeroFattoriali) {
        this.numeroFattoriali = numeroFattoriali;
    }

    public void run() {
        for (int i = 1; i < num.getNumRand(); i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        System.out.println(Thread.currentThread().getName() + " has calculated the factorial of" + " (" + num.getNumRand() + ") " + "which is " + factorial);
    }
}
