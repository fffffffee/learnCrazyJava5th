public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        new JoinThread("NewThread").start();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                JoinThread jt = new JoinThread("JoinThread");
                jt.start();
                try {
                    jt.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}