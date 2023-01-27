package Übung_Interface.Elektronikgeräte;


//--------------------- Aufgabe 2 ---------------------
public class Calculator implements Battery,Display
{
	//Variable, die den Batteriestand symbolisiert.
	//Verwende sie im Zusammenhang mit den Methoden aus Battery.
	private int battery = 0;
	
	public int add(int number1, int number2)
	{
		if(battery==0)
		return 0;

		battery--;

		return number1+number2;
	}
	
	public int subtract(int number1, int number2)
	{
		if(battery<2)
		return 0;

		battery-=2;

		return number1-number2;
	}

	@Override
	public String showThis(String string) {
		return string;
	}

	@Override
	public String showThat() {
		return "Ich bin ein Taschenrechner";
	}

	@Override
	public int restBattery() {
		return battery;
	}

	@Override
	public void charge() {
		battery+=10;
	}
}