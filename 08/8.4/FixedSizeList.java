import java.util.Arrays;
public class FixedSizeList
{
    public static void main(String[] args)
    {
        var fixedList = Arrays.asList("疯狂Java讲义", "轻量级Java EE企业应用实战");
        System.out.print(fixedList.getClass());
        fixedList.forEach(System.out::println);
        fixedList.add("疯狂Android讲义");
    }
}
