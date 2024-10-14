public class RuntimeTest
{
    public static void main(String[] args)
    {
        var rt = Runtime.getRuntime();
        System.out.println("处理器数量是：" + rt.availableProcessors());
        System.out.println("空闲内存数：" + rt.freeMemory());
        System.out.println("总内存数：" + rt.totalMemory());
        System.out.println("可用最大内存数：" + rt.maxMemory());
    }
}
