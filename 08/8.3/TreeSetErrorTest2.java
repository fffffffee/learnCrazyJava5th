import java.util.TreeSet;
import java.util.Date;
public class TreeSetErrorTest2
{
  public static void main(String[] args)
  {
    var ts = new TreeSet();
    ts.add(new String("疯狂Java讲义"));
    ts.add(new Date());
  }
}
