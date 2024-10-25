import java.util.HashSet;
import java.util.EnumSet;
public class EnumSetTest2
{
  public static void main(String[] args)
  {
    var c = new HashSet();
    c.clear();
    c.add(Season.FALL);
    c.add(Season.SPRING);
    var enumSet = EnumSet.copyOf(c);
    System.out.println(enumSet);
    c.add("疯狂Java讲义");
    c.add("轻量级Java SE企业应用实战");
    enumSet = EnumSet.copyOf(c);
  }
}
