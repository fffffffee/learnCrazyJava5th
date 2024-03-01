public class ConstructorTest
{
	public String name;
	public int count;
	//提供自定义构造器，包含2个参数
	public ConstructorTest(String name, int count)
	{
		this.name = name;
		this.count = count;
	}	
	public static void main(String[] args)
	{
		var ct = new ConstructorTest("雄雄可喜", 9000);
		System.out.println(ct.name);
		System.out.println(ct.count);
	}
}
