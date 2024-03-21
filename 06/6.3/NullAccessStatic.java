public class NullAccessStatic
{
	private static void test()
	{
		System.out.println("static修饰的类方法");
	}
	public static void main(String[] args)
	{
		NullAccessStatic nas = null;
		nas.test();
	}
}
