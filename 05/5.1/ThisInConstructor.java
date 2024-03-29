public class ThisInConstructor
{
	// 定义一个名为foo的成员变量
	int foo;
	public ThisInConstructor()
	{
		// 在构造器中定义一个foo变量
		int foo = 0;
		// 使用this代表该构造器正在初始化的对象
		// 下面的代码将会把该构造器正在初始化的对象的foo成员变更设为6
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		// 所有使用ThisInConstructor创建的对象的foo成员变量都将被设为6
		// 所以下面的代码将输出6
		System.out.println(new ThisInConstructor().foo);
	}
}
