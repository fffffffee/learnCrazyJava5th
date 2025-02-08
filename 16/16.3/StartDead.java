public class StartDead extends Thread {
    private int i;
    //  Override the run method
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        //  Create a thread object
        var sd = new StartDead();
        for (int i = 0; i < 300; i++) {
            //  Output the current thread name
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                //  Start the thread
                sd.start();
                //  Check if the thread is alive
                System.out.println(sd.isAlive());
            }
            //  Check if the thread is alive
            if (i > 20 && !sd.isAlive()) {
                //  Try to start the thread again
                //  sd.start();
                //  Create a new thread object
                //sd = new StartDead();
                //  Start the new thread
                sd.start();
            }
        }
    }
    
}
