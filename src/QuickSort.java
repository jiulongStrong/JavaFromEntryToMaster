import java.util.Scanner;

/**  
 * @Title: QuickSort.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-29 ����10:10:28
 * @version V1.0  
 */

/**
 * @ClassName: QuickSort
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-29 ����10:10:28
 *
 */
public class QuickSort {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] array=new int[7];
		Scanner scanner=new Scanner(System.in);
		System.out.println("����������7��double���ݣ�");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		System.out.print("����ǰ�����飺");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		System.out.println();
		
	}

}
