public class ReturnTest
{
	public static void main(String[] args)
	{
		for(var i=0; i<10; i++)
		{
			System.out.println("i的值是:"+i);
			if(i==2)
			{
				return;
			}
			System.out.println("return后的输出语句");
		}
	}
}
