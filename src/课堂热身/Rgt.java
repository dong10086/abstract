package ��������;

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
		System.out.println("��ʦ-->����:"+name+" ����:"+age+" ְҵ:"+occupation);
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
		 System.out.println("����-->����:"+name+" ����:"+age+" ְҵ:"+occupation);
	 }
 }
public class Rgt {
	public static void main(String[] args)
	{
		Per p=new Per("����",50,"��ʦ");
		Per1 a=new Per1("����",30,"����");
		p.teacher();
		a.teacher();
	}
}
