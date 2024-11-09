import java.util.ArrayDeque;
public class ArrayDequeQueue
{
    public static void main(String[] args)
    {
        var queue = new ArrayDeque();
        queue.offer("疯狂Java讲义");
        queue.offer("轻量级Java EE企业应用实战");
        queue.offer("疯狂Android讲义");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
    }
}
