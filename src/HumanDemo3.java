/**  
 * @Title: HumanDemo3.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 ����09:35:04
 * @version V1.0  
 */

class Human1{
	String name;
	String sex;
	int age;
	String addr;
	//�Զ��幹�캯��
	public Human1()
	{
		name=null;
		sex=null;
		age=0;
		addr=null;
	}
	
	public Human1(String hName,String hSex)
	{
		name=hName;
		sex=hSex;
		System.out.println("�ڶ������캯��������");
	}
	
	public Human1(String hName,String hSex,int hAge,String hAddr){
		this(hName, hSex);  //���õڶ������캯��
		age=hAge;
		addr=hAddr;
		System.out.println("���������캯��������");
	}
	void work()
	{
		System.out.println("���ڹ���");
	}
	void eat()
	{
		System.out.println("���ڳԷ�");
	}
}

/**
 * @ClassName: HumanDemo3
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 ����09:35:04
 *
 */
public class HumanDemo3 {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Human1 lisi=new Human1("����", "��", 25, "�й�����");
		System.out.println("���ĵ���Ϣ��");
		System.out.println("������"+lisi.name+"\n �Ա�"+lisi.sex+"\n ���䣺"+lisi.age+"\n ��ַ��"+lisi.addr);
	}

}
