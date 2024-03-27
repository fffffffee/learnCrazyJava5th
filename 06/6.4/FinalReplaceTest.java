public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		final var a = 5 + 2;		
		final var b = 1.2 / 3;		
		final var str = "疯狂" + "Java";
		final var book = "疯狂Java讲义:" + 99.0;
		final var book2 = "疯狂Java讲义:" + String.valueOf(99.0);
		System.out.println(book == "疯狂Java讲义:99.0");
		System.out.println(book2 == "疯狂Java讲义:99.0");
	}
}
