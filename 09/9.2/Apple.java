public class Apple<T>
{
  private T info;
  public Apple(){}
  public Apple(T info)
  {
    this.info = info;
  }
  public void setInfo(T info)
  {
    this.info = info;
  }
  public T getInfo()
  {
    return this.info;
  }
  public static void main(String[] args)
  {
    Apple<String> a1 = new Apple<>("苹果");
    System.out.println(a1.getInfo());
    Apple<Double> a2 = new Apple<>(5.67);
    System.out.println(a2.getInfo());
  }
}
