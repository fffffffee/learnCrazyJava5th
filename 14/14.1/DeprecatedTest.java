class Apple
{
    @Deprecated(since = "9", forRemoval = true)
    public void info()
    {
        System.out.println("Apple的info方法");
    }
}
public class DeprecatedTest
{
    public static void main(String[] args)
    {
        new Apple().info();
    }
}
