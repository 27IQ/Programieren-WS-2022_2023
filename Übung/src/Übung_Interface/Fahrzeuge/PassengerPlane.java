package Übung_Interface.Fahrzeuge;
//--------------------- Aufgabe 7 ---------------------
public class PassengerPlane extends Airplane implements PassengerTransportable
{

    @Override
    public int getNumberOfSeats() {
        // TODO Auto-generated method stub
        return 40;
    }

    @Override
    public int getNumberOfOccupants() {
        // TODO Auto-generated method stub
        return 20;
    }
	
}