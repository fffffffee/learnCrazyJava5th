import javax.swing.JFrame;
import java.util.Date;
public class CrazyitObjectFactory {
    public static Object getInstance(String clsName) {
        try {
            // 创建指定类型对应的Class对象
            Class<?> cls = Class.forName(clsName);
            // 使用默认构造器创建cls对应类的实例
            return cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        var d = (Date) CrazyitObjectFactory.getInstance("java.util.Date");
        var f = (JFrame) CrazyitObjectFactory.getInstance("javax.swing.JFrame");
    }
}
