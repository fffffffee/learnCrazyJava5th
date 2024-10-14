public class IdentityHashCodeTest
{
    public static void main(String[] args)
    {
        var s1 = new String("Hello");
        var s2 = new String("Hello");
        System.out.println(s1.hashCode() + "----" + s2.hashCode());
        System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
        var s3 = "java";
        var s4 = "java";
        System.out.println(System.identityHashCode(s3) + "----" + System.identityHashCode(s4));
    }
}
