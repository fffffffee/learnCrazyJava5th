import java.util.*;
import java.nio.charset.*;
public class CharsetTest
{
  public static void main(String[] args)
  {
    SortedMap<String, Charset> map = Charset.availableCharsets();
    for(var alias : map.keySet())
    {
      System.out.println(alias + "----->" + map.get(alias));
    }
  }
}
