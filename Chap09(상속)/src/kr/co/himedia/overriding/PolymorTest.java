package kr.co.himedia.overriding;

public class PolymorTest {
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();
		
		((Cat)animal).eat();
		
	}
	

}
