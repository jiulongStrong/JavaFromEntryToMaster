import java.io.IOException;

public class DoWhileLoop {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char n=0;
		do {
			System.out.println("1:ѡ��1");
			System.out.println("2:ѡ��2");
			System.out.println("3:ѡ��3");
			try {
				n=(char)System.in.read();	//������throw�־�һ��ʹ�ã�������׳��쳣
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.print("Exception caught!");
			}
			switch (n) {
			case '1':
				System.out.println("ѡ��1");
				break;
			case '2':
				System.out.println("ѡ��2");
				break;
			case '3':
				System.out.println("ѡ��3");
				break;

			default:
				System.out.println("����Ƿ�");
				break;
			}
		} while (n<'1'|n>'3');	//ѭ��������		
		
	}

}
