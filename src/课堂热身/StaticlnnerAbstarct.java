package 课堂热身;
//验证static定义的内部抽象类

abstract class Book
{
	public abstract void print();//抽象方法
	
	static abstract class CD
	{//静态内部抽象类
		public abstract void get();//抽象方法
	}
}
class JavaCD extends Book.CD //继承抽象类
{
	public void get()
	{
		System.out.println("Java 学习");
	}
}

 public class StaticlnnerAbstarct {
	public static void main(String[] args)
	{
		Book.CD cd=new JavaCD();//实例化对象
		cd.get();
	}
}
