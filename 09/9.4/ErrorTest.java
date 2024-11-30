import java.util.*;
public class ErrorTest
{
  static <T> void test(Collection<T> from, Collection<T> to)
  {
    for(var ele : from)
    {
      to.add(ele);
    }
  }
  public static void main(String[] args)
  {
    List<Object> as = new ArrayList<>();
    List<String> ao = new ArrayList<>();
    test(as, ao);
  }
}
