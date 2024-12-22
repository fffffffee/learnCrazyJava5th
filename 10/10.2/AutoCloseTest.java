import java.io.*;
public class AutoCloseTest
{
    public static void main(String[] args) throws IOException
    {
        try
        (
            var br = new BufferedReader(new FileReader("AutoCloseTest.java"));
            var ps = new PrintStream(new FileOutputStream("a.txt"));
        )
        {
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }
    }
}
