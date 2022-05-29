public class Inserviente extends Thread {

    private PopCorn popcorn;

    public Inserviente(PopCorn pop, String nome) {
        this.popcorn = pop;
        setName(nome);
    }

    public void refill() {

        synchronized (this.popcorn) {
            while (!popcorn.getEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            popcorn.riempi();
            popcorn.setEmpty(false);
            notifyAll();

            System.out.println();
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            refill();

        System.out.println("I popcorn sono finiti.\n");
    }
}