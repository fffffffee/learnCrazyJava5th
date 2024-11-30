class Apple<T extends Number>
{
  T size;
  public Apple()
  {}
  public Apple(T size)
  {
    this.size = size;
  }
  public void setSize(T size)
  {
    this.size = size;
  }
  public T getSize()
  {
    return this.size;
  }
}
public class ErasureTest
{
  public static void main(String[] args)
  {
      Apple<Integer> a = new Apple<>(6);
      Integer as = a.getSize();
      Apple b = a;
      Number size1 = b.getSize();
      Integer size2 = b.getSize();
  }
}
