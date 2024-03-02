class Base
{
	public String name;
	public double size;
	public Base(String name, double size)
	{
		this.name = name;
		this.size = size;
	}
}
public class Sub extends Base
{
	public String color;
	public Sub(String name, double size, String color)
	{
		super(name, size);
		this.color = color;
	}
	public static void main(String[] args)
	{
		var s = new Sub("测试对象", 5.6, "红色");
		System.out.println(s.size + "--" + s.name + s.color);
	}
}
