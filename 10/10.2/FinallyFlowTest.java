public class FinallyFlowTest
{
    public static void main(String[] args) throws Exception
    {
        boolean a = test();
        System.out.println(a);
    }
    public static boolean test()
    {
        try
        {
            return true;
        }
        finally
        {
            return false;
        }
    }
}
