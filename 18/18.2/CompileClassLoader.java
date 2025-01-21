import java.io.*;
import java.lang.reflect.*;
public class CompileClassLoader extends ClassLoader{
  private byte[] getBytes(String filename) throws IOException 
  {
    var file = new File(filename);
    long len = file.length();
    var raw = new byte[(int)len];
    try (
        var fin = new FileInputStream(file)
        ) {
      int r = fin.read(raw);
      if(r != len)
      {
        throw new IOException("无法读取全部文件：" + r + " != " + len);
      }
      return raw;
    }
  }
  private boolean compile(String javaFile) throws IOException
  {
    System.out.println("CompileClassLoader:正在编译" + javaFile + "...");
    Process p = Runtime.getRuntime().exec("javac " + javaFile);
    try {
      p.waitFor();
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }
    int ret = p.exitValue();
    return ret == 0;
  }
  protected Class<?> findClass(String name) throws ClassNotFoundException
  {
    Class clazz = null;
    String fileStub = name.replace(".", "/");
    String javaFilename = fileStub + ".java";
    String classFilename = fileStub + ".class";
    var javaFile = new File(javaFilename);
    var classFile = new File(classFilename);
    if(javaFile.exists() && (!classFile.exists() || javaFile.lastModified() > classFile.lastModified()))
    {
      try {
        if(!compile(javaFilename) || !classFile.exists())
        {
          throw new ClassNotFoundException("ClassNotFoundException:" + javaFilename);
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    if(classFile.exists())
    {
      try {
        byte[] raw = getBytes(classFilename);
        clazz = defineClass(name, raw, 0, raw.length);
      } catch (IOException ie) {
        ie.printStackTrace();
      }
    }
    return clazz;
  }
  public static void main(String[] args) throws Exception{
    if(args.length < 1)
    {
      System.out.println("缺少目标类，请按如下格式运行java源文件：");
      System.out.println("java CompileClassLoader ClassName");
    }
    String progClass = args[0];
    var progArgs = new String[args.length-1];
    System.arraycopy(args, 1, progArgs, 0, progArgs.length);
    var ccl = new CompileClassLoader();
    Class<?> clazz = ccl.loadClass(progClass);
    Method main = clazz.getMethod("main", (new String[0]).getClass());
    Object argsArray[] = {progArgs};
    main.invoke(null, argsArray);
  }
}
