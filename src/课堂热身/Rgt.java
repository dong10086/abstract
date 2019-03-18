package 课堂热身;

abstract class Pepoes
{
	String name;
	int age;
	String occupation;
	public abstract void teacher();
//	public abstract void Gongr();
}
 class Per extends Pepoes
{
	 public Per(String name,int age,String occupation)
	 {
	this.name=name;
	this.age=age;
	this.occupation=occupation;
	 }
	public void teacher()
	{
		System.out.println("教师-->姓名:"+name+" 年龄:"+age+" 职业:"+occupation);
	}

	
	
}
 class Per1 extends Per
 {
	 public Per1 (String name,int age,String occupation)
	 {
	    this.name=name;
		this.age=age;
		this.occupation=occupation;
	 }
	 public void teacher()
	 {
		 System.out.println("工人-->姓名:"+name+" 年龄:"+age+" 职业:"+occupation);
	 }
 }
public class Rgt {
	public static void main(String[] args)
	{
		Per p=new Per("刘三",50,"教师");
		Per1 a=new Per1("赵四",30,"工人");
		p.teacher();
		a.teacher();
	}
}
