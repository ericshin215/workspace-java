package kr.co.himedia.array2;

public class DeepCopy {
	
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬1", "윤인성1");
		book[2] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[3] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[4] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for (int i = 0; i<book.length; i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		System.arraycopy(book, 0, copyBook, 0, 5);
		for(Book booki: book) {
			booki.showInfo();
		}
		
		System.arraycopy(book, 0, copyBook, 0, 5);
		for(Book booki: copyBook) {
			booki.showInfo();
		}
		
	
	}

}
