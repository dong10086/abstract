package ��������;

class Person
{
	String name="Dong";//������������
	String addr="HaiNan";//�����ַ����
	String sex="��";//������������
	   int age=21;//������������
	   
 public void talk()
 {
	 System.out.println("�ҽ�:"+this.name+",�Ҿ�ס��:"+this.addr+",�Ա�:"+this.sex+",����:"+this.age);
 }
}

class Student extends Person
{
	//�����ӳ�Ա
       int Math=98;//��ѧ
       int English=99;//Ӣ��
	
	//����һ��6�ι��췽��
	public void print1(String name,String addr,String sex,int age,int Math,int English)
	{
		System.out.println("�ҽ�:"+name+"�Ҿ�ס��:"+age+"�Ա�:"+sex+"����:"+age+"��ѧ:"+Math+"Ӣ��:"+English);
	}
	
	//����һ�����ι��췽��
	public void print2(int Math,int English)
	{
		System.out.println("��ѧ:"+this.Math+"��"+"\n"+"Ӣ��"+this.English);
	}
	
	//����һ���޲ι��췽��
	public void print3()
	{
		System.out.println(" ");
	}
	
	//��д�������talk()
	public void talk()
	{
		 System.out.println("�ҽ�:"+this.name+",�Ҿ�ס��:"+this.age+
				 ",�Ա�:"+this.sex+",����:"+this.age+",��ѧ"+this.Math+",Ӣ��:"+this.English);
	}
}
public class Reshen {
	public static void main(String[] args)
	{
		Person p=new Person();
		p.talk();
		Person sc=new Student();//ʵ����Student
		sc.talk();//�����������ķ���talk
		Student sd=new Student();//ǿ��ת��(����ת��)
		sd.print1("dong","hainan","��",15,99,87);
	}
}
