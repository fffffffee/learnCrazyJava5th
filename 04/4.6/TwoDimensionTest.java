public class TwoDimensionTest
{
	public static void main(String[] args)
	{
		int[][] a;
		a = new int[4][];
		for (var aa : a)
		System.out.println(aa);
		a[0] = new int[2];
		a[0][1] = 6;
		for (var aaa : a[0])
		System.out.println(aaa);
	}
}
