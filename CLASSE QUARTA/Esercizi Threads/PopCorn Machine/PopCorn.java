public class PopCorn {

    private int quantity;
    private boolean empty;
    public static final int MACHINE_QUANTITY = 1000;
    public volatile boolean running;

    public PopCorn() {
        this.quantity = 0;
        this.empty = true;
        this.running = true;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean getEmpty() {
        return this.empty;
    }

    public synchronized void svuota(int popCorn) {
        quantity -= popCorn;

        if (quantity == 0) {
            this.empty = true;
        }
    }

    public synchronized void riempi() {
        quantity = MACHINE_QUANTITY;
        this.empty = false;
    }

}
