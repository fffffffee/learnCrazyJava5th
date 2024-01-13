public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("只有一个字符串参数的test方法");
	}
	public void test(String... books)
	{
		System.out.println("****形参个数可变的test方法****");
	}
	public static void main(String[] args)
	{
		var olv = new OverloadVarargs();
		// 下面的两次调用将执行第二个test()方法
		olv.test();
		olv.test("aa","bb");
		// 下面的调用将执行第一个test()方法
		olv.test("aa");
		// 下面的调用将执行第二个test()方法
		olv.test(new String[] {"aa"});
	}
}
