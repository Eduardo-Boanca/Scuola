public class MyShutdownHook extends Thread{
    
    @Override
    public void run() {
        System.out.println("The program has finished");
        Main.running = false;
    }
}
