/**  
 * @Title: ForEach.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 ����11:20:14
 * @version V1.0  
 */

/**
 * @ClassName: ForEach
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 ����11:20:14
 *
 */
public class ForEach {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum=0;
		int[][] nums=new int[4][4];
		int k=0;
		for (int i = 0; i < nums.length; i++) 
			for (int j = 0; j < nums[i].length; j++) 
				nums[i][j]=k++;
		
		//ʹ��˫��ѭ�����ʶ�ά����
		for (int x[]: nums) 
			for (int y : x)
			{
				System.out.println("����Ԫ�أ�"+y);
				sum+=y;
			}
		System.out.println("����Ԫ�غͣ�"+sum);
		
	}

}
