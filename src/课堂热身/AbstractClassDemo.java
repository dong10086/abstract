package ��������;
//�������й��췽����ʹ��

abstract class Person1
{
	String name;
	int age;
	String occupation;//����ְҵ
	public abstract String talk();//����һ�����󷽷�talk()
}
class Student1 extends Person1//�̳�
{
public Student1 (String name ,int age, String occupation)
{
	this.name=name;
	this.age=age;
	this.occupation=occupation;
}
public String talk() //ʵ�ֳ��󷽷�talk()
{
	return "ѧ��-->������"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation+"! ";
}
}
class Worker extends Person1 //Worker ��̳�Person
{
	public Worker(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()//ʵ�ֳ��󷽷�talk()
	{
		return "ѧ��-->������"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation+"! ";
	}
}
public class AbstractClassDemo {
	public static void main(String[] args)
	{
		Student1 s=new Student1("����",20,"ѧ��");//����Student�����
		Worker w=new Worker("����",22,"����Ա");
		System.out.println(s.talk());//���ñ�ʵ�ֹ��ķ���
		System.out.println(w.talk());
	}
}
