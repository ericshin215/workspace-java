package kr.co.himedia.arraylist03;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentL = new Student(1001, "Lee");
		studentL.addBook("운영체제1", "인공지능");
		studentL.addBook("운영체제2", "구글");
		
		Student studentS = new Student(1002, "Shin");
		studentS.addBook("딥러닝1", "세종대왕");
		studentS.addBook("딥러닝2", "세종대왕");
		studentS.addBook("딥러닝3", "세종대왕");
		
		Student studentK = new Student(1003, "Kim");
		studentK.addBook("머신러닝1", "정도전");
		studentK.addBook("머신러닝2", "정도전");
		studentK.addBook("머신러닝3", "정도전");
		studentK.addBook("머신러닝4", "정도전");
		studentK.addBook("머신러닝5", "정도전");
		studentK.addBook("머신러닝6", "정도전");
		
		studentL.showInfo();
		studentS.showInfo();
		studentK.showInfo();
	}

}
