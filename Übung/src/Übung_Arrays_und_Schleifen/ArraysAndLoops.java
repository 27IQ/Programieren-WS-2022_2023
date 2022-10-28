package Übung_Arrays_und_Schleifen;



/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorangestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */
public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// Arrays addieren und die Gesamtsumme zurueckgeben.
	public static int sum(final int[] elements){
		int sum=0;
		for (int i : elements) {
			sum=sum+i;
		}
		return sum;
	}
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		int gröeßtes=elements[0], index=0;
		for (int i = 0; i < elements.length; i++) {
			if(gröeßtes<elements[i]){
				gröeßtes=elements[i];
				index=i;
			}
		}
		return gröeßtes*index;
	}

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Übergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	// 1,1|2,2|3,3
	public static int[] duplicateElements(final int[] elements){
		int[] duplicate= new int[elements.length*2];
		int a=0;
		for (int i = 0; i < duplicate.length; i=i+2) {
			duplicate[i]=elements[a];
			duplicate[i+1]=elements[a];
			++a;
		}
		return duplicate;
	}
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		int[] squares= new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			squares[i]=elements[i]*elements[i];
		}
		return squares;
	}
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void reverseArray(int[] elements){
		int[] reversed=new int[elements.length];

		for (int i = 0; i < reversed.length; i++) {
			reversed[i]=elements[i];
		}

		for (int i = 0; i < reversed.length; i++) {
			elements[i]=reversed[reversed.length-i-1];
		}
	}

	// Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {
		//int[] a={-10,-5,-6,-8};
		//System.out.println(maxElement(a)+"erg");
	}
}