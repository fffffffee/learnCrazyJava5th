import java.io.*;
public class PrintStreamTest
{
    public static void main(String[] args)
    {
        try
        (
            var fos = new FileOutputStream("test.txt");
            var ps = new PrintStream(fos)
        )
        {
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
