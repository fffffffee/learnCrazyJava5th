import java.util.Properties;
import java.io.*;
public class PropertiesTest
{
    public static void main(String[] args) throws Exception
    {
        var props = new Properties();
        props.setProperty("username", "yeeku");
        props.setProperty("password", "123456");
        props.store(new FileOutputStream("a.ini"), "comment line");
        var props2 = new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
    }
}
