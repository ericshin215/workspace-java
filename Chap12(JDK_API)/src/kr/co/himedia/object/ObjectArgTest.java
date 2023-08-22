package kr.co.himedia.object;

public class ObjectArgTest {
	
	public static void main(String[] args) {
		A a = new A();
		himedia(a);
		
		B b = new B();
		himedia(b);
		
	}
	
	public static void himedia(Object obj) {
		if(obj instanceof A) {
			((A)obj).printGo();
		}
		else
			((B)obj).printGo();
	}

}
