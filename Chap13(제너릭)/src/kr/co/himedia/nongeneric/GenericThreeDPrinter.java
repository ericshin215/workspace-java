package kr.co.himedia.nongeneric;

public class GenericThreeDPrinter<T> {
	

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}

}
