import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        var rt = new ThirdThread();
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() -> {
            var i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i+10;
        });
        for (var i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                var thread = new Thread(task, "有返回值的线程");
                thread.start();
            }
        }
        try {
            System.out.println("子线程的返回值：" + task.get());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
