@interface NotNull{}
interface Predator
{
	void prey(@NotNull String animal);
}
public class VarInLambda
{
	public static void main(String[] args)
	{
		var run = (Runnable)() -> {
			for(var i = 0; i < 100; i++)
			{
				System.out.println();		
			}
		};
		Predator predator = (@NotNull var animal) -> {
			System.out.println("老鹰正在猎捕" + animal);
		};
		predator.prey("兔子");
	}
}
