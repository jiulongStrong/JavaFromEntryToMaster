package chap6;

public class HumanDemo2 {
	public static void main(String[] args) {
		Address addr=new Address("中国", "广东", "广州", "XX街");
		Human2 lisi=new Human2("李四", "男", 25, addr);
		System.out.println("李四的个人信息："+"\n"+lisi.toString());		
	}
}
