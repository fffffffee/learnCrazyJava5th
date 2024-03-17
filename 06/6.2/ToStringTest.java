class Apple
{
	private String color;
	private double weight;
	public Apple() { }
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	public void setColor(String color)
	{
		this.color = color;	
	}
	public String getColor()
	{
		return this.color;	
	}
	public void setWeight(double weight)
	{
		this.weight = weight;	
	}
	public double getWeight()
	{
		return this.weight;	
	}
	public String toString()
	{
		return "一个苹果，颜色是：" + color + "，重量是：" + weight;
	}
}
public class ToStringTest
{
	public static void main(String[] args)
	{
		var a = new Apple("红色", 5.68);
		System.out.println(a);
	}
}

