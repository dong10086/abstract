package 课堂热身;
//抽象类中构造方法的使用

abstract class Person1
{
	String name;
	int age;
	String occupation;//定义职业
	public abstract String talk();//声明一个抽象方法talk()
}
class Student1 extends Person1//继承
{
public Student1 (String name ,int age, String occupation)
{
	this.name=name;
	this.age=age;
	this.occupation=occupation;
}
public String talk() //实现抽象方法talk()
{
	return "学生-->姓名："+this.name+",年龄："+this.age+",职业："+this.occupation+"! ";
}
}
class Worker extends Person1 //Worker 类继承Person
{
	public Worker(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()//实现抽象方法talk()
	{
		return "学生-->姓名："+this.name+",年龄："+this.age+",职业："+this.occupation+"! ";
	}
}
public class AbstractClassDemo {
	public static void main(String[] args)
	{
		Student1 s=new Student1("张三",20,"学生");//创建Student类对象
		Worker w=new Worker("李四",22,"程序员");
		System.out.println(s.talk());//调用被实现过的方法
		System.out.println(w.talk());
	}
}
