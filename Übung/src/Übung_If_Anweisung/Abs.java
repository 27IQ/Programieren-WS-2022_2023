package Übung_If_Anweisung;

// Betragsfunktion
// 
// Implementieren Sie die Betragsfunktion in der Methode "abs". Die Lösung der Betragsfunktion f(x) = |x| ist x, wenn x positiv ist, und -x, wenn x negativ ist. 
public class Abs {

	public static int abs(int value) {
		if(value<0){
			value*=-1;
		}
		return value;
	}

	public static void main(String[] args) {
		// Testaufruf
		System.out.println("Der Betrag von -24 = " + abs(-24) + " (24 ist korrekt)");
		System.out.println("Der Betrag von   0 = " + abs(0) + " (0 ist korrekt)");
		System.out.println("Der Betrag von   4 = " + abs(4) + " (4 ist korrekt)");
	}

}
