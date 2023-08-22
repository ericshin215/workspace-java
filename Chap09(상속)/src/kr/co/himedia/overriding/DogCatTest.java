package kr.co.himedia.overriding;

public class DogCatTest {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
		
		System.out.println();
//		
		//업캐스팅
		Animal animal = new Dog();
		animal.eat();
		
		
		//다운캐스팅
		Dog dog2 = (Dog)animal;
		dog2.chase();
		
		
		((Dog)animal).chase();
	}

}
