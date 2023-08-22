package kr.co.himeida.staticzone03;

class Cat{
	static int  global = 5;
	int num =3 ;
	
	public void printValue(int num) {
		this.num = num;
		System.out.println("num : " + num);
		System.out.println("global : "+ Cat.global);
	}
}

public class GlobalVariableTest {
	
	public static void main(String[] args) {
		Cat.global = 10;
		
		Cat cat1 = new Cat();
		cat1.printValue(10);
	}
	
	

}
