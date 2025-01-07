import java.io.*;
public class FileInputStreamTest
{
    public static void main(String[] args) throws IOException
    {
        var fis = new FileInputStream("FileInputStreamTest.java");
        var bbuf = new byte[1024];
        var hasRead = 0;
        while((hasRead = fis.read(bbuf)) > 0)
        {
            System.out.println(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
