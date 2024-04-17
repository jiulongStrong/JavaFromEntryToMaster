import java.util.Scanner;

/**  
 * @Title: QuickSort.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-29 上午10:10:28
 * @version V1.0  
 */

/**
 * @ClassName: QuickSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-29 上午10:10:28
 *
 */
public class QuickSort {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array=new int[7];
		Scanner scanner=new Scanner(System.in);
		System.out.println("请随意输入7个double数据：");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		System.out.print("排序前的数组：");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		System.out.println();
		
	}

}
