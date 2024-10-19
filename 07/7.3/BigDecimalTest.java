import java.math.*;
public class BigDecimalTest
{
    public static void main(String[] args)
    {
        var f1 = new BigDecimal("0.05");
        var f2 = BigDecimal.valueOf(0.01);
        var f3 = new BigDecimal(0.05);
        System.out.println("使用String作为BigDecimal构造器参数：");
        System.out.println("0.05 + 0.01 =" + f1.add(f2));
        System.out.println("使用Double作为BigDecimal构造器参数：");
        System.out.println("0.05 + 0.01 =" + f3.add(f2));
    }
}
