import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * @Title: RingDemo.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 上午09:23:34
 * @version V1.0  
 */

/**
 * @ClassName: RingDemo
 * @Description: TODO()
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 上午09:23:34
 *
 */
public class RingDemo {

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
		int base=1;
		System.out.println("请输入矩阵的行列数：");
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
		System.out.println("这是行列数为"+n+"的螺旋形矩阵：");
		for (int k = 0; k < (n/2); k++)  //n/2为循环次数或矩形数目
		{
			for (int i = k; i < n-1-k; i++) 	//第一区块
				a[k][i]=base++;
			for(int j=k+1;j<n-1-k;j++)	//第二区块
				a[j][n-1-k]=base++;
			for (int i = n-1-k; i > k; i--)	//第三区块
				a[n-1-k][i]=base++;
			for (int j = n-1-k; j > k; j--)	//第四区块
				a[j][k]=base++;
			if(n%2==1)
				a[(n-1)/1][(n-1)/1]=base;	
		}
		
		//输出矩阵
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) 
				System.out.printf("%4d",a[i][j]);
			System.out.println();				
			}			
	}

}
