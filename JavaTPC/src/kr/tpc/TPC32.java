package kr.tpc;

public class TPC32 {
	
	
	public static void main(String[] args) {
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");
	}

}
