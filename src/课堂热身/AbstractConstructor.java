package ��������;
//�������й��췽���Ķ���ʹ��
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
	public abstract String talk(); //����һ�����󷽷�
	
	
}
	class Student2 extends Person2
	{
		public  Student2(String name,int age,String occupation)
		{
			//�����������ȷʹ�ó������еĹ��췽��
			super(name,age,occupation);
		}
		public String talk() //ʵ��talk()����
		{
			return "ѧ��-->������"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation+"! ";
		}
	}

public class AbstractConstructor {
	public static void main(String[] args)
	{
		Student2 s=new Student2("dong",10,"ѧ��");
		System.out.println(s.talk());//���ñ�ʵ�ֵķ���
	}
}
