public class Apple<T extends Number>
{
  T col;
  public static void main(String[] args)
  {
    Apple<Integer> ai = new Apple<>();
    Apple<Double> ad = new Apple<>();
    Apple<String> as = new Apple<>();
  }
}
