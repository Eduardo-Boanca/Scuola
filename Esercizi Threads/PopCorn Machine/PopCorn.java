public class PopCorn {

    private int quantity;
    private boolean empty;
    public static final int MACHINE_QUANTITY = 1000;

    public PopCorn() {
        this.quantity = 0;
        this.empty = true;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean getEmpty() {
        return this.empty;
    }

    public synchronized void svuota() {
        for (int i = quantity; i >= 0; i -= PopCorn.MACHINE_QUANTITY / 10) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            quantity = i;

            System.out.println(Thread.currentThread().getName() + " sta svuotando");
        }
    }

    public synchronized void riempi() {
        for (int i = 0; i <= PopCorn.MACHINE_QUANTITY; i += PopCorn.MACHINE_QUANTITY / 10) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            quantity = i;
            System.out.println(Thread.currentThread().getName() + " sta riempiendo");
        }
    }

}
