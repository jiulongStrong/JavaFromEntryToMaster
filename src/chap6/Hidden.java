package chap6;

public class Hidden {	
	public static void main(String[] args) {
		Son son=new Son();
		System.out.println("子类对象访问str");
		System.out.println(son.str);
		System.out.println("子类对象访问父类的str");
		son.show();
	}
}
