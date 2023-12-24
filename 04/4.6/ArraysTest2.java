import java.util.Arrays;
public class ArraysTest2
{
	public static void main(String[] args)
	{
		var arr1 = new int[]{3, -4, 25, 16, 30, 18};
		// 对数组arr1进行迸发排序
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		var arr2 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(arr2, new IntBinaryOperator()
		{
			public int applyAsInt(int left, int right)
			{
				return left * right; 
			}
		});	
		System.out.println(Arrays.toString(arr2));
		
	}
}
