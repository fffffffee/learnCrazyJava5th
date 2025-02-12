class MyExHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + "Thread Exception throw exception: " + e);
    }
}
public class ExHandler {
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
        var a = 5 / 0;
        System.out.println("This program executed successfully");
    }
    
}
