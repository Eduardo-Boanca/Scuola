public class BankAccount {
    private float balance;

    public BankAccount(float MyBalance) {
        balance = MyBalance;
    }

    public BankAccount() {
        this(1000);
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        this.balance = this.balance + amount;
 
    }

    public void withdraw(float amount) {
        this.balance = this.balance - amount;
    }
}
