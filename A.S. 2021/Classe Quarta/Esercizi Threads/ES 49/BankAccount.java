public class BankAccount {
    private float balance;

    public BankAccount(float MyBalance) {
        this.balance = MyBalance;
    }

    public float getBalance() {
        return balance;
    }

    public /*synchronized*/void deposit(float amount) {
        this.balance = this.balance + amount;
 
    }

    public /*synchronized*/ void withdraw(float amount) {
        this.balance = this.balance - amount;
    }
}
