import java.util.Scanner;
public class ScannerKeyBoardTest
{
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}
