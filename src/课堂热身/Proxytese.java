package 课堂热身;
//代理设计模块

abstract class Subject	//代理请求
{
	abstract public void request();
}
class RealSubject extends Subject	//真实角色（红酒厂商）
{
	public void request()	//实现抽象方法
	{
		System.out.println("我是红酒厂商，欢迎品尝！！！");
	}
}
class ProxySubject extends Subject	//代理角色(代理商)
{
	private RealSubject realSubject;	//以真实角色作为代理角色的属性
	public void request()	//该方法封装了真实对象的request方法
	{
		preRequest();
		if(realSubject == null)
		{
			realSubject =new RealSubject();
		}
		realSubject.request();//此处执行真实对象的request方法
		postRequest();
	}
	private void preRequest()
	{
		System.out.println("广告宣传，免费品尝");
	//something you want to do before requesting	
	}
	private void postRequest()
	{
		System.out.println("付款购买！！！");
	//	something you want to do after requesting
	}
}
public class Proxytese {
	public static void main(String[] args)//客户直接找代理商
	{
		Subject sub=new ProxySubject();//子类为接口实例化
		sub.request();
	}
}
