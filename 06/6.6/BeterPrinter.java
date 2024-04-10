import lee.Output;
interface Product
{
	int getProduceTime();
}
public class BeterPrinter implements Output
{
	private String[] printData = new String[MAX_CACHE_LINE * 2];
	private int dataNum = 0;
	public void out()
	{
		while(dataNum > 0)
		{
			System.out.println("打印机打印：" + printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg)
	{
		if(dataNum > MAX_CACHE_LINE * 2)
		{
			System.out.println("输出队列已满，添加失败");
		}
		else
		{
			printData[dataNum++] = msg;
		}
	}
}
