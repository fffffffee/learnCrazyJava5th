import java.util.LinkedHashSet;
public class LinkedHashSetTest
{
  public static void main(String[] args)
  {
    var books = new LinkedHashSet();
    books.add("疯狂Java讲义");
    books.add("轻量级Java EE企业应用实战");
    System.out.println(books);
    books.remove("疯狂Java讲义");
    books.add("疯狂Java讲义");
    System.out.println(books);
  }
}
