package ��������;
//��֤static������ڲ�������

abstract class Book
{
	public abstract void print();//���󷽷�
	
	static abstract class CD
	{//��̬�ڲ�������
		public abstract void get();//���󷽷�
	}
}
class JavaCD extends Book.CD //�̳г�����
{
	public void get()
	{
		System.out.println("Java ѧϰ");
	}
}

 public class StaticlnnerAbstarct {
	public static void main(String[] args)
	{
		Book.CD cd=new JavaCD();//ʵ��������
		cd.get();
	}
}
