import java.util.HashSet;
import java.util.stream.*;
public class CollectionStream
{
    public static void main(String[] args)
    {
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax");
        books.add("疯狂Android讲义");
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("疯狂")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).length() > 10).count());
        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);
    }
}
