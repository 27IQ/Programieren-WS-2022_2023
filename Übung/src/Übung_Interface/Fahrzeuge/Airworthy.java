package Übung_Interface.Fahrzeuge;
/*
 * Dieses Interface zeigt, dass Objekte von Klassen, die davon erben, fliegen koennen.
 */
public interface Airworthy
{
	//Flugfaehige Objekte jeglicher Art muessen die Methode flieg() ueberschreiben.
	public void fly();
}