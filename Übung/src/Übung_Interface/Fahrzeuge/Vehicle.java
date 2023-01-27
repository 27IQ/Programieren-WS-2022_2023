package Übung_Interface.Fahrzeuge;
/*
 * Die allgemeine Oberklasse fuer ein Fahrzeug jeglicher Art.
 * Klassen, die Fahrzeuge darstellen, sollen Unterklassen von
 * dieser Klasse sein.
 */
public abstract class Vehicle
{
	/*
	 * Jedes Fahrzeug kann sich in irgendeiner Form bewegen.
	 * Deswegen gibt es hier die abstrakte Methode bewege().
	 * Diese muss von Unterklassen ueberschrieben werden.
	 */
	public abstract void move();
}