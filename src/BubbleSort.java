import java.util.Scanner;

/**  
 * @Title: BubbleSort.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-29 ����09:56:00
 * @version V1.0  
 */

/**
 * @ClassName: BubbleSort
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-29 ����09:56:00
 *
 */
public class BubbleSort {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
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
		double temp;
		//��ʼ����ð������
		for (int i = 0; i < array.length; i++) 
			for (int j = i; j < array.length; j++) 
				if (array[j]<array[i]) 
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
		System.out.print("���������飺");
		for (int j = 0; j < array.length; j++) 
			System.out.print(array[j]+",");
	}
}
