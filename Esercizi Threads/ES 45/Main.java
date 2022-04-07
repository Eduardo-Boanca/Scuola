import java.util.*;

public class Main {
    public static boolean running = true;
    public static final int MAXNUMBER = 9999;
    public static final int MINNUMBER = 1;
    public static final int TIME = 100;

    public static void main(String[] args) {

        Random randNumber = new Random();
        int randTime = (int) (Math.random() * TIME);
        int pass_code = randNumber.nextInt(MAXNUMBER);

        Thread AscendingHacker = new AscendingHacker(pass_code, MINNUMBER);
        Thread DescendingHacker = new DescendingHacker(pass_code, MAXNUMBER);
        Thread Police = new PoliceThread(randTime);
        Thread DichotomicHacker = new DichotomicHacker(pass_code, MAXNUMBER, MINNUMBER);

        Runtime.getRuntime().addShutdownHook(new MyShutdownHook());

        // Police.setPriority(Thread.NORM_PRIORITY);
        // DescendingHacker.setPriority(Thread.MIN_PRIORITY);
        // AscendingHacker.setPriority(Thread.MAX_PRIORITY);
        // DichotomicHacker.setPriority(Thread.MAX_PRIORITY);
        
        //AscendingHacker.start();
        //DescendingHacker.start();
        DichotomicHacker.start();
        Police.start();

        try {
            //AscendingHacker.join();
            //DescendingHacker.join();
            DichotomicHacker.join();
            Police.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
