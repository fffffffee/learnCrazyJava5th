public class AutoConversion
{
	public static void main(String[] args)
	{
		int a = 6;
		// int类型可以自动转换为float类型
		float f = a;
		// 下面将输出6.0
		System.out.println(f);
		// 定义一个byte类型的整数变更
		byte b = 9;
		// 下面代码将出错，byte类型不能自动类型转换为char类型
		// char c = b;
		// byte类型变更可以自动类型转换为double类型
		double d = b;
		// 下面将输出9.0
		System.out.println(d);
	}
}
