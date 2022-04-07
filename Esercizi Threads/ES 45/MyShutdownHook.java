public class MyShutdownHook extends Thread{
    
    @Override
    public void run() {
        System.out.println("SHUTDOWN HOOK ACTIVATED");
        Main.running = false;
    }
}
