import java.io.*;
public class SerializeMutable {
  public static void main(String[] args) {
    try (
      var oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
      var ois = new ObjectInputStream(new FileInputStream("mutable.txt"));
        )
    {
      var per = new Person("孙悟空", 500);
      oos.writeObject(per);
      per.setName("猪八戒");
      oos.writeObject(per);
      var p1 = (Person) ois.readObject();
      var p2 = (Person) ois.readObject();
      System.out.println(p1 == p2);
      System.out.println(p2.getName());
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
  }
}
