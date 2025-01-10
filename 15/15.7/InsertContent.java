import java.io.*;
public class InsertContent
插入的内容
{
    public static void insert(String fileName, long pos, String insertContent) throws IOException
    {
        var tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try
        (
            var raf = new RandomAccessFile(fileName, "rw");
            var tmpOut = new FileOutputStream(tmp);
            var tmpIn = new FileInputStream(tmp);
        )
        {
            raf.seek(pos);
            var bbuf = new byte[64];
            var hasRead = 0;
            while((hasRead = raf.read(bbuf)) > 0)
            {
                tmpOut.write(bbuf, 0, hasRead);
            }
            raf.seek(pos);
            raf.write(insertContent.getBytes());
            while((hasRead = tmpIn.read(bbuf)) > 0)
            {
                raf.write(bbuf, 0, hasRead);
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        insert("InsertContent.java", 45, "插入的内容\r\n");
    }
}
