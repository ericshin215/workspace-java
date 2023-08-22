package kr.co.himedia.nongeneric;

public class GenericThreeDPrinterTest {
	
	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		
		plasticPrinter.setMaterial(new Plastic());
	}

}
