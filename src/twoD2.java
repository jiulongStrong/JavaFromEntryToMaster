/**  
 * @Title: twoD2.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-6 下午04:59:34
 * @version V1.0  
 */

/**
 * @ClassName: twoD2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-6 下午04:59:34
 *
 */
public class twoD2 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] twoD=new int[5][5];
		int k=1;
		//初始化
		for (int i = 0; i < twoD.length; i++) 
			for (int j = 0; j < twoD[i].length; j++) 
				twoD[i][j]=k++;
		
		int[] array1=new int[5];
		array1=twoD[0];
		twoD[0]=twoD[4];
		twoD[4]=array1;
		System.out.println("得到的一位数组array1：");
		for (int i = 0; i < array1.length; i++) 
			System.out.print(array1[i]+"	");
		System.out.println();
		System.out.println("交换后的二维数组twoD：");
		for (int i = 0; i < twoD.length; i++) 
		{
		for (int j = 0; j < twoD[i].length; j++) 
			System.out.print(twoD[i][j]+"	");
			System.out.println();
		}
	}

}
