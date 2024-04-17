/**  
* @Title: InnerClassDemo2.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-12 上午10:21:55
* @version V1.0  
*/ 
package chap6;



/**
 * @ClassName: InnerClassDemo2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-12 上午10:21:55
 *
 */

//外部类
class Outer1
{
	String out_string="String in Outer";
	void print()
	{
		//创建内部类对象
		Inner1 in1=new Inner1();
		//通过对象访问非静态内部类的属性
		System.out.println(in1.in_string1);
		//直接访问静态内部类的属性
		System.out.println(Inner2.in_string2);
	}
	
	
	//非静态内部类
	class Inner1
	{
		String in_string1="string in inner1";
		Inner1()
		{
			System.out.println("constructor in inner1");
		}
		class inClass_In_Inner1{}
	}
	
	//静态内部类
	static class Inner2
	{
		static class staticClass_In_Inner2{}
		static String in_string2="string in inner2";
		Inner2()
		{
			System.out.println("constructor in inner2");
		}
	}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		// 创建Outer类的对象
		Outer1 outer1=new Outer1();
		outer1.print();
		//使用类的内部类
		Outer1.Inner1 in1=new Outer1().new Inner1();
		Outer1.Inner2 in2=new Outer1.Inner2();
		Outer1.Inner1.inClass_In_Inner1 inin2=new Outer1().new Inner1().new inClass_In_Inner1();
		Outer1.Inner1.inClass_In_Inner1 inin1=in1.new inClass_In_Inner1();
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(inin1);
		System.out.println(inin2);
	}
}
