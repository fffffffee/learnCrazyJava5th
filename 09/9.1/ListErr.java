import java.util.ArrayList;
public class ListErr
{
  public static void main(String[] args)
  {
    var strList = new ArrayList();
    strList.add("疯狂Java讲义");
    strList.add("疯狂Android讲义");
    strList.add(5);
    strList.forEach(str -> System.out.println(((String) str).length()));
  }
}
