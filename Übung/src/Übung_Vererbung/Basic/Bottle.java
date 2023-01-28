package Übung_Vererbung.Basic;
public class Bottle {
	private double liter;
	private String brand;
	
	public Bottle (double liter, String brand) {
		this.liter = liter;
		this.brand = brand;
	}

	public double getLiter() {
		return liter;
	}

	public String getBrand() {
		return brand;
	}
}