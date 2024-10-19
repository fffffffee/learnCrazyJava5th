import java.math.*;
public class Arith
{
    private static final int DEF_DIV_SCALE = 10;
    private Arith() {}
    public static double add(double v1, double v2)
    {
        var b1 = BigDecimal.valueOf(v1);
        var b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }
    public static void main(String[] args)
    {
        System.out.println("0.05 + 0.01 =" + Arith.add(0.05, 0.01));
    }
}
