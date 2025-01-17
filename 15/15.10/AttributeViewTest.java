import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.*;
import java.nio.charset.*;
import java.nio.*;
public class AttributeViewTest
{
  public static void main(String[] args) throws Exception
  {
    Path testPath = Paths.get("AttributeViewTest.java");
    BasicFileAttributeView basicView = Files.getFileAttributeView(testPath, BasicFileAttributeView.class);
    BasicFileAttributes basecAttribs = basicView.readAttributes();
    System.out.println("创建时间：" + new Date(basecAttribs.creationTime().toMillis()));
    System.out.println("最后访问时间：" + new Date(basecAttribs.lastAccessTime().toMillis()));
    System.out.println("最后修改时间：" + new Date(basecAttribs.lastModifiedTime().toMillis()));
    System.out.println("文件大小：" + basecAttribs.size());
    FileOwnerAttributeView ownerView = Files.getFileAttributeView(testPath, FileOwnerAttributeView.class);
    System.out.println(ownerView.getOwner());
    UserPrincipal user = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("ldx");
    ownerView.setOwner(user);
    UserDefinedFileAttributeView userView = Files.getFileAttributeView(testPath, UserDefinedFileAttributeView.class);
    List<String> attrNames = userView.list();
    for(var name : attrNames)
    {
      ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
      userView.read(name, buf);
      buf.flip();
      String value = Charset.defaultCharset().decode(buf).toString();
      System.out.println(name + "--->" + value);
    }
    userView.write("发行者", Charset.defaultCharset().encode("疯狂java联盟"));
    DosFileAttributeView dosView = Files.getFileAttributeView(testPath, DosFileAttributeView.class);
    dosView.setHidden(true);
    dosView.setReadOnly(true);
  }
}
