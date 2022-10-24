package Übung_Arrays_und_Schleifen;



import java.util.Arrays;

public class ArrayVeraendern {

	// Die Methode change soll das übergebene int[] array verändern.
	// Dabei soll die übergebene Zahl (number) an die übergebene Stelle (position) 
	// ins Array geschrieben werden.
	public static void change(int[] array, int position, int number) {
		//Hier beginnt der zu bearbeitende Teil
		array[position]=number;
		//Hier endet der zu bearbeitende Teil
	}
	
	 // Die main Methode. Hier koennen Sie verschiedene Testfaelle ausprobieren:
	public static void main(String[] args) {
		int[] test = new int[]{1,2,3,4,5};//Das Array, welches getestet wird
		change(test, 2, 42);//Methode wird aufgerufen
		System.out.println(Arrays.toString(test));//Sollte nun [1, 2, 42, 4, 5] ausgeben
	}
}