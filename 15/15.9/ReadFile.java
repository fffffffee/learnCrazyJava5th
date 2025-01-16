import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
public class ReadFile
{
  public static void main(String[] args) throws IOException
  {
    try(
      var fis = new FileInputStream("ReadFile.java");
      FileChannel fcin = fis.getChannel()
        )
    {
      ByteBuffer bbuff = ByteBuffer.allocate(256);
      while(fcin.read(bbuff) != -1)
      {
        bbuff.flip();
        Charset charset = Charset.forName("GBK");
        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer cbuff = decoder.decode(bbuff);
        System.out.println(cbuff);
        bbuff.clear();
      }
    }
    catch (IOException ioe)
    {
      ioe.printStackTrace(); 
    }
  }
}
