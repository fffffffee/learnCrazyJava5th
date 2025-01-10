import java.io.*;
import java.util.*;
public class RedirectIn
{
    public static void main(String[] args)
    {
        try
        (
            var fis = new FileInputStream("RedirectIn.java");
        )
        {
            System.setIn(fis);
            var sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            while(sc.hasNext())
            {
                System.out.println("键盘输入的内容是：" + sc.next());
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
