/**  
 * @Title: twoD.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-6 上午11:03:47
 * @version V1.0  
 */

/**
 * @ClassName: twoD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-6 上午11:03:47
 *
 */
public class twoD {
	
	public static void main(String[] args) {
	int[][] twoD=new int[5][5];
	int k=1;
	//初始化
	for (int i = 0; i < twoD.length; i++) 
		for (int j = 0; j < twoD[i].length; j++) 
			twoD[i][j]=k++;
	
	//输出数组
	System.out.println("输出数组twoD：");
	for (int i = 0; i < twoD.length; i++) 
		{
		for (int j = 0; j < twoD[i].length; j++) 
			System.out.print(twoD[i][j]+"  ");
			System.out.println();
		}
	
	
	}
}
