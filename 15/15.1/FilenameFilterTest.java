import java.io.*;
public class FilenameFilterTest
{
    public static void main(String[] args)
    {
        var file = new File(".");
        String[] nameList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
        for(var name : nameList)
        {
            System.out.println(name);
        }
    }
}
