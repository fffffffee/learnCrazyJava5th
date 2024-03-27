public class StringJoinTest
{
	public static void main(String[] args)
	{
		var s1 = "疯狂Java";
		var s2 = "疯狂" + "Java";
		System.out.println(s1 == s2);
		var str1 = "疯狂";
		var str2 = "Java";
		var s3 = str1 + str2;
		System.out.println(s1 == s3);
	}
}
