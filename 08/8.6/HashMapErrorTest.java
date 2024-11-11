import java.util.HashMap;
public class HashMapErrorTest
{
    public static void main(String[] args)
    {
        var ht = new HashMap();
        ht.put(new A(60000), "疯狂Java讲义");
        ht.put(new A(87563), "轻量级Java EE企业应用实战");
        var it = ht.keySet().iterator();
        var first = (A)it.next();
        first.count = 87563;
        System.out.println(ht);
        ht.remove(new A(87563));
        System.out.println(ht);
        System.out.println(ht.get(new A(87563)));
        System.out.println(ht.get(new A(60000)));
    }
}
