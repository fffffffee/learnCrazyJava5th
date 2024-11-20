public class A2 extends Apple
{
  public String getInfo()
  {
    return "子类" + super.getInfo().toString();
  }
}
