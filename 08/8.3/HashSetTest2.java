import java.util.HashSet;
class R
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
    if (this == obj)
      return true;
    if (obj != null && obj.getClass() == R.class)
    {
      var r = (R)obj;
      return this.count == r.count;
    }
    return false;
  }
  public int hashCode()
  {
    return this.count;
  }
}
public class HashSetTest2
{
  public static void main(String[] args)
  {
    var hs = new HashSet();
    hs.add(new R(5));
    hs.add(new R(-3));
    hs.add(new R(9));
    hs.add(new R(-2));
    System.out.println(hs);
    var it = hs.iterator();
    var first = (R)it.next();
    first.count = -3;
    System.out.println(hs);
    hs.remove(new R(-3));
    System.out.println(hs);
    System.out.println("hs是否包含count为-3的R对象？" + hs.contains(new R(-3)));
    System.out.println("hs是否包含count为-2的R对象？" + hs.contains(new R(-2)));
  }
}
