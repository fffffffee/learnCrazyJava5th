import java.util.Set;
public class Java9Collection
{
    public static void main(String[] args)
    {
        var set = Set.of("Java","Kotlin","Go","Swift");
        System.out.println(set);
        set.add("Ruby");
    }
}
