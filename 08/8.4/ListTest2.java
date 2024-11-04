import java.util.ArrayList;
class A
{
    public boolean equals(Object obj)
    {
        return true;
    }
}
public class ListTest2
{
    public static void main(String[] args)
    {
        var books = new ArrayList();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);
    }
}
