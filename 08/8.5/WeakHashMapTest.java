import java.util.WeakHashMap;
public class WeakHashMapTest
{
    public static void main(String[] args)
    {
        var whm = new WeakHashMap();
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英语"), new String("中等"));
        whm.put("java", new String("中等"));
        System.out.println(whm);
        System.gc();
        System.runFinalization();
        System.out.println(whm);
    } 
}
