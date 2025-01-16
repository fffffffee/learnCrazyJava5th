import java.nio.charset.*;
import java.nio.*;
public class CharsetTransform
{
  public static void main(String[] args) throws Exception
  {
    Charset cn = Charset.forName("GBK");
    CharsetEncoder cnEncoder = cn.newEncoder();
    CharsetDecoder cnDecoder = cn.newDecoder();
    CharBuffer cbuff = CharBuffer.allocate(8);
    cbuff.put("孙");
    cbuff.put("悟");
    cbuff.put("空");
    cbuff.flip();
    ByteBuffer bbuff = cnEncoder.encode(cbuff);
    for(var i = 0; i < bbuff.capacity(); i++)
    {
      System.out.print(bbuff.get(i) + " ");
    }
    System.out.println("\n" + cnDecoder.decode(bbuff));
  }
}
