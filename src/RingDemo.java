import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * @Title: RingDemo.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 ����09:23:34
 * @version V1.0  
 */

/**
 * @ClassName: RingDemo
 * @Description: TODO()
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 ����09:23:34
 *
 */
public class RingDemo {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		final int N=20;
		String strln="";
		int base=1;
		System.out.println("������������������");
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(input);
		try {
			strln=buff.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		int n=Integer.parseInt(strln);
		int[][] a=new int[N][N];
		System.out.println("����������Ϊ"+n+"�������ξ���");
		for (int k = 0; k < (n/2); k++)  //n/2Ϊѭ�������������Ŀ
		{
			for (int i = k; i < n-1-k; i++) 	//��һ����
				a[k][i]=base++;
			for(int j=k+1;j<n-1-k;j++)	//�ڶ�����
				a[j][n-1-k]=base++;
			for (int i = n-1-k; i > k; i--)	//��������
				a[n-1-k][i]=base++;
			for (int j = n-1-k; j > k; j--)	//��������
				a[j][k]=base++;
			if(n%2==1)
				a[(n-1)/1][(n-1)/1]=base;	
		}
		
		//�������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) 
				System.out.printf("%4d",a[i][j]);
			System.out.println();				
			}			
	}

}
