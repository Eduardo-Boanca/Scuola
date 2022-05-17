public class Correntista extends Thread {
    private BankAccount bank;
    float randomOperation;

    public Correntista(BankAccount myBank) {
        this.bank = myBank;
    }

    @Override
    public void run() {
        while (bank.getBalance() >= 0) {
            float randomAmount = (float) (500 + (Math.random() * 250));
            randomOperation = CoinToss.coinToss();
            synchronized (bank) {
                if (randomOperation > 0.5) {
                    bank.withdraw(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has withdrawed " + randomAmount
                            + ". This bank account has now: " + this.bank.getBalance() + "€");
                    if (bank.getBalance() < 0)
                        System.out.println(Thread.currentThread().getName() + " has finished the money in his bank account");
                } else {
                    bank.deposit(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has deposited " + randomAmount
                            + ". This bank account has now: " + this.bank.getBalance() + "€");

                }
            }
        }
    }
}
