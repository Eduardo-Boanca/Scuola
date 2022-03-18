public class MultithreadThing extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("****THREAD 1****");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
