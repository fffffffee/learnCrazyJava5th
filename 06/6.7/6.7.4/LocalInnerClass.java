public class LocalInnerClass
{
	public static void main(String[] args)
	{
		class InnerBase
		{
			int a;
		}
		class InnerSub extends InnerBase
		{
			int b;
		}
		var is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub对象的a和b实例变量是：" + is.a + "," + is.b);
	}
}
