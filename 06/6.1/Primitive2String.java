public class Primitive2String
{
	public static void main(String[] args)
	{
		var intStr = "123";
		var it1 = Integer.parseInt(intStr);
		var it2 = Integer.valueOf(intStr);
		System.out.println(it2);

		var floatStr = "4.56";
		var ft1 = Float.parseFloat(floatStr);
		var ft2 = Float.valueOf(floatStr);
		System.out.println(ft2);
		var ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		var dbStr = String.valueOf(3.344);
		System.out.println(dbStr);

		var boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
