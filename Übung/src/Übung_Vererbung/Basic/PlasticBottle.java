package Übung_Vererbung.Basic;
               //Aufgabe 1
public class PlasticBottle extends Bottle{

	// Aufgabe 1
	public PlasticBottle(double liter, String brand) {
		super(liter, brand);
	}

	// Aufgabe 2
	public double deposit() {
		if(getBrand().equals("Geotaler"))
		return 0.5+getLiter();

		return 0.25;
	}

}
