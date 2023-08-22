package kr.co.himeida.constructor03;

public class StudentTest {
	
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.getAge());
		
		
		Student student3 = new Student(30);
		System.out.println(student3);
		
		
		System.out.println();
		
		Student student4 = new Student("신재근");
		System.out.println(student4);
				
	}

}
