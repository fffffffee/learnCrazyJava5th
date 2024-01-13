public class OverLoad
{
	public void test()
	{
		System.out.println("无参数");
	}
	public void test(String msg)
	{
		System.out.println("重载的test方法" + msg);
	}
	public static void main(String[] args)
	{
		var ol = new OverLoad();
		// 在调用test()方法时没有传入参数，因此系统调用上面没有参数的test()方法
		ol.test();
		ol.test("hello");
	}
}
