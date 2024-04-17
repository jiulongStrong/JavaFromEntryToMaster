
public class LuoJi {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=5;
		int b=3;
		boolean b1=(a>4)&(b<4);
		boolean b2=(a<4)|(b>4);
		boolean b3=!(a>4);
		System.out.println("使用与逻辑运算符的结果为"+b1);
		System.out.println("使用或逻辑运算符的结果为"+b2);
		System.out.println("使用非逻辑运算符的结果为"+b3);
		int c=6;
		boolean b4=(a<4)&&(a++<10);
		System.out.println("使用短路逻辑运算符的结果为"+b4);
	}
	
/*	public void method() {
		int n;
		{
			int k;
			n++;
		}
		k++;
	}
*/
}
