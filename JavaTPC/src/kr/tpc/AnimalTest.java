package kr.tpc;

public class AnimalTest {
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		Animal ani = new Cat();
		
		ani.eat();
		((Cat)ani).night();
		
	
		
		
		
	

	}
	
}
