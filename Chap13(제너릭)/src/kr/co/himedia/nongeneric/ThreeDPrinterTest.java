package kr.co.himedia.nongeneric;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder powder = new Powder();
		printer.setMaterial(powder);
		
		Powder powder2 = printer.getMaterial();
		System.out.println(powder2);
	}

}
