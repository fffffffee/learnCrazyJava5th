import java.util.ArrayList;
public class ListTest3
{
    public static void main(String[] args)
    {
        var books = new ArrayList();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        books.add("疯狂iOS讲义");
        books.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(books);
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books);
    }
}
