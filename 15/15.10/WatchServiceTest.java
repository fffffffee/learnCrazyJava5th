import java.nio.file.*;
public class WatchServiceTest
{
  public static void main(String[] args) throws Exception
  {
    WatchService watchService = FileSystems.getDefault().newWatchService();
    Paths.get("C:/").register(watchService,
        StandardWatchEventKinds.ENTRY_CREATE,
        StandardWatchEventKinds.ENTRY_MODIFY,
        StandardWatchEventKinds.ENTRY_DELETE);
    while(true)
    {
      WatchKey key = watchService.take();
      for(WatchEvent<?> event : key.pollEvents())
      {
        System.out.println(event.context() + "文件发生了" + event.kind() + "");
      }
      boolean valid = key.reset();
      if(!valid)
      {
        break;
      }
    }
  }
}
