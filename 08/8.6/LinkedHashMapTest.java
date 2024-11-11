import java.util.LinkedHashMap;
public class LinkedHashMapTest
{
    public static void main(String[] args)
    {
        var scores = new LinkedHashMap();
        scores.put("语文", 80);
        scores.put("英文", 82);
        scores.put("数学", 76);
        scores.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}
