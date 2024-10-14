import java.util.Scanner;
import java.io.File;
public class ScannerFileTest
{
    public static void main(String[] args) throws Exception
    {
        var sc = new Scanner(new File("ScannerFileTest.java"));
        while(sc.hasNextLine())
        {
            System.out.println("键盘输入的内容是：" + sc.nextLine());
        }
    }
}
