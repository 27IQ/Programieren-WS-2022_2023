package Übung_Interface.Tastatur;


            //Aufgabe 2
public class Keyboard implements Input,Memory{

	public int batteryCharge;
	private Character[] storage;

	public Keyboard() {
		storage = new Character[10];
		batteryCharge = 100;
	}
	// Zu bearbeitender Bereich: (Aufgaben 3-7)

	@Override
	public boolean needsToCharge() {
		if(batteryCharge<=10)
		return true;

		return false;
	}

	@Override
	public void charge() {
		batteryCharge+=20;

		if(batteryCharge>100)
		batteryCharge=100;
	}

	@Override
	public Character getFirstChar() {
		if(needsToCharge()||storage[0]==null)
		return null;

		char first=storage[0];

		for(int i=0;i<9;i++){
			storage[i]=storage[i+1];
		}

		storage[9]=null;

		batteryCharge=batteryCharge-4;

		return first;
	}

	@Override
	public void emptyMemory() {
		if(needsToCharge())
		return;

		storage=new Character[10];

		batteryCharge-=2;
	}

	@Override
	public void getInput(char input) {
		if(needsToCharge())
		return;

		for(int i=8;i>=0;i--){
			storage[i+1]=storage[i];
		}

		storage[0]=input;
		batteryCharge-=5;
	}
	  
	
	//Ende des zu bearbeitenden Bereiches
}