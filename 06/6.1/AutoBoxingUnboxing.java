public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		Integer inobj = 5;
		Object boolobj = true;
		int it = inobj;
		if(boolobj instanceof Boolean)
		{
			boolean b = (Boolean)boolobj;
			System.out.println(b);
		}
	}
}
