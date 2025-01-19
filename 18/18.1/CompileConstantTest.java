public class CompileConstantTest {
  public static void main(String[] args) {
    System.out.println(MyTest.compileConstant);
  }
}
class MyTest
{
  static
  {
    System.out.println("静态初始化块...");
  }
  static final String compileConstant = "疯狂Java讲义";
}
