package Übung_Vererbung.Basic;

public class BottleTester {
	
	public static void main (String [] args) {
		
		//A1
		//Bottle plasticBottle = new PlasticBottle(1, "Fanta"); // Diese Initialisierung funktioniert nur wenn die Klasse
		                                                         //  PlastikFlasche von der Klasse Flasche erbt.
		
		//A2
		PlasticBottle bottle1 = new PlasticBottle(1.5, "WaterMark");
		double yourDeposite = bottle1.deposit();
		System.out.println("Von der Flasche 'WaterMark' mit 1.5 Litern ist dein Ergebnis fuer den Pfand : "+ yourDeposite);
		System.out.println("Das Ergebnis sollte lauten:                                                   " + 0.25);
		PlasticBottle bottle2 = new PlasticBottle(2, "Geotaler");
		yourDeposite = bottle2.deposit();
		System.out.println("Von der Flasche 'Geotaler' mit 2.0 Litern ist dein Ergebnis fuer den Pfand : "+ yourDeposite);
		System.out.println("Das Ergebnis sollte lauten:                                                  "+ 2.5);
	}

}
