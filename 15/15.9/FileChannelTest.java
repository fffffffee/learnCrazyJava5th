import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.channels.*;
public class FileChannelTest
{
  public static void main(String[] args)
  {
    File f = new File("FileChannelTest.java");
    try(
      var inChannel = new FileInputStream(f).getChannel();
      var outChannel = new FileOutputStream("a.txt").getChannel();
        )
    {
      MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
      Charset charset = Charset.forName("GBK");
      outChannel.write(buffer);
      buffer.clear();
      CharsetDecoder decoder = charset.newDecoder();
      CharBuffer charBuffer = decoder.decode(buffer);
      System.out.println(charBuffer);
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
}
