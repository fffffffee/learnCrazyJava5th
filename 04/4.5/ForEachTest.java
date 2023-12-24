public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] books = {"疯狂Java讲义","疯狂Android讲义", "Thinking in Java"};
		for (var book : books)
		{
			System.out.println(book);
		}
	}
}
