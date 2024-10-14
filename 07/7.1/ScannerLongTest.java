import java.util.Scanner;
public class ScannerLongTest
{
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        while(sc.hasNextLong())
        {
            System.out.println("键盘输入的内容是：" + sc.nextLong());
        }
    }
}
