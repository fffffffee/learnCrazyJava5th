import java.util.*;
public class GenericMethodTest
{
  static <T> void fromArrayToCollection(T[] a, Collection<T> c)
  {
    for(T o : a)
    {
      c.add(o);
    }
  }
  public static void main(String[] args)
  {
    var oa = new Object[100];
    Collection<Object> co = new ArrayList<>();
    // 下面的代码中T代表Object类型
    fromArrayToCollection(oa, co);
    var sa = new String[100];
    Collection<String> cs = new ArrayList<>();
    // 下面的代码中T代表String类型
    fromArrayToCollection(sa, cs);
    // 下面的代码中T代表Object类型
    fromArrayToCollection(sa, co);
    var ia = new Integer[100];
    var fa = new Float[100];
    var na = new Number[100];
    Collection<Number> cn = new ArrayList<>();
    // 下面的代码中T代表Number类型
    fromArrayToCollection(ia, cn);
  }
}
