package Objekte_erzeugen_und_aufrufen;
public class Aufgabe {
	// Aufgabe 1
	public Object getAnyObject() {
		return new ExampleClass();
	}
	
	// Aufgabe 2
	public ExampleClass getExampleClass() {
		return new ExampleClass();
	}
	
	// Aufgabe 3 
	public ExampleClass getExampleClass(int number) {
		ExampleClass tmp=new ExampleClass();
		tmp.setNumber(number);
		return tmp;
	}
	
	// Aufgabe 4
	public ExampleClass getExampleClass(String string) {
		ExampleClass tmp=new ExampleClass();
		tmp.setString(string);
		return tmp;
	}
	
	/*
	 * Die main Methode.
	 * Hier koennen Sie ihre Methoden testen.
	 * Natuerlich koennen Sie auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		Aufgabe aufgabe = new Aufgabe();
		System.out.println("Ein Objekt: "+aufgabe.getAnyObject());//Hier sollte etwas ausgegeben werden. Egal was, aber nicht null.
		System.out.println("Ein Objekt vom Typ Klasse: "+aufgabe.getExampleClass());//Hier sollte ein Objekt vom Typ ExampleClass ausgegeben werden.
		System.out.println("Ein Objekt vom Typ Klasse mit dem Wert zahl = 42: "+aufgabe.getExampleClass(42));//Hier sollte auch ein Objekt vom Typ ExampleClass ausgegeben werden, diesmal aber mit number = 42
		System.out.println("Ein Objekt vom Typ Klasse mit dem Wert string = \"Hallo Welt!\": "+aufgabe.getExampleClass("Hallo Welt!"));//Hier soll ein Objekt vom Typ ExampleClass ausgegeben werden, wobei string = "Hallo Welt!" ist
	}
}