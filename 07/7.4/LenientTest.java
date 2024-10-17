import java.util.*;
import static java.util.Calendar.*;
public class LenientTest
{
  public static void main(String[] args)
  {
    Calendar cal = Calendar.getInstance();
    cal.set(MONTH, 13);
    System.out.println(cal.getTime());
    cal.setLenient(false);
    cal.set(MONTH, 13);
    System.out.println(cal.getTime());
  }
}
