/**  
* @Title: InnerClassDemo.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-11 下午05:22:25
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: InnerClassDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-11 下午05:22:25
 *
 */

//外部类
class Outer
{
	String out_string="String in Outer";
	void useInner1()
	{
		Inner1 in1=new Inner1();
		in1.print();
	}
	void useInner2()
	{
		inner2 in2=new inner2();
		in2.print();
	}
	
	//非静态内部类
	class Inner1
	{
		String in_string1="string in inner1";
		void print()
		{
			System.out.println("Inner1.print()");
			//可以直接使用宿主类的变量
			System.out.println("use\'"+out_string+"\'");
		}
	}
	
	//静态内部类
	static class inner2
	{
		String in_string1="string in inner2";
		void print()
		{
			System.out.println("Inner2.print()");
//			System.out.println("use\'"+out_string+"\'");
			//需要使用对象来访问宿主类的变量
			Outer outer=new Outer();
			System.out.println("Outer.out_string="+outer.out_string);
		}
	}
}

public class InnerClassDemo {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Outer out=new Outer();
		out.useInner1();
		out.useInner2();
	}
}
