import java.util.HashMap;
import java.util.Map; // Added import for Map
import java.util.Properties;
import java.io.*;
//import java.lang.reflect.InvocationTargetException;

public class ObjectPoolFactory {
    private static Map<String, Object> objectPool = new HashMap<>();
    private Object createObject(String clazzName) throws Exception, IllegalAccessException, ClassNotFoundException 
    {
        Class<?> clazz = Class.forName(clazzName);
        return clazz.getConstructor().newInstance();
    }
    public void initPool(String fileName) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
    {
        try 
        (
            var fis = new FileInputStream(fileName)
        )
        {
            var props = new Properties();
            props.load(fis);
            for(String name : props.stringPropertyNames())
            {
                objectPool.put(name, createObject(props.getProperty(name)));
            }
        }
        catch (Exception ex) {
            System.out.println("读取" + fileName + "异常");
        }
    }
    
    public Object getObject(String name) {
        return objectPool.get(name);
    }
    
    public static void main(String[] args) throws Exception {
        var f = new ObjectPoolFactory();
        f.initPool("obj.txt");
        System.out.println(f.getObject("a"));
        System.out.println(f.getObject("b"));
    }
}
