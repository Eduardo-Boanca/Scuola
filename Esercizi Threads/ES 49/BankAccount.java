public class BankAccount {
    private double balance;

    public BankAccount(double MyBalance) {
        balance = MyBalance;
    }

    public BankAccount() {
        this(0);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        double temp = balance;
        temp += amount;
        try {
            Thread.sleep(300); // simulate production time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bilancio dopo il deposito = " + temp+"€");
        balance = temp;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
           System.out.println("Fondi insufficienti!");
           return;
        }
        double temp = balance;
        temp = temp - amount;
        try {
           Thread.sleep(200); // simulate consumption time
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("Bilancio dopo il prelievo = " + temp+"€");
        balance = temp;
     }
}
