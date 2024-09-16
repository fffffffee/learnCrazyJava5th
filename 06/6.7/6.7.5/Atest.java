interface A
{
	void test();
}
public class Atest
{
	public static void main(String[] args)
	{
		int age = 8;
		var a = new A()
		{
			public void test()
			{
				System.out.println(age);
			}
		};
		a.test();
	}
}
