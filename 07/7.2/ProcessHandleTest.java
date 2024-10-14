import java.util.concurrent.*;
public class ProcessHandleTest
{
    public static void main(String[] args) throws Exception
    {
       var rt = Runtime.getRuntime(); 
       Process p = rt.exec("open -n /Applications/Notion.app");
       ProcessHandle ph = p.toHandle();
       System.out.println("进程是否运行：" + ph.isAlive());
       System.out.println("进程ID：" + ph.pid());
       System.out.println("父进程：" + ph.parent());
       
       ProcessHandle.Info info = ph.info();
       System.out.println("进程命令：" + info.command());
       System.out.println("进程参数：" + info.arguments());
       System.out.println("进程启动时间：" + info.startInstant());
       System.out.println("进程累计运行时间：" + info.totalCpuDuration());
       CompletableFuture<ProcessHandle> cf = ph.onExit();
       cf.thenRunAsync(() -> {System.out.println("程序退出");});
       Thread.sleep(5000);
    }
}
