class Person6_2_2
{
	private String name;
	private String idStr;
	public Person6_2_2() {}
	public Person6_2_2(String name, String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setIdStr(String idStr)
	{
		this.idStr = idStr;
	}
	public String getIdStr()
	{
		return this.idStr;
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Person6_2_2.class)
		{
			var person6_2_2Obj = (Person6_2_2)obj;
			if(this.getIdStr().equals(person6_2_2Obj.getIdStr()))
			{
				return true;
			}
		}
		return false;
	}
}
public class OverrideEqualsRight
{
	public static void main(String[] args)
	{
		var p1 = new Person6_2_2("孙悟空", "12343433433");
		var p2 = new Person6_2_2("孙行者", "12343433433");
		var p3 = new Person6_2_2("孙悟饭", "99933433");
		System.out.println("p1和p2是否相等？" + p1.equals(p2));
		System.out.println("p2和p3是否相等？" + p2.equals(p3));
	}
}
