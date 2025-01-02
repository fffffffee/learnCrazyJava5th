import java.io.*;
import java.lang.annotation.*;
import java.util.*;
import javax.swing.*;
@Target(ElementType.TYPE_USE)
@interface NotNull
{}

@NotNull
public class TypeAnnotationTest implements @NotNull Serializable
{
    public static void main(String[] args) throws @NotNull FileNotFoundException
    {
        Object obj = "fkjava.org";
        String str = (@NotNull String) obj;
        Object win = new @NotNull JFrame("疯狂软件");
    }
    public void foo(List<@NotNull String> info){}
}
