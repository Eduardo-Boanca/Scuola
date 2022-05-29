public class Inserviente extends Thread {

    private PopCorn popcorn;

    public Inserviente(PopCorn popcorn, String nome) {
        this.popcorn = popcorn;
        setName(nome);
    }

    public synchronized void refill() {
        popcorn.riempi();

        while (!popcorn.getEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        popcorn.setEmpty(false);
        notifyAll();

        System.out.println();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            refill();

        System.out.println("I popcorn sono finiti.\n");
    }
}