public class Inserviente extends Thread {

    private PopCorn popcorn;
    public static final int NUM_RICARICHE = 2;
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
            if (contatore == 0) {
                popcorn.running = false;
                popcorn.setEmpty(false);
            } else {
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
            }

            System.out.println();

            popcorn.notifyAll();
        }

    }

    @Override
    public void run() {
        for (contatore = NUM_RICARICHE; contatore >= 0; contatore--) {
            refill();
        }
        System.out.println("I popcorn sono finiti.\n");
    }
}