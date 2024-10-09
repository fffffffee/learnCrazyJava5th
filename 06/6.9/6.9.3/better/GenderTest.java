public class GenderTest
{
  public static void main(String[] args)
  {
    Gender g = Gender.valueOf("FEMALE");
    g.setName("女");
    System.out.println(g + "代表" + g.getName());
    g.setName("男");
    System.out.println(g + "代表" + g.getName());
  }
}
