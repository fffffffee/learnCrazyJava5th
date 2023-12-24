public class SwitchTest
{
	public static void main(String[] args)
	{
		//声明变量score，并为其赋值为‘C’
		var score = 'C';
		// 执行switch分支语句
		switch(score)
		{
			case 'A':
				System.out.println("优秀");
				break;
			case 'B':
				System.out.println("优秀");
				break;
			case 'C':
				System.out.println("中");
				break;
			case 'D':
				System.out.println("及格");
				break;
			case 'F':
				System.out.println("不及格");
				break;
			default:
				System.out.println("成绩输入错误");
				break;
		}
	}

}


