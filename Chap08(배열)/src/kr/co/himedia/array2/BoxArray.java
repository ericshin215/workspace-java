package kr.co.himedia.array2;

class BoxA4{
	private String name;
	
	public BoxA4(String name) {
		this.name = name;
	}
}

public class BoxArray {
	
	public static void main(String[] args) {
		
		
		BoxA4[] arr = new BoxA4[3];
		
		arr[0] = new BoxA4("전정국"); 
		arr[1] = new BoxA4("김남준"); 
		arr[2] = new BoxA4("정호석"); 
	}

}
