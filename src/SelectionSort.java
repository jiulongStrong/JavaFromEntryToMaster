import java.io.InputStreamReader;
import java.util.Scanner;

/**  
 * @Title: SelectionSort.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 ����04:37:27
 * @version V1.0  
 */

/**
 * @ClassName: SelectionSort
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 ����04:37:27
 *
 */
public class SelectionSort {

	/**
	 * @Title: main
	 * @Description: TODO(ѡ�������㷨)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double[] array=new double[7];
		Scanner scanner=new Scanner(System.in);
		System.out.println("����������7��double���ݣ�");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextDouble();
		System.out.print("����ǰ�����飺");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		System.out.println();
		//��ʼ����ѡ������
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
		//�������������
		System.out.print("���������飺");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
		
	}

}
