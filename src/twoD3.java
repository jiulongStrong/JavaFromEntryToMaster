/**  
 * @Title: twoD3.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 ����10:22:58
 * @version V1.0  
 */

/**
 * @ClassName: twoD3
 * @Description: TODO(�����������ʵ��)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 ����10:22:58
 *
 */
public class twoD3 {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] twoD=new int[4][];
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		twoD[3]=new int[4];
		
		int k=1;
		for (int i = 0; i < twoD.length; i++) 
			for (int j = 0; j < twoD[i].length; j++) 
				twoD[i][j]=k++;
		System.out.println("�õ��Ĳ���������Ϊ��");
		for (int i = 0; i < twoD.length; i++) 
		{
			for (int j = 0; j < twoD[i].length; j++) 
				System.out.print(twoD[i][j]+"	");
			System.out.println();
			
		}
	}

}
