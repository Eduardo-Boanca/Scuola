public class MyShutdownHook extends Thread{
    
    @Override
    public void run() {
        System.out.println("===The robbery has ended===");
        Main.running = false;
    }
}
