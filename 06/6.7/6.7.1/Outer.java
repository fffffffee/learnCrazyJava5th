public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void accessOuterProp()
		{
			System.out.println("外部类的outProp值：" + outProp);
		}
	}
	public void accessInnerProp()
	{
		System.out.println("内部类的inProp值：" + new Inner().inProp);
	}
	public static void main(String[] args)
	{
		var out = new Outer();
		out.accessInnerProp();
	}
}
