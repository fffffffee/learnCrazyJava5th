public class FinalLocalVariableTest
{
	public void test(final int a)
	{
		// a = 5;
	}
	public static void main(String[] args)
	{
		final var str = "hello";
		// str = "java";
		final double d;
		d = 5.6;
		// d = 3.4;
	}
}
