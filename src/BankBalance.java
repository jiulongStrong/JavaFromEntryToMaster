/**  
 * @Title: BankBalance.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 上午10:37:28
 * @version V1.0  
 */

/**
 * @ClassName: BankBalance
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 上午10:37:28
 *
 */
public class BankBalance {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//一个一维数组标识利率
		double rate[]={5.00/100,5.05/100,6.00/100,6.05/100};
		//二维数组标识账单
		int[][] bankBlance=new int[10][4];
		//初始化本金为1000
		for (int i = 0; i < rate.length; i++) 
			bankBlance[0][i]=1000;
		//计算账单的值
		for (int i = 0; i < bankBlance.length; i++) 
			for (int j = 0; j < rate.length; j++)
			{
				double inc=bankBlance[i-1][j]*rate[j];
				bankBlance[i][j]=(int)(bankBlance[i-1][j]+inc);				
			}
		//打印出结果
		
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
