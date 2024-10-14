public class ExecTest
{
    public static void main(String[] args) throws Exception
    {
       var rt = Runtime.getRuntime(); 
       //MacOs
       rt.exec("open -n /Applications/Notion.app");
    }
}
