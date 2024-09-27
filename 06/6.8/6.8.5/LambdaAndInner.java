@FunctionalInterface
interface Displayable
{
  void display();
  default int add(int a, int b)
  {
    return a + b;
  }
}
public class LambdaAndInner
{
  private int age = 12;
  private static String name = "疯狂软件教育中心";
  public void test()
  {
    var book = "疯狂Java讲义";
    Displayable dis = () -> {
      System.out.println("book局部变量为：" + book);
      System.out.println("外部类的age变量为：" + age);
      System.out.println("外部类的name变量为：" + name);
    };
    dis.display();
    System.out.println(dis.add(3, 5));
  }
  public static void main(String[] args)
  {
    var lambda = new LambdaAndInner();
    lambda.test();
  }
}
