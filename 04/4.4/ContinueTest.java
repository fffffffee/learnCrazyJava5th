public class ContinueTest
{
	public static void main(String[] args)
	{
		// 一个简单的for循环
		for(var i=0; i<3; i++)
		{
			System.out.println("i的值是:" + i);
			if(i == 1)
			{
				// 忽略本次循环的剩下语句
				continue;
			}
			System.out.println("continue输出后的语句");
		}
	}
}
