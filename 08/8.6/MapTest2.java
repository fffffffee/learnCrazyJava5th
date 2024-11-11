import java.util.HashMap;
public class MapTest2
{
    public static void main(String[] args)
    {
        var map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂iOS讲义", 99);
        map.put("疯狂Ajax讲义", 79);
        map.replace("疯狂XML讲义", 66);
        System.out.println(map);
        map.merge("疯狂iOS讲义", 10, (oldVal, param) -> (Integer)oldVal + (Integer)param);
        System.out.println(map);
        map.computeIfAbsent("Java", key -> ((String)key).length());
        System.out.println(map);
        map.computeIfPresent("Java", (key, value) -> (Integer)value * (Integer)value);
        System.out.println(map);
    }
}
