import java.util.Date;
public class SleepTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // System.out.println("当前时间: " + System.currentTimeMillis());
            System.out.println("当前时间: " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}
