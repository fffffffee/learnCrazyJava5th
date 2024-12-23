import java.io.*;
public class ThrowTest2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            new FileOutputStream("a.txt");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            throw ex;
        }
    }
}
