package 课堂热身;

class Person
{
	String name="Dong";//定义姓名属性
	String addr="HaiNan";//定义地址属性
	String sex="男";//定义类型属性
	   int age=21;//定义年龄属性
	   
 public void talk()
 {
	 System.out.println("我叫:"+this.name+",我居住在:"+this.addr+",性别:"+this.sex+",年龄:"+this.age);
 }
}

class Student extends Person
{
	//新增加成员
       int Math=98;//数学
       int English=99;//英语
	
	//定义一个6参构造方法
	public void print1(String name,String addr,String sex,int age,int Math,int English)
	{
		System.out.println("我叫:"+name+"我居住在:"+age+"性别:"+sex+"年龄:"+age+"数学:"+Math+"英语:"+English);
	}
	
	//定义一个两参构造方法
	public void print2(int Math,int English)
	{
		System.out.println("数学:"+this.Math+"分"+"\n"+"英语"+this.English);
	}
	
	//定义一个无参构造方法
	public void print3()
	{
		System.out.println(" ");
	}
	
	//覆写输出方法talk()
	public void talk()
	{
		 System.out.println("我叫:"+this.name+",我居住在:"+this.age+
				 ",性别:"+this.sex+",年龄:"+this.age+",数学"+this.Math+",英语:"+this.English);
	}
}
public class Reshen {
	public static void main(String[] args)
	{
		Person p=new Person();
		p.talk();
		Person sc=new Student();//实例化Student
		sc.talk();//输出的是子类的方法talk
		Student sd=new Student();//强制转换(向下转型)
		sd.print1("dong","hainan","男",15,99,87);
	}
}
