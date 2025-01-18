import java.util.ArrayList;
import java.io.*;
public class ReplaceTest
{
  public static void main(String[] args) {
    try (
      var oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
      var ois = new ObjectInputStream(new FileInputStream("replace.txt"));
        )
    {
      var per = new Person("孙悟空", 500);
      oos.writeObject(per);
      var list = (ArrayList) ois.readObject();
      System.out.println(list);
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
  }
}
