package chap6;

public class TestprintStackTraceDemo {
	public static void main(String[] args) {
		method1();
	}
	static void method1()
	{
		method2();
	}
	static void method2()
	{
		String str=null;
		int n=str.length();
	}

}
