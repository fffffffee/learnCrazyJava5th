import java.io.*;
public class TransientTest {
  public static void main(String[] args) {
    try (
        var oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
        var ois = new ObjectInputStream(new FileInputStream("transient.txt"));
        ) 
    {
      var per = new Person("孙悟空", 500);
      oos.writeObject(per);
      var p = (Person) ois.readObject();
      System.out.println(p.getAge());
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
  }
}
