package ��������;
//�������ģ��

abstract class Subject	//��������
{
	abstract public void request();
}
class RealSubject extends Subject	//��ʵ��ɫ����Ƴ��̣�
{
	public void request()	//ʵ�ֳ��󷽷�
	{
		System.out.println("���Ǻ�Ƴ��̣���ӭƷ��������");
	}
}
class ProxySubject extends Subject	//�����ɫ(������)
{
	private RealSubject realSubject;	//����ʵ��ɫ��Ϊ�����ɫ������
	public void request()	//�÷�����װ����ʵ�����request����
	{
		preRequest();
		if(realSubject == null)
		{
			realSubject =new RealSubject();
		}
		realSubject.request();//�˴�ִ����ʵ�����request����
		postRequest();
	}
	private void preRequest()
	{
		System.out.println("������������Ʒ��");
	//something you want to do before requesting	
	}
	private void postRequest()
	{
		System.out.println("����򣡣���");
	//	something you want to do after requesting
	}
}
public class Proxytese {
	public static void main(String[] args)//�ͻ�ֱ���Ҵ�����
	{
		Subject sub=new ProxySubject();//����Ϊ�ӿ�ʵ����
		sub.request();
	}
}
