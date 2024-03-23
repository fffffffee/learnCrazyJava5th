import java.util.*;
class Person_6_4
{
	private int age;
	public Person_6_4() {}
	public Person_6_4(int age)
	{
		this.age = age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
}
public class FinalReferenceTest
{
	public static void main(String[] args)
	{
		final int[] iArr = {5, 6, 12, 9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		
		final var p = new Person_6_4(45);
		p.setAge(23);
		System.out.println(p.getAge());
		// p = null;
	}
}
