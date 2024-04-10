import lee.Output;
public class OutputFactory
{
	public Output getOutput()
	{
		return new BeterPrinter();
	}
	public static void main(String[] args)
	{
		var of = new OutputFactory();	
		var c = new Computer(of.getOutput());
		c.keyIn("轻量级JavaEE企业应用实战");
		c.keyIn("疯狂Java讲义");
		c.print();
	}
}
