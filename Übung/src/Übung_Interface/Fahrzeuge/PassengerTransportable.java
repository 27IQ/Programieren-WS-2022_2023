package Übung_Interface.Fahrzeuge;
/*
 * Dieses Interface zeigt an, dass Objekte Personen befoerden koennen.
 */
public interface PassengerTransportable
{
	//Gibt an, wie viele Sitzplaetze in dem Objekt vorhanden sind.
	public int getNumberOfSeats();
	//Gibt an, wie vieleSitzplaetze in dem Objekt belegt sind.
	public int getNumberOfOccupants();
}