import java.util.ArrayList;
public class ListTest
{
    public static void main(String[] args)
    {
        var books = new ArrayList();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        System.out.println(books);
        books.add(1, new String("疯狂Ajax讲义"));
        for(var i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
        books.set(1, "疯狂Java讲义");
        System.out.println(books);
        System.out.println(books.subList(1, 2));
    }
}
