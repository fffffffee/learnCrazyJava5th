public class PrivateFinalMethodTest
{
	private final void test() {}
}
class Sub extends PrivateFinalMethodTest
{
	public void test() {}
}
