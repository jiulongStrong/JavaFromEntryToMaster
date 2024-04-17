/**  
* @Title: Class_In_Method.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-12 下午05:26:47
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: Class_In_Method
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-12 下午05:26:47
 *
 */
public class Class_In_Method {
	void doit()
	{
		//方法中定义的类
		class Class_in_method
		{
		
			Class_in_method()
			{
				System.out.println("Constructor of class in method");
			}
		}
		new Class_in_method();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Class_In_Method cim=new Class_In_Method();
		cim.doit();
	}
	
}
