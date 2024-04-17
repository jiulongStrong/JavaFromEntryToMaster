import java.io.IOException;

public class DoWhileLoop {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char n=0;
		do {
			System.out.println("1:选择1");
			System.out.println("2:选择2");
			System.out.println("3:选择3");
			try {
				n=(char)System.in.read();	//必须与throw字句一起使用，否则会抛出异常
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				System.out.print("Exception caught!");
			}
			switch (n) {
			case '1':
				System.out.println("选择1");
				break;
			case '2':
				System.out.println("选择2");
				break;
			case '3':
				System.out.println("选择3");
				break;

			default:
				System.out.println("输入非法");
				break;
			}
		} while (n<'1'|n>'3');	//循环的条件		
		
	}

}
