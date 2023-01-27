package Übung_Interface.Fahrzeuge;
//--------------------- Aufgabe 8 ---------------------
public class PKW extends Car implements PassengerTransportable
{

    @Override
    public int getNumberOfSeats() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public int getNumberOfOccupants() {
        // TODO Auto-generated method stub
        return 3;
    }
	
}