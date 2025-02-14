import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.nio.charset.*;
public class FilesTest
{
  public static void main(String[] args) throws Exception
  {
    Files.copy(Paths.get("FilesTest.java"), new FileOutputStream("a.txt")); 
    System.out.println("FilesTest.java是否为隐藏文件：" + Files.isHidden(Paths.get("FilesTest.java")));
    List<String> lines = Files.readAllLines(Paths.get("FilesTest.java"), Charset.forName("utf-8"));
    System.out.println(lines);
    System.out.println("FilesTest.java的大小为：" + Files.size(Paths.get("FilesTest.java")));
    List<String> poem = new ArrayList<>();
    poem.add("水晶潭底银鱼跃");
    poem.add("清徐风中碧竿横");
    Files.write(Paths.get("poem.txt"), poem, Charset.forName("gbk"));
    Files.list(Paths.get(".")).forEach(path -> System.out.println(path));
    Files.lines(Paths.get("FilesTest.java"), Charset.forName("utf-8")).forEach(line -> System.out.println(line));
    FileStore cStore = Files.getFileStore(Paths.get("C:"));
    System.out.println("C:共有空间：" + cStore.getTotalSpace());
    System.out.println("C:可用空间：" + cStore.getUsableSpace());
  }
}
