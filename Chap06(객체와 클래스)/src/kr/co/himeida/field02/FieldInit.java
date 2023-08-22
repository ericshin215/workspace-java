package kr.co.himeida.field02;

import java.util.Arrays;

public class FieldInit {
	
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String strField;
	@Override
	public String toString() {
		return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", strField=" + strField + "]";
	}
	
	
	
	

}
