package Lock;

public class DrawTest {
    public static void main(String[] args) throws InterruptedException {
        var acct = new Account("123456", 1000);
        var dt1 = new DrawThread("Thread 1", acct, 800);    
        var dt2 = new DrawThread("Thread 2", acct, 800);
        dt1.start();
        dt2.start();
    }
}
