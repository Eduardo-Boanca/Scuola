public class Cliente extends Thread {

    PopCorn popcorn;

    public Cliente(PopCorn pop, String nome) {
        this.popcorn = pop;
        setName(nome);
    }

    public void mangia() {

        synchronized (this.popcorn) {
            System.out.println("SONO QUI 1");

            while (popcorn.getEmpty()) {
                System.out.println("SONO QUI 2");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            popcorn.svuota();
            popcorn.setEmpty(true);
            notifyAll();

            System.out.println();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            mangia();

        System.out.println("Il cliente ha finito di mangiare.\n");
    }
}