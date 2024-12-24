import java.util.*;
public class ErrorUtils
{
    @SafeVarargs
    public static void faultMethod(List<String>... listStrArray)
    {
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<>();
        myList.add(new Random().nextInt(100));
        listArray[0] = myList;
        String s = listStrArray[0].get(0);
    }
}
