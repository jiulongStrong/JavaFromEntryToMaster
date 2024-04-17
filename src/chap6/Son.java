package chap6;

public class Son extends Father {
	String str="子类的str成员变量";
	void show()
	{
		System.out.println(super.str);
	}
}
