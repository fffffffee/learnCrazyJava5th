import java.lang.reflect.*;
public class ClassTest {
	private ClassTest()
	{}
	public ClassTest(String name)
	{
		System.out.println("执行有参数的构造器");
	}
	public void info()
	{
		System.out.println("执行无参数的info方法");
	}
	public void info(String str)
	{
		System.out.println("执行有参数的info方法" + "，其str参数值：" + str);
	}
  class Inner{}
  public static void main(String[] args) throws Exception{
    Class<ClassTest> clazz = ClassTest.class;
    Constructor[] ctors = clazz.getDeclaredConstructors();
    System.out.println("ClassTest的全部构造器如下：");
    for (var c : ctors) {
      System.out.println(c);
    }
    Constructor[] publicCtors = clazz.getConstructors();
    System.out.println("ClassTest的全部public构造器如下：");
    for (var c : publicCtors) {
      System.out.println(c);
    }
    Method[] mtds = clazz.getMethods();
    System.out.println("ClassTest的全部public方法如下：");
    for (var md : mtds) {
      System.out.println(md);
    }
  }
}
