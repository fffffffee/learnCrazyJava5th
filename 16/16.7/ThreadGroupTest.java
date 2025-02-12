class MyThread extends Thread {
    /**
     * Constructs a new MyThread with the specified name.
     *
     * @param name the name to be assigned to this thread instance
     */
    public MyThread(String name) {
        super(name);
    }
    /**
     * Constructs a new MyThread object that belongs to the specified thread group with the given name.
     *
     * @param g the thread group to which this thread will belong
     * @param name the name assigned to this thread
     */
    public MyThread(ThreadGroup g, String name) {
        super(g, name);
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "线程的i变量" + i);
        }
    }
}

public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程组的名字：" + mainGroup.getName());
        System.out.println("主线程组是否是后台线程组：" + mainGroup.isDaemon());
        new MyThread("主线程组的线程").start();
        ThreadGroup tg = new ThreadGroup("新线程组");
        tg.setDaemon(true);
        System.out.println("tg线程组是否是后台线程组：" + tg.isDaemon());
        MyThread tt = new MyThread(tg, "tg组的线程甲");
        tt.start();
        new MyThread(tg, "tg组的线程乙").start();
    }
}
