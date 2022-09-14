import java.math.*;

public class Factorial implements Runnable {
    // private int lowerLimit;
    // private int upperLimit;
    private int numeroFattoriali;
    private Thread ThreadFattoriale;

    public Factorial(int numeroFattoriali) {
        this.numeroFattoriali = numeroFattoriali;
        
        // this.ThreadFattoriale = new Thread(() -> {
        // // BigInteger valBigInteger = BigInteger.ONE;

        // for (BigInteger i = BigInteger.ONE;
        // i.compareTo(BigInteger.valueOf(numeroFattoriali)) <= 0; i
        // .add(BigInteger.ONE))
        // valBigInteger = valBigInteger.multiply(i);

        // System.out.println(Thread.currentThread().getName() + " ha calcolato il
        // fattoriale di " + numeroFattoriali
        // + " che vale " + valBigInteger);
        // }, "Thread-factorial(" + numeroFattoriali + ")");

        // for (int i = 1; i <= this.numeroFattoriali; i = i++)
        // valBigInteger = valBigInteger.multiply(BigInteger.valueOf(i));

        // System.out.println(Thread.currentThread().getName() + " ha calcolato il
        // fattoriale di " + numeroFattoriali
        // + " che vale " + valBigInteger);
        // }, "Thread-factorial(" + numeroFattoriali + ")");
        
    }

    public int getFactorialNumber() {
        return this.numeroFattoriali;
    }

    public void start() {
        this.ThreadFattoriale.start();
    }

    public void join(int millis) throws Exception {
        this.ThreadFattoriale.join(millis);
    }

    public boolean isAlive() {
        return this.ThreadFattoriale.isAlive();
    }

    public int getNumeroFattoriali() {
        return numeroFattoriali;
    }

    public void setNumeroFattoriali(int numeroFattoriali) {
        this.numeroFattoriali = numeroFattoriali;
    }

    public void run() {
        BigInteger valBigInteger = BigInteger.ONE;
        for (int i = 1; i <= this.numeroFattoriali; i++)// calcolo del fattoriale
        {
            valBigInteger = valBigInteger.multiply(BigInteger.valueOf(i));
            System.out.println(Thread.currentThread().getName() + " ha calcolato il fattoriale di " + numeroFattoriali);
               + " che vale " + valBigInteger);
        }
        this.ThreadFattoriale.setDaemon(true);
    }

}
