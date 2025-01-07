import java.io.*;
public class FileOutputStreamTest
{
    public static void main(String[] args)
    {
        try
        (
            var fis = new FileInputStream("FileOutputStreamTest.java");
            var fos = new FileOutputStream("newFile.txt")
        )
        {
            var bbuf = new byte[32];
            var hasRead = 0;
            while((hasRead = fis.read(bbuf)) > 0)
            {
                fos.write(bbuf, 0, hasRead);
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
