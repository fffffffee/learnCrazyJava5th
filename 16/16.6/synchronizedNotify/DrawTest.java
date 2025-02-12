//package synchronizedNotify;
public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("1234567", 0);
        new DrawThread("Withdrawal Thread", acct, 800).start();
        new DepositThread("Deposit Thread1", acct, 800).start();
        new DepositThread("Deposit Thread2", acct, 800).start();
        new DepositThread("Deposit Thread3", acct, 800).start();
    }
}
