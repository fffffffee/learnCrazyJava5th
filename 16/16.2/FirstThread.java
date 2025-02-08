// Description: Create a thread by extending Thread class.
public class FirstThread extends Thread {
    private int i;
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                var ft1 = new FirstThread();
                var ft2 = new FirstThread();
                ft1.start();
                ft2.start();
            }
        }
    }
    
}
