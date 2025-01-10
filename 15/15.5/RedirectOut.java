import java.io.*;
public class RedirectOut
{
    public static void main(String[] args)
    {
        try
            (
             var ps = new PrintStream(new FileOutputStream("out.txt"))
            )
            {
                System.setOut(ps);
                System.out.println("普通字符串");
                System.out.println(new RedirectOut());
            }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
