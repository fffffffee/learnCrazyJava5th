interface Foo<T>
{
  void test(T t);
}
public class AnnoymousTest
{
  public static void main(String[] args)
  {
    Foo<String> f = new Foo<>()
    {
      public void test(String t)
      {
        System.out.println("test方法的t参数为：" + t);
      }
    };

    Foo<?> fo = new Foo<>()
    {
      public void test(Object t)
      {
        System.out.println("test方法的t参数为：" + t);
      }
    };
    Foo<? extends Number> fn = new Foo<>()
    {
      public void test(Number t)
      {
        System.out.println("test方法的Number参数为：" + t);
      }
    };
  }
}
