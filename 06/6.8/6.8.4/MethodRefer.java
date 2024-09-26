import javax.swing.*;

@FunctionalInterface
interface Converter
{
	Integer convert(String from);
}
@FunctionalInterface
interface MyTest
{
	String test(String a, int b, int c);
}
@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}
public class MethodRefer
{
	public static void main(String[] args)
	{
		//Converter converter1 = from -> Integer.valueOf(from);
		Converter converter1 = Integer::valueOf;
		Integer val = converter1.convert("99");
		System.out.println(val);
		//converter2
		Converter converter2 = from -> "fkit.org".indexOf(from);
		Integer value = converter2.convert("it");
		System.out.println(value);
		//MyTest
		MyTest mt = String::substring;
		String str = mt.test("Java I Love you", 2, 9);
		System.out.println(str);
		//YourTest
		YourTest yt = a -> new JFrame(a);
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);
	}
}

