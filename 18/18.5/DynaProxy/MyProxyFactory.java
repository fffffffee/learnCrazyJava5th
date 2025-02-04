import  java.lang.reflect.Proxy;
public class MyProxyFactory {
    public static Object getProxy(Object target) throws Exception 
    {
        var proxy = new MyInvokationHandler();
        proxy.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxy);
    }
}
