package kr.co.himeida.constructor04;

public class Car {
	
	
		String gearType;
		String color;
		int door;
		
		public Car() {
			this("검정", "수동", 2);
		}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [gearType=" + gearType + ", color=" + color + ", door=" + door + "]";
	}

	
	
	
	}

	
	
	

