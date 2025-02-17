import java.io.*;
import java.util.*;
public class WriteToProcess
{
    public static void main(String[] args) throws IOException
    {
        Process p = Runtime.getRuntime().exec("java ReadStandard");
        try
        (
            var ps = new PrintStream(p.getOutputStream())
        )
        {
            ps.println("普通字符串");
            ps.println(new WriteToProcess());
        }
    }
}
class ReadStandard
{
    public static void main(String[] args)
    {
        try
        (
            var sc = new Scanner(System.in);
            var ps = new PrintStream(new FileOutputStream("out.txt"))
        )
        {
            sc.useDelimiter("\n");
            while(sc.hasNext())
            {
                ps.println("键盘输入的内容是：" + sc.next());
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
