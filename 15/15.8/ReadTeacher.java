import java.io.*;
public class ReadTeacher
{
  public static void main(String[] args)
  {
    try(
        var ois = new ObjectInputStream(new FileInputStream("teacher.txt"));
        )
    {
      var t1 = (Teacher) ois.readObject();
      var t2 = (Teacher) ois.readObject();
      var p = (Person) ois.readObject();
      var t3 = (Teacher) ois.readObject();
      System.out.println("t1的student引用和p是否相同：" + (t1.getStudent() == p));
      System.out.println("t2的student引用和p是否相同：" + (t2.getStudent() == p));
      System.out.println("t2和t3是否是同一个对象：" + (t2 == t3));
    }
    catch(Exception ioe)
    {
      ioe.printStackTrace();
    }
  }
}
