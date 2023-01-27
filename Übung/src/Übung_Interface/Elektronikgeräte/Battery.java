package Übung_Interface.Elektronikgeräte;
/*
 * Batteriegeraete haben die beiden Methoden
 * restBattery und charge.
 * Diese beiden Methoden sollen in den entsprechenden Klassen
 * richtig ueberschrieben werden.
 */
public interface Battery
{
	public int restBattery();//Gibt die verbleibende staerke der Batterie zurueck.
	public void charge();//Laedt das Geraet auf.
}