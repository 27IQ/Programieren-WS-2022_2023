package Übung_Interface.Elektronikgeräte;
/*
 * Die Klasse Computer stellt eine allgemeine Oberklasse
 * fuer die beiden Klassen Laptop und PC dar.
 * Ein Computer kann multiplizieren, dividieren, addieren, und subtrahieren.
 * Ausserdem kann ein Computer noch kaputt gehen.
 */
public abstract class Computer
{
	public Computer()
	{
		broken = false;
	}
	
	private boolean broken;
	
	//Diese Methoden sollen in den Unterklassen ueberschrieben werden.
	//Wie genau, wird dort erklaert.
	public abstract int multiply(int number1, int number2);
	public abstract int divide(int number1, int number2);
	public abstract int add(int number1, int number2);
	public abstract int subtract(int number1, int number2);
	
	public void destroy()
	{
		broken = true;
	}
	
	public boolean isBroken()
	{
		return broken;
	}
}