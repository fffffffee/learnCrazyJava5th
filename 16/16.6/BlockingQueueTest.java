import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class BlockingQueueTest {
    public static void main(String[] args) throws Exception {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
        bq.put("Java");
        bq.put("Java");
        bq.put("Java");
    }
}
