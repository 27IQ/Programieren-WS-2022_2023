/*
 * Diese Klasse dient nur als Referenz und darf nicht veraendert werden
 */
public class ExampleClass {
	private int number;		//Eine Zahl.
	private String string;	//Eine Zeichenkette.
	
	//Parameterloser Konstruktor, setzt number auf 0
	public ExampleClass() { 
		number = 0;
	}
	
	//Konstruktor mit einem Parameter, setzt number auf den uebergebenen Wert
	public ExampleClass(int number) {
		this.number = number;
	}

	//---Getter und Setter Methoden---
	
	//Der Wert von number wird zurueckgegeben
	public int getNumber() {
		return number;
	}

	//Der Wert von number wird neu gesetzt
	public void setNumber(int number) {
		this.number = number;
	}

	//Der Wert von string wird zurueckgegeben
	public String getString() {
		return string;
	}

	//Der Wert von String wird neu gesetzt
	public void setString(String string) {
		this.string = string;
	}
	
	//Gibt einen String zurueck, der die beiden Werte von zahl und string enthaelt.
	public String toString() {
		String rueckgabe = "Objekt von ExampleClass mit den folgenden Werten: ";
		rueckgabe = rueckgabe + "number = ";
		rueckgabe = rueckgabe + number;
		rueckgabe = rueckgabe + ", String = ";
		rueckgabe = rueckgabe + "\"";
		rueckgabe = rueckgabe + string;
		rueckgabe = rueckgabe + "\"";
		rueckgabe = rueckgabe + ".";
		return rueckgabe;
	}
}