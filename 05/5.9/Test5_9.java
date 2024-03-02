class Root
{
	static{
		System.out.println("Root的类初始化块");
	}
	{
		System.out.println("Root的实例初始化块");
	}
	public Root()
	{
		System.out.println("Root的无参数构造器");
	}
}
class Mid extends Root
{
	static{
		System.out.println("Mid的类初始化块");
	}
	{
		System.out.println("Mid的实例初始化块");
	}
	public Mid()
	{
		System.out.println("Mid的无参数构造器");
	}
	public Mid(String msg)
	{
		this();
		System.out.println("Mid的带参数构造器，其参数值：" + msg);
	}
}
class Leaf extends Mid
{
	static{
		System.out.println("Leaf的类初始化块");
	}
	{
		System.out.println("Leaf的实例初始化块");
	}
	public Leaf()
	{
		super("疯狂Java");
		System.out.println("Leaf的构造器");
	}
}
public class Test5_9
{
	public static void main(String[] args)
	{
	new Leaf();
	new Leaf();
	}
}
