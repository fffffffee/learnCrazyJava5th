public class PersonTest5_1
{
	public static void main(String[] args)
	{
		Person5_1 p;
		p = new Person5_1();
		// var p = new Person();
		// 访问p的name实例变量，直接为该变量赋值
		p.name = "李刚";
		// 调用p的say()方法，在声明say()方法时定义了一个形参
		// 调用该方法必须为形参拼写一个值
		p.say("Java语言很简单，学习很容易！");
		// 直接输出p的name实例变量，将输出 李刚
		System.out.println(p.name);
	}
}
