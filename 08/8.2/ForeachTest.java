import java.util.HashSet;
public class ForeachTest
{
    public static void main(String[] args)
    {
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实践");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        
        for(var obj : books)
        {
            var book = (String)obj;
            System.out.println(book);
            if(book.equals("疯狂Android讲义"))
            {
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
