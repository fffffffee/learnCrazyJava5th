public class Cow
{
	private double weight;
	public Cow(){}
	public Cow(double weight)
	{
		this.weight = weight;
	}

	private class CowLeg
	{
		private double length;
		private String color;

		public CowLeg(){}
		public CowLeg(double length, String color)
		{
			this.length = length;
			this.color = color;
		}
		// length & color 的setter和getter方法
		// todo
		public void info()
		{
			System.out.println("当前牛腿的颜色是：" + color + "，高：" + length);
			System.out.println("本牛腿所在奶牛重：" + weight);
		}
	}
	public void test()
	{
		var cl = new CowLeg(1.12, "黑白相间");
		cl.info();
	}
	public static void main(String[] args)
	{
		var cow = new Cow(378.9);
		cow.test();
	}
}
