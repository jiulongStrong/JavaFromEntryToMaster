/**  
 * @Title: ReturnDemo.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 上午08:55:45
 * @version V1.0  
 */

/**
 * @ClassName: ReturnDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 上午08:55:45
 *
 */
public class ReturnDemo {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for (int i = 0; i < 10; i++) {
			if (i<5) 
				System.out.println("第"+i+"次循环");
			else if(i==5)
				return;
			//the statement below will never execute
			else
				System.out.println("第"+i+"次循环");
			}
			
		}
	}
