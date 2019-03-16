package 课堂热身;
//抽象类中构造方法的定义使用
abstract class Person2
{
	String name;
	int age;
	String occupation;
	public Person2(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk(); //声明一个抽象方法
	
	
}
	class Student2 extends Person2
	{
		public  Student2(String name,int age,String occupation)
		{
			//在这里必须明确使用抽象类中的构造方法
			super(name,age,occupation);
		}
		public String talk() //实现talk()方法
		{
			return "学生-->姓名："+this.name+",年龄："+this.age+",职业："+this.occupation+"! ";
		}
	}

public class AbstractConstructor {
	public static void main(String[] args)
	{
		Student2 s=new Student2("dong",10,"学生");
		System.out.println(s.talk());//调用被实现的方法
	}
}
