public class DescendingHacker extends Thread {

    private int valueToStartFrom;
    private int pass_code;

    public DescendingHacker(int ThePass_code, int myValueToStartFrom) {
        this.pass_code = ThePass_code;
        this.valueToStartFrom = myValueToStartFrom;
        this.setName("DescendingHacker");
    }

    public int getValueToStartFrom() {
        return valueToStartFrom;
    }

    public void setValueToStartFrom(int myValueToStartFro) {
        this.valueToStartFrom = myValueToStartFro;
    }

    public int getPass_code() {
        return pass_code;
    }

    public void setPass_code(int ThePass_code) {
        this.pass_code = ThePass_code;
    }

    @Override
    public void run() {

        for (int i = this.valueToStartFrom; i >= this.pass_code && Main.running; i--) {
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (valueToStartFrom == this.pass_code) {
            System.out.println(
                    "The Password has been guessed by " + currentThread().getName() + ", it was: " + this.pass_code);
            Main.running = false;
        }
    }

    @Override
    public void start() {
        super.start();
        System.out.println("******Descending Hacker Started******");
    }

}