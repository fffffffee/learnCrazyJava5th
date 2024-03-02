class Parent
{
	public String tag ="疯狂Java讲义";
}
class Derived extends Parent
{
	private String tag = "轻量级Java EE企业实践";
}
public class HideTest
{
	public static void main(String[] args)
	{
		var d = new Derived();
		//System.out.println(d.tag);
		System.out.println(((Parent)d).tag);
	}
}
