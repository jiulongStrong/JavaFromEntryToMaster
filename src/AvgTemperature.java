import java.util.Scanner;

/**  
 * @Title: AvgTemperature.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 ����04:44:23
 * @version V1.0  
 */

/**
 * @ClassName: AvgTemperature
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 ����04:44:23
 *
 */
public class AvgTemperature {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		double next,average,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��7����¶ȣ�");
		for (int i = 0; i < 7; i++)
		{
			next=sc.nextDouble();
			sum+=next;			
		}
		System.out.println(sum);
		average=sum/7;
		System.out.println("ƽ������Ϊ��"+average);
	}

}
