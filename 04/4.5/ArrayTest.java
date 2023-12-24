public class ArrayTest
{
	public static void main(String[] args)
	{
		// 定义一个int数组类型的变量，变量名为intArr
		int[] intArr;
		// 使用静态初始化，初始化数组时只指定数组元素的初始值，不指定数组长度
		intArr = new int[] {5, 6, 7, 8};
		// 定义一个Object数组类型的变量，变量名为objArr
		Object[] objArr;
		// 使用静态初始化，初始化数组时数组元素的类型是定义数组时所指定的数组元素类型的子类
		objArr = new String[]{"Java", "李刚"};
		Object[] objArr2 = {"Java", "李刚"};
		// 数组的定义和初始化同时完成，使用动态初始化语法
		int[] prices = new int[5];
		Object[] books = new String[4];	
		// 编译器推断names变量的类型是String[]
		var names = new String[] {"yeeku", "nono"};
		// 编译器推断weightArr变量的类型是double[]
		var weightArr = new double[4];
		// 输出objArr数组的第二个元素
		System.out.println(objArr[0]);
		objArr2[1] = "Spring";
		// 访问数组元素指定的索引值等于数组长度，所以下面代码将在运行时出现异常
		// System.out.println(objArr2[2]);
		// 使用循环输出prices数组的每个数组元素的值
		for (var i = 0; i < prices.length; i++)
		{
			System.out.println(prices[i]);		
		}

		books[0] = "疯狂Java讲义";
		books[1] = "轻量级Java EE企业应用实战";
		// 使用循环输出books数组的每个元素值
		for(var i = 0; i < books.length; i++)
		{
			System.out.println(books[i]);
		}
	}
}

