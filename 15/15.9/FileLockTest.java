import java.io.*;
import java.nio.channels.*;
public class FileLockTest
{
  public static void main(String[] args) throws Exception
  {
    try(
      var channel = new FileOutputStream("a.txt").getChannel()
        )
    {
      FileLock lock = channel.tryLock();
      Thread.sleep(10000);
      lock.release();
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
