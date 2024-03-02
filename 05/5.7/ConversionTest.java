public class ConversionTest
{
	public static void main(String[] args)
	{
		var d = 13.4;
		var l = (long)d;
		System.out.println(l);
		var in = 5;

		Object obj = "Hello";
		var objStr = (String)obj;
		System.out.println(obj);
	}
}
