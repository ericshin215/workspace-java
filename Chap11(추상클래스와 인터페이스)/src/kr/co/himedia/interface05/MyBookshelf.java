package kr.co.himedia.interface05;

public class MyBookshelf  extends Bookshelf implements Queue {

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		bookshelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return bookshelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
