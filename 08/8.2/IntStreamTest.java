import java.util.stream.*;
public class IntStreamTest
{
    public static void main(String[] args)
    {
        var is = IntStream.builder()
            .add(20)
            .add(13)
            .add(-2)
            .add(18)
            .build();
        System.out.println("is所有元素的最大值：" + is.max().getAsInt());
        System.out.println("is所有元素的最小值：" + is.min().getAsInt());
        System.out.println("is所有元素的总和：" + is.sum());
        System.out.println("is所有元素的总数：" + is.count());
        System.out.println("is所有元素的平均值：" + is.average());
        System.out.println("is所有元素的平方是否都大于20：" + is.allMatch(ele -> ele * ele > 20));
        System.out.println("is是否包含平方大于20的元素：" + is.anyMatch(ele -> ele * ele > 20));
        var newIs = is.map(ele -> ele * ele +1);
        newIs.forEach(System.out::println);
    }
}
