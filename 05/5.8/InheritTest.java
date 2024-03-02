class Animal
{
	private void beat()
	{
		System.out.println("心跳中……");
	}
	public void breathe()
	{
		System.out.println("吸一口气，呼一口气……");
	}
}
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("我在天空自由的飞翔……");
	}
}
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("我在陆地上快速奔跑……");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		var b = new Bird();
		b.breathe();
		b.fly();
		var w = new Wolf();
		w.breathe();
		w.run();
	}
}
