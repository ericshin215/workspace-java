package kr.co.himedia.interface04;

public class HiMediaClassTest {
	
	public static void main(String[] args) {
		HiMediaClass hClass = new HiMediaClass();
		hClass.x();
		hClass.notify();
		hClass.myMethod();
		
		X xClass = hClass;
		xClass.x();
		
		Y yClass = hClass;
		yClass.y();
		
		HimediaInterFace hClazz = hClass;
		hClazz.myMethod();
		
	}

}
