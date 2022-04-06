import java.util.*;
public class Main {
    public static boolean running = true;
    public static final int MAXNUMBER = 9999;
    public static final int MINNUMBER = 1;
    public static final int TIME = 100;
    public static void main(String[] args) {

        Random randNumber = new Random();
        Random randTime = new Random();
        int pass_code = randNumber.nextInt(MAXNUMBER);

        Thread AscendingHacker = new AscendingHacker(pass_code, MINNUMBER);
        Thread DescendingHacker = new DescendingHacker(pass_code, MAXNUMBER);
        Thread PoliceThread = new PoliceThread(randTime.nextInt(TIME));
        //Thread DichotomicHacker = new DichotomicHacker();

        Runtime.getRuntime().addShutdownHook(new MyShutdownHook());

        PoliceThread.setPriority(Thread.MAX_PRIORITY);
        AscendingHacker.start();
        DescendingHacker.start();
        //DichotomicHacker.start();
        PoliceThread.start();

        try {
            AscendingHacker.join();
            DescendingHacker.join();
            //DichotomicHacker.join();
            PoliceThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
