public class ConstructorOverload
{
	public String name;
	public int count;
	//提供无参数的构造器
	public ConstructorOverload()
	{
	}
	//提供带两个参数的构造器
	public ConstructorOverload(String name, int count)
	{
		this.name = name;
		this.count =count; 
	}
	public static void main(String[] args)
	{
		var co1 = new ConstructorOverload();
		var co2 = new ConstructorOverload("Java" , 10000);
		System.out.println(co1.name + " " + co1.count);
		System.out.println(co2.name + " " +co2.count);
	}
}
