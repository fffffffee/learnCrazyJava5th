import java.lang.reflect.Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        try {
            Object arr = Array.newInstance(String.class, 10);
            Array.set(arr, 5, "Hello");
            Array.set(arr, 6, "World");
            Object obj1 = Array.get(arr, 5);
            Object obj2 = Array.get(arr, 6);
            System.out.println(obj1);
            System.out.println(obj2);
        } catch (Throwable e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
