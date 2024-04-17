/**  
* @Title: CallConstructor.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-10 下午05:24:08
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: CallConstructor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 下午05:24:08
 *
 */
class A	{
	A(){
		System.out.println("调用A的构造函数");
	}
	A(int i){
		System.out.println("调用A的有参构造函数");
	}
}
class B	extends A{
	B(){
		System.out.println("调用B的构造函数");
	}
	B(int i){
		super(5);	//调用父类的有参构造函数
		System.out.println("调用B的有参构造函数");
	}
}
class C	extends B{
	C(){
		System.out.println("调用C的构造函数");
	}
	C(int i){
		super(5);	//调用父类的有参构造函数
		System.out.println("调用C的有参构造函数");
	}
}

public class CallConstructor {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		C c=new C();
		C c0=new C(5);
	}
}
