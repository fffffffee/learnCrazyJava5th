import java.util.*;
import java.util.function.Predicate;
public class PredicateTest2
{
    public static void main(String[] args)
    {
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实践");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");
        System.out.println(calAll(books, ele -> ((String)ele).contains("疯狂")));
        System.out.println(calAll(books, ele -> ((String)ele).contains("Java")));
        System.out.println(calAll(books, ele -> ((String)ele).length() > 10));
    }
    public static int calAll(Collection books, Predicate p)
    {
        int total = 0;
        for(var obj : books)
        {
            if(p.test(obj))
            {
                total ++;
            }
        }
        return total;
    }
}
