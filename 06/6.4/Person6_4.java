class Name
{
	private String firstName;
	private String lastName;
	public Name() {}
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = firstName;
	}
}
public class Person6_4
{
	private final Name name;
	public Person6_4(Name name)
	{
		this.name = name;
	}
	public Name getName()
	{
		return name;
	}
	public static void main(String[] args)
	{
		var n = new Name("悟空", "孙");
		var p = new Person6_4(n);
		System.out.println(p.getName().getFirstName());
		n.setFirstName("八戒");
		System.out.println(p.getName().getFirstName());
		n.setFirstName("八戒");
	}
}
