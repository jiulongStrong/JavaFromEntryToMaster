
public class ZiZengJian {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a1=3;
		int a2=3;
		int a3=3;	//“=”的优先级高于“++”、“--”
		int a4=3;
		int b1=++a1;
		int b2=a2++;
		int b3=--a3;
		int b4=a4--;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
