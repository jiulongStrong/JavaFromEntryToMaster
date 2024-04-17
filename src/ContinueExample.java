/**  
 * @Title: ContinueExample.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-26 下午05:21:35
 * @version V1.0  
 */

/**
 * @ClassName: ContinueExample
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-26 下午05:21:35
 *
 */
public class ContinueExample {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("99乘法表");
		System.out.print(" ");
		for(int k=1;k<=9;k++)
			System.out.print(k+"      ");
		System.out.println();
		out:for (int i = 1; i < 10; i++) {
			System.out.print(i+" ");	//打印出是第几行
			for (int j = 1; j <10; j++) {				
				if (j>i) {
					System.out.println();
					continue out;
				}else {
					System.out.print(i+"*"+j+"="+i*j+" ");
				}	
			}			
		}
	}
}
