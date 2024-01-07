public class MultiplicationTable
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<i+1; j++)
			{
				System.out.print(i+"X"+j+"="+i*j);
				if(j != i)
				{
					System.out.print(",");
				}
			}
			System.out.print("\n");
		}
	}
}
