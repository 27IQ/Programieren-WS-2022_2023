package Übung_Interface.Fahrzeuge;
//--------------------- Aufgabe 6 ---------------------
public class LKW extends Car implements Loadable
{

    @Override
    public String getLoadTyp() {
        // TODO Auto-generated method stub
        return "Flachlader";
    }

    @Override
    public int getCapacity() {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public int getLoad() {
        // TODO Auto-generated method stub
        return 10;
    }
	
}