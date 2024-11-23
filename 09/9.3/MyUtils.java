import java.util.Collection;
import java.util.ArrayList;
public class MyUtils
{
    public static <T> T copy(Collection<? super T> dest, Collection<T> src)
    {
        T last = null;
        for(var ele : src)
        {
            last = ele;
            dest.add(ele);
        }
        return last;
    }
    public static void main(String[] args)
    {
        var ln = new ArrayList<Number>();
        var li = new ArrayList<Integer>();
        li.add(5);
        Integer last = copy(ln, li);
        System.out.println(ln);
    }
}
