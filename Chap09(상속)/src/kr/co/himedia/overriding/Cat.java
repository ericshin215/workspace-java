package kr.co.himedia.overriding;

public class Cat extends Animal{
	
	public Cat() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Cat 기본생성자 호출");
	}
	
	public void eat() {
		System.out.println("야옹이가 음식을 먹다");
		
		
	}
	
	public void nocturnal() {
		System.out.println("야옹이가 밤에 움직인다.");
	}
	
	
	

}
