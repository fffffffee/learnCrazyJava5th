public class ArrayUtils
{
    public static int search(String[] array, String target)
    {
        for(var i = 0; i < array.length; i++)
        {
            if(target != null && array[i].equals(target))
                return i;
        }
        return -1;
    }
}
