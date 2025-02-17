package synchronizedBlock;

public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + " withdraws " + drawAmount + " from " + account.getAccountNo());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("Balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
    
}
