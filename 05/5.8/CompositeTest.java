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
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	//重新定义breathe()
	public void breathe()
	{
		a.breathe();
	}
	public void fly()
	{
		System.out.println("我在天空自由的飞翔……");
	}
}
class Wolf extends Animal
{
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	//重新定义breathe()
	public void breathe()
	{
		a.breathe();
	}
	public void run()
	{
		System.out.println("我在陆地上快速奔跑……");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		var a1 = new Animal();
		var b = new Bird(a1);
		b.breathe();
		b.fly();

		var a2 = new Animal();
		var w = new Wolf(a2);
		w.breathe();
		w.run();
	}
}
