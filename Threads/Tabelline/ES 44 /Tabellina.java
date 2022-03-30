public class Tabellina implements Runnable {

    private int numero;

    public Tabellina(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), numero, i, i * numero);
        }
    }
}