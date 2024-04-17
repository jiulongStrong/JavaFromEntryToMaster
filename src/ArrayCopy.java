/**  
 * @Title: ArrayCopy.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 下午04:10:30
 * @version V1.0  
 */

/**
 * @ClassName: ArrayCopy
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 下午04:10:30
 *
 */
public class ArrayCopy {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array1={1,2,3,4,5,6,7,8,9};
		int[] array2=new int[20];
		for (int i = 0; i < 10; i++) 
			array2[i]=10*i;
		System.arraycopy(array1, 0, array2, 10, array1.length);
		for (int i = 0; i < array2.length; i++) 
			System.out.println(array2[i]);
		System.out.println("输出array1");
		for (int i = 0; i < array1.length; i++) 
			System.out.println(array1[i]);
	}
}
