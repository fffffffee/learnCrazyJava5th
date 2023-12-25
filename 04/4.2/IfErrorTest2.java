public class IfErrorTest
{
	public static void main(String[] args)
	{
		var age = 45;
		if (age > 20)
		{
			System.out.println("青年人");
		}
		if (age > 40 && !(age>20))		
		{
			System.out.println("中年人");
		}
		else if (age > 60 && !(age >20) && !(age > 40 && !(age > 20)))		
		{
			System.out.println("老年人");
		}
}
}
