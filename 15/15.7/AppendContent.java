import java.io.*;
public class AppendContent
{
    public static void main(String[] args)
    {
        try
        (
            var raf = new RandomAccessFile("out.txt", "rw")
        )
        {
            raf.seek(raf.length());
            raf.write("追加的内容！\r\n".getBytes());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
