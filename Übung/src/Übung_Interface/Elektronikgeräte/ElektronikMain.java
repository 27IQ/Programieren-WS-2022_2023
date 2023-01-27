package Übung_Interface.Elektronikgeräte;
public class ElektronikMain
{
	/*
	 * Die main Methode.
	 * Damit kannst du hier deine Klassen testen.
	 * Sollten keine Syntaxfehler mehr auftreten,
	 * hast du zumindest einiges richtig gemacht.
	 */
	public static void main(String[] args)
	{
		//Calculator wird getestet
		System.out.println("Calculator wird getestet");
		Calculator t = new Calculator();
		System.out.println("5 + 3 = " + t.add(5, 3));
		System.out.println("5 - 3 = " + t.subtract(5, 3));
		Battery battery = new Calculator();//Wenn Calculator Battery implementiert, ist das hier korrekt
		System.out.println("Batterie von einem neuen Calculator: " + battery.restBattery());
		battery.charge();//Calculator wird geladen
		battery.charge();//Calculator wird geladen
		System.out.println("Batterie von einem geladenen Calculator: " + battery.restBattery());
		t = (Calculator) battery;
		System.out.println("5 + 10 = " + t.add(5, 10));
		System.out.println("Batterie nach der Berechnung: "+battery.restBattery());
		System.out.println("10 - 5 = " + t.subtract(10, 5));
		System.out.println("Batterie nach der Berechnung: "+battery.restBattery());
		Display display = t;//Wenn Taschenrechner Display implementiert, ist das hier korrekt
		System.out.println("Display zeigt an: " + display.showThat());
		System.out.println("Display zeigt auch an: " + display.showThis("Hallo Welt!"));
		System.out.println("--------------------");
		
		//PC wird getestet
		System.out.println("PC wird getestet");
		Computer comp = new PC();//PC ist hier ein Computer
		System.out.println( "5 + 3 = " + comp.add(5, 3));
		System.out.println( "5 - 3 = " + comp.subtract(5, 3));
		System.out.println( "5 * 3 = " + comp.multiply(5, 3));
		System.out.println("15 / 3 = " + comp.divide(15, 3));
		display = new PC();//PC ist jetzt ein Displaygeraet
		System.out.println("Der PC zeigt an: " + display.showThis("Dieser Satz ist falsch!"));
		System.out.println("Der PC zeigt ausserdem an: " + display.showThat());
		System.out.println("--------------------");
		
		//Laptop wird getestet
		System.out.println("Laptop wird getestet");
		Laptop laptop = new Laptop();
		battery = laptop;
		battery.charge();
		battery.charge();
		battery.charge();
		battery.charge();
		System.out.println("Batterie ist jetzt " + battery.restBattery());
		comp = laptop;
		System.out.println( "5 + 3 = " + comp.add(5, 3));
		System.out.println( "5 - 3 = " + comp.subtract(5, 3));
		System.out.println("Laptop hat noch " + battery.restBattery() + " Batterie uebrig.");
		System.out.println( "5 * 3 = " + comp.multiply(5, 3));
		System.out.println("15 / 3 = " + comp.divide(15, 3));
		System.out.println("Batterie ist nun leer? Batterie: " + battery.restBattery());
		System.out.println("5 + 3 = " + comp.add(5, 3));
		display = laptop;
		System.out.println("Laptop zeigt das hier an: " + display.showThat());
		System.out.println("Laptop kann aber auch das anzeigen: " + display.showThis("Hallo Welt!"));
		System.out.println("Ende.");
	}
}