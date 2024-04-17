import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * @Title: RingDemo1.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 下午04:03:10
 * @version V1.0  
 */

/**
 * @ClassName: RingDemo1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 下午04:03:10
 *
 */
public class RingDemo1 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int N=20;
		String strln="";		
		System.out.println("请输入矩阵的行列数：");
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
		System.out.println("这是行列数为"+n+"的螺旋形矩阵：");
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
		
		//输出矩阵
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d",a[i][j]);				
			}
			System.out.println();
		}
		
	}

}
