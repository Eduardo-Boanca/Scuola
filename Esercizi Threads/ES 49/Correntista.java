public class Correntista extends Thread {
    private BankAccount bank;

    public Correntista(BankAccount myBank) {
        this.bank = myBank;
    }

    @Override
    public void run() {
        float initial_balance = this.bank.getBalance();

        while (bank.getBalance() >= 0) {
            // double randomAmount = CoinToss.coinFlip();
            // randomAmount = (initial_balance / 2) + (randomAmount * initial_balance);
            float randomAmount = (float) (500 + (Math.random() * 250));
            synchronized (bank) {
                if (Math.random() > 0.5) {
                    bank.deposit(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has deposited " + randomAmount
                            + ". This bank count has now: " + this.bank.getBalance() + " €");
                } else {
                    bank.withdraw(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has withdrawed " + randomAmount
                            + ". This bank count has now: " + this.bank.getBalance() + " €");

                    if (bank.getBalance() < 0)
                        System.out.println(Thread.currentThread().getName() + " has finished the money");
                }
            }
        }
    }
}
