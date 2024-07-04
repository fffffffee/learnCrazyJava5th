public class InnerNoStatic
{
	private class InnerClass
	{
		static
		{
			System.out.println("=====");
		}
		private static int inProp;
		private static void test(){}
	}
}
