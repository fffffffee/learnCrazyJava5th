public class PriorityTest extends Thread {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (int i = 0; i < 30; i++) {
            if (i == 10) {
                PriorityTest low = new PriorityTest("low");
                low.start();
                System.out.println("low thread priority:" + low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if (i == 20) {
                PriorityTest high = new PriorityTest("high");
                high.start();
                System.out.println("high thread priority:" + high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, its priority is:" + getPriority() + ", i = " + i);
        }
    }
    public PriorityTest(String name)
    {
        super(name);
    }
}
