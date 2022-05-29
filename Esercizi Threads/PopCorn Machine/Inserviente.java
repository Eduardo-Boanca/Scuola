public class Inserviente extends Thread {

    private PopCorn popcorn;
    public static final int NUM_RICARICHE = 5;
    private int contatore;
    public static final int TEMPO_RICARICA = 2000;

    public Inserviente(PopCorn pop, String nome) {
        this.popcorn = pop;
        setName(nome);
    }

    public void refill() {
        synchronized (popcorn) {
            while (!popcorn.getEmpty()) {
                try {
                    popcorn.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            popcorn.riempi();
            for (int i = 0; i < TEMPO_RICARICA; i += 1000) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " sta riempiendo");
            }

            System.out.println("Ho finito di ricaricare");

            if (contatore == 0) {
                popcorn.running = false;
            }
            popcorn.notifyAll();

            System.out.println();
        }

    }

    @Override
    public void run() {
        for (contatore = NUM_RICARICHE; contatore >= NUM_RICARICHE; contatore--) {
            refill();
        }
        System.out.println("I popcorn sono finiti.\n");
    }
}