public class EqualTest
{
	public static void main(String[] args)
	{
		var it = 65;
		var fl = 65.0f;
		System.out.println("65和65.0f是否相等？" + (it == fl));
		var ch = 'A';
		System.out.println("65和'A'是否相等？" + (it == ch));
		var str1 = new String("hello");
		var str2 = new String("hello");
		System.out.println("str1 和 str2 是否相等？" + (str1 == str2));
		System.out.println("str1是否equals str2？" + (str1.equals(str2)));
		//System.out.pritnln("hello" == new EqualTest());
	}
}
