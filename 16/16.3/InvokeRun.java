public class InvokeRun extends Thread{
    private int i;
    //  Override the run method
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                //  Create and start the first thread
                // new InvokeRun().start();
                new InvokeRun().run();
                //  Create and start the second thread
                new InvokeRun().run();
            }
        }
    }
}
