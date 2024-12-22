import java.io.*;
public class AutoCloseTest2
{
    public static void main(String[] args) throws IOException
    {
        
        final var br = new BufferedReader(new FileReader("AutoCloseTest.java"));
        var ps = new PrintStream(new FileOutputStream("a.txt"));
        try(br ; ps)
        {
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }
    }
}
