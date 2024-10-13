import java.util.HashSet;
public class IteratorTest
{
    public static void main(String[] args)
    {
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实践");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        
        var it = books.iterator();
        while(it.hasNext())
        {
            var book = (String)it.next();
            System.out.println(book);
            if(book.equals("疯狂Java讲义"))
            {
                it.remove();
            }
            book = "测试字符串";
        }
        System.out.println(books);
    }
}
