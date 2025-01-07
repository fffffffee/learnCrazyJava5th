import java.io.*;
public class FileReaderTest
{
    public static void main(String[] args) throws IOException
    {
        try
        (
            var fr = new FileReader("FileReaderTest.java")
        )
        {
            var cbuf = new char[32];
            var hasRead = 0;
            while((hasRead = fr.read(cbuf)) > 0)
            {
                System.out.println(new String(cbuf, 0, hasRead));
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
