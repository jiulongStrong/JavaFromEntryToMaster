/**  
 * @Title: ForEach.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 上午11:20:14
 * @version V1.0  
 */

/**
 * @ClassName: ForEach
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 上午11:20:14
 *
 */
public class ForEach {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		int[][] nums=new int[4][4];
		int k=0;
		for (int i = 0; i < nums.length; i++) 
			for (int j = 0; j < nums[i].length; j++) 
				nums[i][j]=k++;
		
		//使用双重循环访问二维数组
		for (int x[]: nums) 
			for (int y : x)
			{
				System.out.println("数组元素："+y);
				sum+=y;
			}
		System.out.println("数组元素和："+sum);
		
	}

}
