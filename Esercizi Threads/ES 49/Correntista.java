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
            if (randomOperation > 0.5) {
                synchronized (bank) {
                    bank.withdraw(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has withdrawed " + randomAmount
                            + ". This bank account has now: " + this.bank.getBalance() + "€");
                    if (bank.getBalance() < 0)
                        System.out.println(
                                Thread.currentThread().getName() + " has finished the money in his bank account");
                }
            } else {
                synchronized (bank) {
                    bank.deposit(randomAmount);
                    System.out.println(Thread.currentThread().getName() + " has deposited " + randomAmount
                            + ". This bank account has now: " + this.bank.getBalance() + "€");

                }
            }
        }
    }
}
