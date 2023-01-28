package Übung_Vererbung.Häuser;

public class TestClass {
	// Falls diese Klasse noch nicht kompilierfaehig ist sind die beiden Klassen
	// Hochhaus und Familienwohnung noch keine Unterklassen von Gebaeude.

	public static void main(String[] args) {

		// Test der KLasse Hochhaus
		Skyscraper building1 = new Skyscraper(10);
		int price = -1;
		price = building1.rentalCosts();
		System.out.println("Test Aufgabe 1");
		System.out.println("Das Hochhaus hat nach deiner Berechnung Mietkosten in Hoehe von " + price + " Euro.");
		System.out.println("Das erwartete Ergebnis ist:                                     " + 500 + " Euro.");
		System.out.println("-----------------------------------------------------------------------------------");
		building1 = new Skyscraper(6);
		price = building1.rentalCosts();
		System.out.println("Das Hochhaus hat nach deiner Berechnung Mietkosten in Hoehe von " + price + " Euro.");
		System.out.println("Das erwartete Ergebnis ist:                                     " + 1700 + " Euro.");
		System.out.println("-----------------------------------------------------------------------------------");
		building1.setPlotArea(20);
		System.out.println("Die plotArea betraegt nun :    " + building1.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 20");
		System.out.println("-----------------------------------------------------------------------------------");
		building1.setPlotArea(70);
		System.out.println("Die plotArea betraegt nun :    " + building1.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 70");
		System.out.println("-----------------------------------------------------------------------------------");
		building1.setPlotArea(100);
		System.out.println("Die plotArea betraegt nun :    " + building1.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 35");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// Test der Klasse Familienwohnung
		FamilyHome house = new FamilyHome(4);
		price = -1;
		price = house.rentalCosts();
		System.out.println("Test Aufgabe 2");
		System.out
				.println("Die Familienwohnung hat nach deiner Berechnung Mietkosten in Hoehe von " + price + " Euro.");
		System.out
				.println("Das erwartete Ergebnis ist:                                            " + 1350 + " Euro.");
		System.out.println("-----------------------------------------------------------------------------------");
		house = new FamilyHome(6);
		price = house.rentalCosts();
		System.out
				.println("Die Familienwohnung hat nach deiner Berechnung Mietkosten in Hoehe von " + price + " Euro.");
		System.out
				.println("Das erwartete Ergebnis ist:                                            " + 1150 + " Euro.");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		house.setPlotArea(50);
		System.out.println("Die plotArea betraegt nun :    " + house.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 50");
		System.out.println("-----------------------------------------------------------------------------------");
		house.setPlotArea(10);
		System.out.println("Die plotArea betraegt nun :    " + house.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 35");
		System.out.println("-----------------------------------------------------------------------------------");
		house.setPlotArea(30);
		System.out.println("Die plotArea betraegt nun :    " + house.getPlotArea());
		System.out.println("Die plotArea sollte betragen : 30");


	}
}
