import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Person {
    void walk();
    void talk(String name);
}
class MyInvokationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("You are going to invoke " + method.getName() + " method");
        if (args != null) {
            System.out.println("The arguments are:");
            for (Object arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("There is no argument");    
        }
        return null;
    }
}
public class ProxyTest {
    
    public static void main(String[] args) {
        InvocationHandler h = new MyInvokationHandler();
        Person proxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[] {Person.class}, h);
        proxy.walk();
        proxy.talk("Tom");
    }
}