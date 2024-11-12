import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class SynchronizedTest
{
    public static void main(String[] args)
    {
        var c = Collections.synchronizedCollection(new ArrayList());
        var list = Collections.synchronizedList(new ArrayList());
        var s = Collections.synchronizedSet(new HashSet());
        var m = Collections.synchronizedMap(new HashMap());
    }
}
