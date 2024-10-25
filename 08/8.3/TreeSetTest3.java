import java.util.TreeSet;
class R implements Comparable
{
  int count;
  public R(int count)
  {
    this.count = count;
  }
  public String toString()
  {
    return "R[count:" + count + "]";
  }
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(obj != null && obj.getClass() == R.class)
    {
      var r = (R) obj;
      return r.count == this.count;
    }
    return false;
  }
  public int compareTo(Object obj)
  {
    var r = (R) obj;
    return count > r.count ? 1 : count < r.count ? -1 : 0;
  }
}
public class TreeSetTest3
{
  public static void main(String[] args)
  {
    var ts = new TreeSet();
    ts.add(new R(5));
    ts.add(new R(-3));
    ts.add(new R(9));
    ts.add(new R(-2));
    System.out.println(ts);
    var first = (R) ts.first();
    first.count = 20;
    var last = (R) ts.last();
    last.count = -2;
    System.out.println(ts);
    System.out.println(ts.remove(new R(-2)));
    System.out.println(ts);
    System.out.println(ts.remove(new R(5)));
    System.out.println(ts);
  }
}
