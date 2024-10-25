import java.util.TreeSet;
class Err {}
public class TreeSetErrorTest
{
  public static void main(String[] args)
  {
    var ts = new TreeSet();
    ts.add(new Err());
  }
}
