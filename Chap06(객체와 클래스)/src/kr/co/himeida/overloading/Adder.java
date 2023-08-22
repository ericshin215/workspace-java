package kr.co.himeida.overloading;

public class Adder {
	
	public int add(int x, int y){
		System.out.println("add(int x, int y");
		return x+y;
	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y");
		return x+y;
	}

}
