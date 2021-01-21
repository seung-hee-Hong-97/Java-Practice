package generic;

public class GenericPrinter<T extends Material> {

	private T material;
	
	public String toString() {
		return material.toString();
	}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	
}
