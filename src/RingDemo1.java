import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * @Title: RingDemo1.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 ����04:03:10
 * @version V1.0  
 */

/**
 * @ClassName: RingDemo1
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 ����04:03:10
 *
 */
public class RingDemo1 {

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
		System.out.println("������������������");
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(input);
		try {
			strln=buff.readLine();
		} catch (IOException e)
		{
			// TODO: handle exception
			System.out.println(e.toString());
		}
		int int1=Integer.parseInt(strln);
		int n=int1;
		System.out.println("����������Ϊ"+n+"�������ξ���");
		int intA=1;
		int[][] a=new int[N][N];
		int intB;
		if (n%2!=0)
		{
			intB=n/2+1;
		} else 		
			intB=n/2;
		for (int i = 0; i < intB; i++) 
		{
			for (int j = i; j < n-i; j++) 
				a[i][j]=intA++;
			for (int k = i+1; k < n-i; k++) 
				a[k][n-i]=intA++;
			for (int l = n-2-i; l > i; l--) 
				a[n-1-i][l]=intA++;
			for (int m = n-2-i; m > i; m--) 
				a[m][i]=intA++;			
		}
		
		//�������
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d",a[i][j]);				
			}
			System.out.println();
		}
		
	}

}
