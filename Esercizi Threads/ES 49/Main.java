public class Main {
    public static void main(String[] args) {
        BankAccount count = new BankAccount(1000);
        Thread first_thread = new Thread(new Correntista(count));
        Thread second_thread = new Thread(new Correntista(count));

        first_thread.setName("Marco");
        second_thread.setName("Francesco");

        first_thread.start();
        second_thread.start();
        
        try {
            System.out.println("Starting account balance is: " + count.getBalance());
            first_thread.join();
            second_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final account balance is: " + count.getBalance());
    }
}
