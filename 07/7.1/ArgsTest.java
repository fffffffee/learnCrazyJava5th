public class ArgsTest
{
    public static void main(String[] args)
    {
        System.out.println(args.length);        
        for(var arg : args)
        {
            System.out.println(arg);
        }
    }
}
