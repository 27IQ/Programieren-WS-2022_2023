package Übung_Interface.Fahrzeuge;
/*
 * Dieses Interface wird von Objekten implementiert,
 * die fahren koennen.
 */
public interface Driveable
{
	//Fahrfaehige Objekte koennen fahren und muessen deshalb diese Methode ueberschreiben.
	public void drive();
	//Fahrfaehige Objekte haben Raeder. Diese Methode gibt an, wie viele Raeder sie haben.
	public int getNumberOfWheels();
}