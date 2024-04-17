/**  
 * @Title: twoD3.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 上午10:22:58
 * @version V1.0  
 */

/**
 * @ClassName: twoD3
 * @Description: TODO(不规则数组的实现)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 上午10:22:58
 *
 */
public class twoD3 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] twoD=new int[4][];
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		twoD[3]=new int[4];
		
		int k=1;
		for (int i = 0; i < twoD.length; i++) 
			for (int j = 0; j < twoD[i].length; j++) 
				twoD[i][j]=k++;
		System.out.println("得到的不规则数组为：");
		for (int i = 0; i < twoD.length; i++) 
		{
			for (int j = 0; j < twoD[i].length; j++) 
				System.out.print(twoD[i][j]+"	");
			System.out.println();
			
		}
	}

}
