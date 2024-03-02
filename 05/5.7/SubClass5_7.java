class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("父类的普通方法");
	}
	public void test()
	{
		System.out.println("父类的被覆盖的方法");
	}
}
public class SubClass5_7 extends BaseClass
{
	public String book = "疯狂Java";
	public void sub()
	{
		System.out.println("子类的普通方法");
	}
	public void test()
	{
		System.out.println("子类的覆盖父类的方法");
	}
	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();

		SubClass5_7 sc = new SubClass5_7();
		System.out.println(sc.book);
		sc.base();
		sc.test();

		BaseClass polymophicbc = new SubClass5_7();
		System.out.println(polymophicbc.book);
		polymophicbc.base();
		polymophicbc.test();
	}
}
