import java.util.ArrayList;
import java.util.Collections;
public class SearchTest
{
    public static void main(String[] args)
    {
        var nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        Collections.replaceAll(nums, 0, 1);
        System.out.println(nums);
        System.out.println(Collections.frequency(nums, -5));
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(Collections.binarySearch(nums, 3));
    }
}
