public class StringCompareTest
{
	public static void main(String[] args)
	{
		var s1 = "疯狂Java";
		var s2 = "疯狂";
		var s3 = "Java";
		var s4 = "疯狂" + "Java";
		var s5 = "疯" + "狂" + "Java";
		var s6 = s2 + s3;
		var s7 = new String("疯狂Java");
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s7);
	}
}
