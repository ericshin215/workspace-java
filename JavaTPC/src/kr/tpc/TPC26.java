package kr.tpc;

public class TPC26 {
	
	public static void main(String[] args) {
		Remocon r =  new TV();
		
		r.chUp();
		r.chDown();
		r.internet();
		
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}

}
