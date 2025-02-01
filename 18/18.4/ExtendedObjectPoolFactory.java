import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ExtendedObjectPoolFactory {
    private Map<String, Object> objectPool = new HashMap<>();
    private Properties config = new Properties();
    
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
            config.load(fis);
        }
        catch (Exception ex) {
            System.out.println("读取" + fileName + "异常");
        }
    }
    
    public void initPool(InputStream is) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
    {
        try 
        {
            config.load(is);
        }
        catch (Exception ex) {
            System.out.println("读取异常");
        }
    }
    
    public Object getObject(String name) {
        return objectPool.computeIfAbsent(name, key -> {
            try {
                return createObject(config.getProperty(name));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
    
    public static void main(String[] args) throws Exception {
        var f = new ExtendedObjectPoolFactory();
        f.initPool(ExtendedObjectPoolFactory.class.getResourceAsStream("obj.txt"));
        System.out.println(f.getObject("a"));
        System.out.println(f.getObject("b"));
    } 
}
