public class ArrayInRam
{
	public static void main(String[] args)
	{
		int[] a = {5, 7, 20};
		var b = new int[4];
		System.out.println("b数组的长度为:" + b.length);
		for(var aa : a)
		System.out.println(aa);	
		for(var bb : b)
		System.out.println(bb);	
		b = a;
		System.out.println("b数组的长度为:" + b.length);
	}
}

