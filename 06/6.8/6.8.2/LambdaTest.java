@FunctionalInterface
interface FkTest
{
	void run();
}
public class LambdaTest
{
	public static void main(String[] args)
	{
		Runnable r = () -> {
			for(var i = 0; i < 100; i++)
			{
				System.out.println(i);
			}
		};
		Object obj2 = (FkTest) () -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println();
			}
		};
	}
}
