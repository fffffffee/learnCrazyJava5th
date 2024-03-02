public class Ostrich extends Bird
{
	public void fly()
	{
		System.out.println("我只能在地上奔跑………");
	}
	public static void main(String[] args)
	{
		var os = new Ostrich();
		os.fly();
	}
}
