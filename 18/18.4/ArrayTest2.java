import java.lang.reflect.Array;

public class ArrayTest2 {
   public static void main(String[] args) {
        try {
            Object arr = Array.newInstance(String.class, 3, 4, 10);
            Object arrobj = Array.get(arr, 2);
            Array.set(arrobj, 2, new String[] { "Hello", "World" });
            Object anArr = Array.get(arrobj, 3);
            Array.set(anArr, 8, "Java");
            var cast = (String[][][]) arr;
            System.out.println(cast[2][3][8]);
            System.out.println(cast[2][2][0]);
            System.out.println(cast[2][2][1]);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
   } 
}
