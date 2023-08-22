package kr.co.himedia.review;

public class TwoDimArrayInit {
	
	public static void main(String[] args) {
		
		int arr[][] =new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				arr[i][j] = 42;
				System.out.print((char)arr[i][j] +"\t");
				
			}
			System.out.println();
		}
	}

}
