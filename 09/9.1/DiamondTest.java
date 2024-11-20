import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class DiamondTest
{
  public static void main(String[] args)
  {
    List<String> books = new ArrayList<>();
    books.add("疯狂Java讲义");
    books.add("疯狂Android讲义");
    books.forEach(ele -> System.out.println(ele.length()));
    Map<String, List<String>> schoolsInfo = new HashMap<>();
    List<String> schools = new ArrayList<>();
    schools.add("斜月三星洞");
    schools.add("西天取经路");
    schoolsInfo.put("孙悟空", schools);
    schoolsInfo.forEach((key, value) -> System.out.println(key + "--->" + value));
  }
}
