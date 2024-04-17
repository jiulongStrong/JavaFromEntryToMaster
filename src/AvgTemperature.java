import java.util.Scanner;

/**  
 * @Title: AvgTemperature.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 下午04:44:23
 * @version V1.0  
 */

/**
 * @ClassName: AvgTemperature
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 下午04:44:23
 *
 */
public class AvgTemperature {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		double next,average,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一周7天的温度：");
		for (int i = 0; i < 7; i++)
		{
			next=sc.nextDouble();
			sum+=next;			
		}
		System.out.println(sum);
		average=sum/7;
		System.out.println("平均气温为："+average);
	}

}
