import java.util.HashMap;
public class MapTest
{
    public static void main(String[] args)
    {
        var map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂iOS讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级Java EE企业应用实战", 99);
        System.out.println(map.put("疯狂iOS讲义", 99));
        System.out.println(map);
        System.out.println("是否包含值为疯狂iOS讲义的key：" + map.containsKey("疯狂iOS讲义"));
        System.out.println("是否包含值为99的value：" + map.containsValue(99));
        for(var key : map.keySet())
        {
            System.out.println(key + "--->" + map.get(key));
        }
        map.remove("疯狂Ajax讲义");
        System.out.println(map);
    }
}
