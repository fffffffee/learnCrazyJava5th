public class ImmutableStringTest
{
	public static void main(String[] args)
	{
		var str1 = new String("hello");
		var str2 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
