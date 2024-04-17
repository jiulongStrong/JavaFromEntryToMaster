
public class WeiYuanSuanFu {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=6; //二进制码为0110
		int b=3;	//二进制码为0011
		int i1=a&b;
		int i2=a|b;
		int i3=a^b;
		int i4=~b;//&0x0f
		System.out.println("执行与运算符的结果等于"+i1);
		System.out.println("执行或运算符的结果等于"+i2);
		System.out.println("执行异或运算符的结果等于"+i3);
		System.out.println("执行非运算符的结果等于"+i4);
	}

}
