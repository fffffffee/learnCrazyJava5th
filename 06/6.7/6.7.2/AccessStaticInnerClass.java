public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp()
	{
		System.out.println(StaticInnerClass.prop1);
		System.out.println(new StaticInnerClass().prop2);
	}
}
