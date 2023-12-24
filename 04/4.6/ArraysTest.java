import java.util.Arrays;
public class ArraysTest
{
	public static void main(String[] args)
	{
		var a = new int[] {3, 4, 5, 6};
		var a2 = new int[] {3, 4, 5, 6};
		System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, a2));
		var b = Arrays.copyOf(a, 6);
		System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, b));
	}
}
