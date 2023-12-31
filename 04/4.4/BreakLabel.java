public class BreakLabel
{
	public static void main(String[] args)
	{
		//外层循环，outer作为标识符
		outer:
		for(var i=0; i<5; i++)
		{
			//内层循环
			for(var j=0; j<3; j++)
			{

				System.out.println("i的值是:"+i+" j的值是:"+j);
				if(j==1)
				{
					//执行该语句时将结束循环
					break outer;
				}
			}
		}
	}
}
