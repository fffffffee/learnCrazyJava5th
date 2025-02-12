import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Producer extends Thread {
    private BlockingQueue<String> bq;
    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        String[] strArr = new String[] {
            "Java",
            "Struts",
            "Spring"
        };
        for (int i = 0; i < 999999999; i++) 
        {
            System.out.println(getName() + " producer is prepared to produce collection element ");
            try 
            {
                Thread.sleep(200);
                bq.put(strArr[i % 3]);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " producer has produced collection element " + bq);
        }
    } 
}

class Consumer extends Thread {
    private BlockingQueue<String> bq;
    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        while (true) 
        {
            System.out.println(getName() + " consumer is prepared to consume collection element ");
            try 
            {
                Thread.sleep(200);
                bq.take();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " consumer has consumed collection element " + bq);
        }
    }
}
public class BlockingQueueTest2 
{
    public static void main(String[] args) 
    {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        new Consumer(bq).start();
    }
}
