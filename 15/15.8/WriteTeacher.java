import java.io.*;
public class WriteTeacher
{
  public static void main(String[] args)
  {
    try(
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
        )
    {
      var per = new Person("孙悟空", 500);
      var t1 = new Teacher("唐僧", per);
      var t2 = new Teacher("菩提祖师", per);
      oos.writeObject(t1);
      oos.writeObject(t2);
      oos.writeObject(per);
      oos.writeObject(t2);
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
}
