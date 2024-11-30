import java.util.*;
public class RightTest
{
  static <T> void test(Collection<? extends T> from, Collection<T> to)
  {
    for(var ele : from)
    {
      to.add(ele);
    }
  }
  public static void main(String[] args)
  {
    Collection<String> as = new ArrayList<>();
    Collection<Object> ao = new ArrayList<>();
    test(as, ao);
  }
}
