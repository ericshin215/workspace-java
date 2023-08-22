package kr.co.himedia.array2;

public class ShallowCopy {
	
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬1", "윤인성1");
		book[2] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[3] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[4] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		
		System.arraycopy(book, 0, copyBook, 0, 5);
		for(Book booki: book) {
			booki.showInfo();
		}
		
	
	}

}
