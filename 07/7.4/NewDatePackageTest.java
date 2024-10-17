import java.time.*;
public class NewDatePackageTest
{
  public static void main(String[] args)
  {
    // -----关于Clock的用法-----
    var clock = Clock.systemUTC();
    System.out.println("当前时刻为：" + clock.instant());
    System.out.println(clock.millis());
    System.out.println(System.currentTimeMillis());
    // -----关于Duration的用法-----
    var d = Duration.ofSeconds(6000);
    System.out.println("6000秒相当于：" + d.toMinutes() + "分");
    System.out.println("6000秒相当于：" + d.toHours() + "小时");
    System.out.println("6000秒相当于：" + d.toDays() + "天");
    var clock2 = Clock.offset(clock, d );
    System.out.println("当前时刻加6000秒为：" + clock2.instant());
    // -----关于Instant的用法-----
    var instant = Instant.now(); 
    System.out.println(instant);
    var instant2 = instant.plusSeconds(6000);
    System.out.println(instant2);
    // ToDo
  }
}
