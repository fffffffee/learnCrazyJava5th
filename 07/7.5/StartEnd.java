import java.util.regex.*;
public class StartEnd
{
  public static void main(String[] args)
  {
    var regStr = "Java is very easy!";
    System.out.println("目标字符串是：" + regStr);
    Matcher m = Pattern.compile("\\w+").matcher(regStr);
    while(m.find())
    {
      System.out.println(m.group() + "子串的起始位置：" + m.start() + ", 其结束位置：" + m.end());
    }
  }
}
