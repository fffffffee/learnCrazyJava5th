import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
@Repeatable(Annos.class)
@interface Anno {}
@Retention(value = RetentionPolicy.RUNTIME)
@interface Annos{
  Anno[] value();
}
// 使用4个注解修饰该类
@SuppressWarnings(value = "unchecked")
@Deprecated
// 使用重复注解修饰该类
@Anno
@Anno
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
    //获取该Class对象所对应类的指定方法
    System.out.println("ClassTest里带一个字符串参数的info方法为：" + clazz.getMethod("info", String.class));
    //获取该Class对象所对应类的全部注解
    Annotation[] anns = clazz.getAnnotations();
    System.out.println("ClassTest的全部Annotation如下：");
    for (var an : anns) {
      System.out.println(an);
    }
    System.out.println("该Class元素上的@SuppressWarnings注解为：" + Arrays.toString(clazz.getAnnotationsByType(SuppressWarnings.class)));
    System.out.println("该Class元素上的@Anno注解为：" + Arrays.toString(clazz.getAnnotationsByType(Anno.class)));
    //获取该Class对象所对应类的全部内部类
    Class<?>[] inners = clazz.getDeclaredClasses();
    System.out.println("ClassTest的全部内部类如下：");
    for (var c : inners) {
      System.out.println(c);
    }
    // 使用Class.forName()方法加载ClassTest的Inner内部类
    Class inClazz = Class.forName("ClassTest$Inner");
    // 通过getDeclaringClass()访问该类所在的外部类
    System.out.println("inClazz对应该类所在的外部类为：" + inClazz.getDeclaringClass());
    System.out.println("ClassTest的包为：" + clazz.getPackage());
    System.out.println("ClassTest的父类为：" + clazz.getSuperclass());
  }
}
