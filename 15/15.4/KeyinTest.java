import java.io.*;
public class KeyinTest
{
    public static void main(String[] args)
    {
        try
        (
            var reader = new InputStreamReader(System.in);
            var br = new BufferedReader(reader)
        )
        {
            String line = null;
            while((line = br.readLine()) != null)
            {
                if(line.equals("exit"))
                {
                    System.exit(1);
                }
                System.out.println("输入内容为：" + line);
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
