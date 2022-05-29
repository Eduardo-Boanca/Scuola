public class Cliente extends Thread {

    PopCorn popcorn;

    public Cliente(PopCorn popcorn, String nome) {
        this.pop = popcorn;
        setName(nome);
    }

    public synchronized void mangia() {
        popcorn.svuota();

        while (popcorn.getEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        popcorn.setEmpty(true);
        notifyAll();

        System.out.println();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            mangia();

        System.out.println("Il cliente ha finito di mangiare.\n");
    }
}