/**  
 * @Title: BankBalance.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 ����10:37:28
 * @version V1.0  
 */

/**
 * @ClassName: BankBalance
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 ����10:37:28
 *
 */
public class BankBalance {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//һ��һά�����ʶ����
		double rate[]={5.00/100,5.05/100,6.00/100,6.05/100};
		//��ά�����ʶ�˵�
		int[][] bankBlance=new int[10][4];
		//��ʼ������Ϊ1000
		for (int i = 0; i < rate.length; i++) 
			bankBlance[0][i]=1000;
		//�����˵���ֵ
		for (int i = 0; i < bankBlance.length; i++) 
			for (int j = 0; j < rate.length; j++)
			{
				double inc=bankBlance[i-1][j]*rate[j];
				bankBlance[i][j]=(int)(bankBlance[i-1][j]+inc);				
			}
		//��ӡ�����
		
		System.out.print("years"+"	");
		System.out.println("5.00%"+"	"+"5.05%"+"	"+"6.00%"+"	"+"6.05%");
		for (int i = 0; i < bankBlance.length; i++) 
		{
			System.out.print(i+"	");
			for (int j = 0; j < bankBlance[i].length; j++) 
				System.out.print(bankBlance[i][j]+"	");
			System.out.println();
			
		}
	}

}
