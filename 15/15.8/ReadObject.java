import java.io.*;
public class ReadObject
{
  public static void main(String[] args)
  {
    try(
        var ois = new ObjectInputStream(new FileInputStream("object.txt"));
        )
    {
      var p = (Person) ois.readObject();
      System.out.println("名字为：" + p.getName() + "\n年龄为：" + p.getAge());
    }
    catch(Exception ioe)
    {
      ioe.printStackTrace();
    }
  }
}
