public class DepositThread extends Thread {
    private Account account;
    private double depositAmount;
    public DepositThread(String name, Account account, double depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }
    public void run() {
        for (int j = 0; j < 5; j++) {
            account.deposit(depositAmount);
        }
    }
    
}
