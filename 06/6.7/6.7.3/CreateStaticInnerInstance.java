class StaticOut
{
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("静态内部类的构造器");
		}
	}
}
public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in = new StaticOut.StaticIn();
	}
}
