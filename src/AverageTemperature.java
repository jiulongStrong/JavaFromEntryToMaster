import java.util.Scanner;

/**  
 * @Title: AverageTemperature.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 ����03:26:04
 * @version V1.0  
 */

/**
 * @ClassName: AverageTemperature
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 ����03:26:04
 *
 */
public class AverageTemperature {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double average,sum=0;
		double[] temperature=new double[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��7����¶ȣ�");
		for (int count = 0; count < temperature.length; count++) 
		{
			temperature[count]=sc.nextDouble();
			sum+=temperature[count];			
		}
		average=sum/7;
		for (int count = 0; count < temperature.length; count++) {
			if (temperature[count]<average) 
				System.out.println("��"+(count+1)+"�����µ���ƽ������");
			else if (temperature[count]>average) 
				System.out.println("��"+(count+1)+"�����¸���ƽ������");
			else 
				System.out.println("��"+(count+1)+"�����µ���ƽ������");			
		}
	}

}
