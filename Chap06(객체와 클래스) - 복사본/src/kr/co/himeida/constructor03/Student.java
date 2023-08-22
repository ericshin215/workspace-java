package kr.co.himeida.constructor03;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		System.out.println("기본 생성자 호출");
		
	}
	
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("매개변수가 String과 int가 있는 생성자 호출");
		
	}
	
	public Student(String name) {
		this.name = name;
		
		System.out.println("매개변수가 String만 있는 생성자 호출");
		
	}
	
	public Student( int age) {
		
		this.age = age;
		System.out.println("매개변수가 int만 있는 생성자 호출");
		
	}
	
	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
