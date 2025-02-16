import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class CalTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;
    private int[] arr;
    private int start;
    private int end;

    public CalTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            CalTask left = new CalTask(arr, start, mid);
            CalTask right = new CalTask(arr, mid, end);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }
}

public class Sum {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[100];
        var rand = new Random();
        var total = 0;
        for (int i = 0, len = arr.length; i < len; i++) {
            arr[i] = rand.nextInt(20);
            total += arr[i];
        }
        System.out.println("Total: " + total);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        CalTask task = new CalTask(arr, 0, arr.length);
        int result = pool.invoke(task);
        System.out.println("Sum: " + result);
        pool.shutdown();
    }
}
