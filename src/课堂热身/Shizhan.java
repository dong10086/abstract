package 课堂热身;

class Instrument//乐器类
{
	public void paly()
	{
		System.out.println("大乐器使用说明。。。。。");
	}
}

class Wind extends Instrument//管乐器
{
	//覆写paly()
	public void paly()
	{
		System.out.println("管乐器使用方法！！！");
	}
}

class Percussion extends Instrument//打击乐器
{
	public void paly()
	{
		System.out.println("打击乐器使用方法！！！");
	}
}

class Stringed extends Instrument//弦乐器
{
	public void paly()
	{
		System.out.println("弦乐器使用方法！！！");
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
