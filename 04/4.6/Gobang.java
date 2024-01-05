import java.io.*;
public class Gobang
{
	// 定义棋盘的大小
	private static int BOARD_SIZE = 15;
	// 定义一个二维数组来充当棋盘
	private String[][] board;

	public void initBoard()
	{
		// 初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		// 将每个数组元素赋值为“+”，用于在控制台输出棋盘
		for (int i=0; i < BOARD_SIZE; i++)
		{
			for (int j=0; j < BOARD_SIZE; j++)
			{
				board[i][j] = "+";
			}
		}
	}

	// 在控制台输出棋盘
	public void printBoard()
	{
		// 打印每个数组元素
		for (int i=0; i < BOARD_SIZE; i++)
		{
			for (int j=0; j < BOARD_SIZE; j++)
			{
				// 打印数组元素后不换行
				System.out.print(board[i][j]);
			}
			// 每打印完一行数组元素后，就输出一个换行符
			System.out.print("\n");
		}
	}
	public static void main(String[] args) throws Exception
	{
		var gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
		// 这是用于获取键盘输入的方法
		var br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		// br.readline(): 每当从键盘输入一行内容后按回车键，刚输入的内容就被br读取到
		while((inputStr = br.readLine()) != null)
		{
			// 将用户输入的字符串以逗号（,）作为分隔符，分隔成两个字符串
			String[] posStrArr = inputStr.split(",");
			// 将两个字符串转换成用户下棋的坐标
			var xPos = Integer.parseInt(posStrArr[0]);
			var yPos = Integer.parseInt(posStrArr[1]);
			// 将对应的数组元素赋值为“•”
			gb.board[yPos - 1][xPos - 1] = "•";
			/**
			 * 计算机随机生成两个整数，作为计算机下棋的坐标，赋值给board数组
			 * 还涉及
			 * 1. 坐标的有效性，只能是数字，不能超出棋盘范围
			 * 2. 不能重复下棋
			 * 3. 每次下棋后，需要扫描谁赢了
			 */
			gb.printBoard();
			System.out.println("请输入您下棋的坐标，应以x，y的格式：");
		}

	}
}
