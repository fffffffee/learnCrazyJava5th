import java.util.ArrayList;
import java.util.List;
public class GenericList
{
  public static void main(String[] args)
  {
    List<String> strList = new ArrayList<String>();
    strList.add("疯狂Java讲义");
    strList.add("疯狂Android讲义");
    strList.add(65);
    strList.forEach(str -> System.out.println(str.length()));
  }
}
