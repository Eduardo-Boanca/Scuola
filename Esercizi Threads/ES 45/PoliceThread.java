public class PoliceThread extends Thread implements Runnable {

    private int seconds;

    public PoliceThread(int TheSeconds) {
        this.seconds = TheSeconds;
        this.setName("Police");
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int TheSeconds) {
        this.seconds = TheSeconds;
    }

    @Override
    public void run() {
        boolean Police_Won = false;
        System.out.println("******The police is coming for the Hackers******");
        for (int i = this.seconds; i >= 0 && Main.running; i--) {
            if (i == 0)
                Police_Won = true;
            System.out.println("Remaining time before the police arrives: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (Police_Won == true)
            System.out.println("The Police arrived... it will be for the next time");
        Main.running = false;

    }
}
