public class StringSwitchTest
{
	public static void main(String[] args)
	{
		// 声明变量season
		var season = "夏天";
		// 执行switch语句
		switch(season)
		{
			case "春天":
				System.out.println("春暖花开.");
				break;
			case "夏天":
				System.out.println("夏日炎炎.");
				break;
			case "秋天":
				System.out.println("秋高气爽.");
				break;
			case "冬天":
				System.out.println("白雪皑皑.");
				break;
			default:
				System.out.println("季节输入错误！");
}
}
}
