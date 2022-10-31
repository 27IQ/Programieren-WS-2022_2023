package Übung_If_Anweisung;

public class Modulo {
	
	/*
	 * Diese Methode soll true zurueckgeben, wenn eine Zahl zahl1 ganzzahlig durch zahl2 teilbar ist, 
	 * ansonsten gibt sie false zurück.
	 */
	public static boolean teilbar(int zahl1, int zahl2)
	{
		return zahl1%zahl2==0;
	}
	
	//In dieser Methode kannst du deine Methode testen
	public static void main(String[] args) {
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 3 sollte false liefern. Deine Methode liefert: " + teilbar(20, 3));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 2 sollte true liefern. Deine Methode liefert: " + teilbar(20, 2));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 5 sollte true liefern. Deine Methode liefert: " + teilbar(20, 5));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 42 und 7 sollte true liefern. Deine Methode liefert: " + teilbar(42, 7));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 42 und 4 sollte false liefern. Deine Methode liefert: " + teilbar(42, 4));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 11 und 3 sollte false liefern. Deine Methode liefert: " + teilbar(11, 3));
	}
}
