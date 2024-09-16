interface Product
{
	double getPrice();
	String getName();
}
public class AnonymousTest
{
	public void test(Product p)
	{
		System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
	}
	public static void main(String[] args)
	{
		var ta = new AnonymousTest();
		ta.test(new Product()
		{
			public double getPrice()
			{
				return 567.8;
			}
			public String getName()
			{
				return "Nvida 显卡";
			}
		});
	}
}
