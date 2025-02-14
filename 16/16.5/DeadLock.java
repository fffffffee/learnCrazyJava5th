class A{
    public synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("A Interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A.last");
    }
}
class B {
    public synchronized void bar(A a)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("B Interrupted");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B.last");
    }
}
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();
    public void init(){
        Thread.currentThread().setName("MainThread");
        a.foo(b);
        System.out.println("Back in main thread");
    }
    public void run(){
        Thread.currentThread().setName("RacingThread");
        b.bar(a);
        System.out.println("Back in other thread");
    }
    public static void main(String[] args){
        var dl = new DeadLock();
        new Thread(dl).start();
        dl.init();
    }
}
