package ��������;

class Instrument//������
{
	public void paly()
	{
		System.out.println("������ʹ��˵������������");
	}
}

class Wind extends Instrument//������
{
	//��дpaly()
	public void paly()
	{
		System.out.println("������ʹ�÷���������");
	}
}

class Percussion extends Instrument//�������
{
	public void paly()
	{
		System.out.println("�������ʹ�÷���������");
	}
}

class Stringed extends Instrument//������
{
	public void paly()
	{
		System.out.println("������ʹ�÷���������");
	}
}
public class Shizhan {
	public static void main(String[] args)
	{
		Instrument s;
		Instrument a=new Wind();
		Instrument b=new Percussion(); 
		Instrument c=new Stringed();
		s=a;
		s.paly();
		s=b;
		s.paly();
		s=c;
		s.paly();
		
		
	
		
		
	}
}
