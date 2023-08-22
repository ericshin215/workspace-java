package kr.co.himedia.arraylist03;


import java.util.*;

public class Student {
	
	private int studentid;
	private String studentName;
	ArrayList<Book> bookList;
	public Student(int studentid, String studentName) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		bookList = new ArrayList<>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		
		bookList.add(book);
	}
	
	public void showInfo() {
		System.out.println(this.studentName+"학생이 읽은 책은 : ");
		
		for(Book book :bookList)
			System.out.print(book.getTitle()+" ");
		
		System.out.println(" 입니다.");
		
	}

}
