/**  
 * @Title: twoD.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-6 ����11:03:47
 * @version V1.0  
 */

/**
 * @ClassName: twoD
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-6 ����11:03:47
 *
 */
public class twoD {
	
	public static void main(String[] args) {
	int[][] twoD=new int[5][5];
	int k=1;
	//��ʼ��
	for (int i = 0; i < twoD.length; i++) 
		for (int j = 0; j < twoD[i].length; j++) 
			twoD[i][j]=k++;
	
	//�������
	System.out.println("�������twoD��");
	for (int i = 0; i < twoD.length; i++) 
		{
		for (int j = 0; j < twoD[i].length; j++) 
			System.out.print(twoD[i][j]+"  ");
			System.out.println();
		}
	
	
	}
}
