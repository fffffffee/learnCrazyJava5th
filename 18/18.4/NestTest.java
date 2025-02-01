import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class NestTest {
    public class InA {
        private int age = 2;
        private void foo () {
            System.out.println("private foo");
        }
    }
    public class InB {
        private String name = "B";
        private void bar() throws Exception{
            InA a = new InA(); 
            a.age = 3;
            System.out.println(a.age);
            a.foo();
            System.out.println("private bar");
            Field f = InA.class.getDeclaredField("age");
            f.setAccessible(true);
            f.set(a, 4);
            System.out.println(f.get(a));
            Method m = InA.class.getDeclaredMethod("foo");
            m.setAccessible(true);
            m.invoke(a);
        }
    }
    public void info() throws Exception {
        InB b = new InB();
        b.name = "Crazyit";
        System.out.println(b.name);
        b.bar();
        Field f = InB.class.getDeclaredField("name");
        f.setAccessible(true); 
        f.set(b, "fkjava");
        System.out.println(f.get(b));
        Method m = InB.class.getDeclaredMethod("bar");
        m.setAccessible(true);
        m.invoke(b);
    }
   public static void main(String[] args) throws Exception {
        new NestTest().info();
        System.out.println(NestTest.class.getNestHost());
        System.out.println(Class.forName("NestTest$InA").getNestHost());
        System.out.println(Arrays.toString(Class.forName("NestTest$InA").getNestMembers()));
        System.out.println(Class.forName("NestTest$InA").isNestmateOf(Class.forName("NestTest$InB")));
   } 
}
