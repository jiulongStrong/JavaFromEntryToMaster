/**  
* @Title: UseTryCatchDemo.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-16 下午05:04:05
* @version V1.0  
*/ 
package chap6;
public class UseTryCatchDemo {
	public static void main(String[] args) {
		int[] array={1,2,3};
		try {
			array[3]=5;
		} catch (NullPointerException e) 
		{
			System.out.println("在求字符串长度的时候产生空指针异常");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("数组越界异常");
		}
		System.out.println("程勋正常退出");
	}
}
