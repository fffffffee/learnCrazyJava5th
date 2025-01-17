import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
public class FileVisitorTest
{
  public static void main(String[] args) throws Exception
  {
    Files.walkFileTree(Paths.get("c:", "Users", "ldx", "coding", "learnCrazyJava5th", "15"), new SimpleFileVisitor<Path>()
        {
          @Override
          public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
          {
            System.out.println("正在访问" + file + "文件");
            if(file.endsWith("FileVisitorTest.java"))
            {
              System.out.println("---已经找到目标文件---");
              return FileVisitResult.TERMINATE;
            }
            return FileVisitResult.CONTINUE;
          }
          @Override
          public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
          {
            System.out.println("正在访问：" + dir + "路径");
            return FileVisitResult.CONTINUE;
          }
        });
  }
}
