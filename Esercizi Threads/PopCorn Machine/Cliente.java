public class Cliente extends Thread {

    private PopCorn popcorn;

    public Cliente(PopCorn pop, String nome) {
        this.popcorn = pop;
        setName(nome);
    }

    public void mangia() {

        synchronized (popcorn) {
            while (popcorn.getEmpty()) {
                try {
                    popcorn.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            popcorn.svuota(100);
            popcorn.notifyAll();
            System.out.println("Ho mangiato 100G di popcorn");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void run() {
        while (popcorn.running)
            mangia();

        System.out.println("Il cliente ha finito di mangiare.\n");
    }
}