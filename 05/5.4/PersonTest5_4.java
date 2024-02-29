public class PersonTest5_4
{
	public static void main(String[] args)
	{
		var p = new Person5_4();
		p.setAge(1000);
		System.out.println("未能设置age成员变量时：" + p.getAge());
		p.setAge(30);

		System.out.println("成功设置age成员变量后：" + p.getAge());
		p.setName("雄雄可喜");
		System.out.println(p.getName());
	}
}
