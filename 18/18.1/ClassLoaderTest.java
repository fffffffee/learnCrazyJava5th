class Tester
{
  static
  {
    System.out.println("Tester类的静态初始化块...");
  }
}
public class ClassLoaderTest {
  public static void main(String[] args) throws ClassNotFoundException {
    ClassLoader cl = ClassLoader.getSystemClassLoader(); 
    cl.loadClass("Tester");
    System.out.println("系统加载Tester类");
    Class.forName("Tester");
  }
}
