package kr.co.himedia.overriding;

public class ObjectCasting {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println();
		
		Animal animal = new Dog();
		animal.eat();
		
		Animal animal2 = new Cat();
		animal2.eat();
		
		System.out.println();
		
		Dog ddog = (Dog)animal;
		
		ddog.chase();
		System.out.println();
		
		Cat ccat = (Cat)animal2;
		ccat.nocturnal();
		
		

	}
	
	
}
