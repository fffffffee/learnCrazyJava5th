import java.lang.reflect.Constructor;

public class CreateJFrame {
   public static void main(String[] args) throws Exception {
       Class<?> jframeClazz = Class.forName("javax.swing.JFrame"); 
       Constructor constructor = jframeClazz.getConstructor(String.class);
         var frame = constructor.newInstance("测试窗口");
         System.out.println(frame);
   } 
}
