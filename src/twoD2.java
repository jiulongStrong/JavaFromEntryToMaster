/**  
 * @Title: twoD2.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-6 ����04:59:34
 * @version V1.0  
 */

/**
 * @ClassName: twoD2
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-6 ����04:59:34
 *
 */
public class twoD2 {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] twoD=new int[5][5];
		int k=1;
		//��ʼ��
		for (int i = 0; i < twoD.length; i++) 
			for (int j = 0; j < twoD[i].length; j++) 
				twoD[i][j]=k++;
		
		int[] array1=new int[5];
		array1=twoD[0];
		twoD[0]=twoD[4];
		twoD[4]=array1;
		System.out.println("�õ���һλ����array1��");
		for (int i = 0; i < array1.length; i++) 
			System.out.print(array1[i]+"	");
		System.out.println();
		System.out.println("������Ķ�ά����twoD��");
		for (int i = 0; i < twoD.length; i++) 
		{
		for (int j = 0; j < twoD[i].length; j++) 
			System.out.print(twoD[i][j]+"	");
			System.out.println();
		}
	}

}
