/**  
 * @Title: ArgsDemo.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 下午03:50:05
 * @version V1.0  
 */

/**
 * @ClassName: ArgsDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 下午03:50:05
 *
 */
public class ArgsDemo {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("共接收"+args.length+"个参数");
		for (int i = 0; i < args.length; i++)			
			System.out.println("第"+i+"个参数"+args[i]);
	}

}
