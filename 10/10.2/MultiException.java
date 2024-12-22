public class MultiException
{
    public static void main(String[] args)
    {
        try
        {
            var a = Integer.parseInt(args[0]);
            var b = Integer.parseInt(args[1]);
            var c = a / b;
            System.out.println("您输入的两个数相除的结果是：" + c);
        }
        catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
        {
            System.out.println("程序发生了数组越界、数字格式异常、算术异常之一");
            ie = new ArithmeticException("test");
        }
        catch(Exception e)
        {
            System.out.println("未知异常");
            e = new RuntimeException("test");
        }
    }
}
