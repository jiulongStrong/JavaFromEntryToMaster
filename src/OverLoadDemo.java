/**  
 * @Title: OverLoadDemo.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 下午03:54:51
 * @version V1.0  
 */

/**
 * @ClassName: OverLoadDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 下午03:54:51
 *
 */
public class OverLoadDemo {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	
	void method()
	{
		System.out.println("无参数方法调用");
	}
//	void method(int a)
//	{
//		System.out.println("参数为int类型被调用");
//	}
	void method(double a)
	{
		System.out.println("参数为int类型被调用");
	}
	void method(String b)
	{
		System.out.println("参数为String类型被调用");
	}
	void method(int a,double b)
	{
		System.out.println("参数为int、double类型被调用");
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		OverLoadDemo ov=new OverLoadDemo();
		//依据参数调用不同的方法
		ov.method();
		ov.method("what is up?");
		ov.method(5);
		ov.method(3,4.5d);
	}

}
