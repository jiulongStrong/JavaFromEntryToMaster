import java.util.Scanner;

/**  
 * @Title: BubbleSort.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-29 上午09:56:00
 * @version V1.0  
 */

/**
 * @ClassName: BubbleSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-29 上午09:56:00
 *
 */
public class BubbleSort {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] array=new double[7];
		Scanner scanner=new Scanner(System.in);
		System.out.println("请随意输入7个double数据：");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextDouble();
		System.out.print("排序前的数组：");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		System.out.println();
		double temp;
		//开始进行冒泡排序
		for (int i = 0; i < array.length; i++) 
			for (int j = i; j < array.length; j++) 
				if (array[j]<array[i]) 
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
		System.out.print("排序后的数组：");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
	}
}
