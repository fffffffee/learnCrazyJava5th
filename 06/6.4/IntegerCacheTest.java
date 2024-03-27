public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		var in1 = new Integer(6);
		var in2 = Integer.valueOf(6);
		var in3 = Integer.valueOf(6);
		System.out.println(in2 == in1);
		System.out.println(in2 == in3);
		var in4 = Integer.valueOf(200);
		var in5 = Integer.valueOf(200);
		System.out.println(in4 == in5);
	}
}
