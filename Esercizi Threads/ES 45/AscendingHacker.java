public class AscendingHacker extends Thread {

    private int valueToStartFrom;
    private int pass_code;

    public AscendingHacker(int ThePass_code, int myValueToStartFrom) {
        this.pass_code = ThePass_code;
        this.valueToStartFrom = myValueToStartFrom;
        this.setName("AscendingHacker");
    }

    public int getValueToStartFrom() {
        return this.valueToStartFrom;
    }

    public void setValueToStartFrom(int myValueToStartFro) {
        this.valueToStartFrom = myValueToStartFro;
    }

    public int getPass_code() {
        return this.pass_code;
    }

    public void setPass_code(int ThePass_code) {
        this.pass_code = ThePass_code;
    }

    @Override
    public void run() {
        boolean passGuessed = false;
        for (int i = this.valueToStartFrom; i <= this.pass_code && Main.running; i++) {
            if(i == this.pass_code)
                passGuessed = true;
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (passGuessed == true) 
            System.out.println("The Password has been guessed by " + currentThread().getName() + ", it was: " + getPass_code());
        Main.running = false;
    }

    @Override
    public void start() {
        System.out.println("ASCENDING TYPE HACKER STARTED");
        super.start();
    }

}