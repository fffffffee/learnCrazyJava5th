import java.util.HashSet;
public class PredicateTest
{
    public static void main(String[] args)
    {
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实践");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");
        books.removeIf(ele -> ((String)ele).length() < 10);    
        System.out.println(books);
    }
}
