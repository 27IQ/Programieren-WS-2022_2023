package Übung_Interface.Fahrzeuge;
/*
 * Dieses Interface zeigt, dass Objekte Ladung transportieren koennen.
 * Klassen, die dieses Interface implementieren, muessen
 * also die unten stehenden Methoden ueberschreiben.
 * Wie genau steht in der jeweiligen Klasse.
 */
public interface Loadable
{
	//gibt an, von welchem Typ die Ladung ist.
	public String getLoadTyp();
	//gibt an, wie viel Ladung das Fahrzeug aufnehmen kann.
	public int getCapacity();
	//gibt an, wie viel Ladung tatsaechlich geladen ist.
	public int getLoad();
}