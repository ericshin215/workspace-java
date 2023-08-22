package kr.co.himedia.constant;

public class TypeChangeTest {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		
		int iNum2 = 10;
		byte bNum1 = (byte)iNum2;
		
		byte num1 = 1;
		byte num2 = 2;
//		byte num3 = num1 + num2 ; // int 보다 작은 정수형은 int 타입으로 연산시 형변환 발생함
		
		byte num3 = (byte)(num1 + num2);
		
		short num = 5;
		
		int result = 0;
		
		try {
			result = 10/0;
		} catch (ArithmeticException e) {
			System.out.println("예외 발생함");
		}
		
	}

}
