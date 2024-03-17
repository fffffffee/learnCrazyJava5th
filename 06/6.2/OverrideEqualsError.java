class Person6_2
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
class Dog{}
public class OverrideEqualsError
{
	public static void main(String[] args)
	{
		var p = new Person6_2();
		System.out.println("Person对象是否equals Dog对象？" + p.equals(new Dog()));
		System.out.println("Person对象是否String对象？" + p.equals(new String("Hello")));
	}
}
