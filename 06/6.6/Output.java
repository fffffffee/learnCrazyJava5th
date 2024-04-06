package lee;
public interface Output
{
	int MAX_CACHE_LINE = 50;
	void out();
	void getData(String msg);
	default void print(String... msgs)
	{
		for(var msg : msgs)
		{
			System.out.println(msg);
		}
	}
	default void test()
	{
		System.out.println("默认的test()方法");
	}
	static String staticTest()
	{
		return "接口里的类方法";
	}
	private void foo()
	{
		System.out.println("foo私有方法");
	}
	private static void bar()
	{
		System.out.println("bar私有静态方法");
	}
}
