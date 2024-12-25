@Inheritable
class Base
{}
public class InheritableTest extends Base
{
    public static void main(String[] args)
    {
        System.out.println(InheritableTest.class.isAnnotationPresent(Inheritable.class));
    }
}
