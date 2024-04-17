import java.io.InputStreamReader;
import java.util.Scanner;

/**  
 * @Title: SelectionSort.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 下午04:37:27
 * @version V1.0  
 */

/**
 * @ClassName: SelectionSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 下午04:37:27
 *
 */
public class SelectionSort {

	/**
	 * @Title: main
	 * @Description: TODO(选择排序算法)
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
		//开始进行选择排序
		for (int i = 0; i < array.length; i++) {
			int index=i;
			double keyValue=array[i],temp;
			for (int j = i; j < array.length; j++) 
				if (array[j]<keyValue)
				{
					index=j;
					keyValue=array[j];
				}
			temp=array[i];
			array[i]=array[index];
			array[index]=temp;
		}
		//输出排序后的数组
		System.out.print("排序后的数组：");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		
	}

}
