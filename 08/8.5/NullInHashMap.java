import java.util.HashMap;
public class NullInHashMap
{
    public static void main(String[] args)
    {
        var hm = new HashMap();
        hm.put(null, null);
        hm.put(null, null);
        hm.put("a", null);
        System.out.println(hm);
    }
}
