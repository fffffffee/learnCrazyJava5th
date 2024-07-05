public class StaticInnerClassTest
{
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		private static int age;
		public void accessOuterProp()
		{
			System.out.println(prop1);
			System.out.println(prop2);
		}
	}
}
