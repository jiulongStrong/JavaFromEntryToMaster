
public class LuoJi {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a=5;
		int b=3;
		boolean b1=(a>4)&(b<4);
		boolean b2=(a<4)|(b>4);
		boolean b3=!(a>4);
		System.out.println("ʹ�����߼�������Ľ��Ϊ"+b1);
		System.out.println("ʹ�û��߼�������Ľ��Ϊ"+b2);
		System.out.println("ʹ�÷��߼�������Ľ��Ϊ"+b3);
		int c=6;
		boolean b4=(a<4)&&(a++<10);
		System.out.println("ʹ�ö�·�߼�������Ľ��Ϊ"+b4);
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
