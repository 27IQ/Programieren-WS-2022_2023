package Basic;

public class Taschenrechner {

	/*
	 * Diese Methode soll die als drittes Argument übergebene Rechenoperation auf die ersten beiden ganzzahligen
	 * Argumente 'a' und 'b' anwenden.
	 * 		rechne(11, 5, "-") --> 11-5 = 6
	 * 		rechne(4, 3, "*") --> 4*3 = 12
	 * 		usw.
	 * 'a' und 'b' können dabei beliebige int-Werte sein.
	 *
	 * Die Variable 'zeichen' ist eine der folgenden Rechenoperationen (als String): '+', '-', '*', '/' (in dieser
	 * Aufgabe dürfen Sie davon ausgehen, dass keine anderen Strings übergeben werden).
	 *
	 * Die Zeichen können mit der Methode
	 * 		boolean String.equals(String)
	 * verglichen werden.
	 *
	 * Beispiele:
	 * 		"abc".equals("abc") --> true (Dies ist ein Spezialfall, weil
	 * 		zeichen.equals("potenz") --> true, 	wenn 'zeichen' tatsaechlich nur die Zeichenkette "potenz" enthaelt
	 * 									 false, sonst.
	 */
	public static int rechne(int a, int b, String zeichen) {
		int i=0;
		if(zeichen.equals("+")) {
			i=a+b;
		}
		else if(zeichen.equals("-")) {
			i=a-b;
		}
		else if(zeichen.equals("*")){
			i=a*b;
		}
		else if(zeichen.equals("/")) {
			i=a/b;
		}
			
		return i;
	}

	/*
	 * Hier kann die Methode getestet werden. Ändern Sie den Code wie Sie es fuer Ihre Tests fuer notwendig halten
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		System.out.println("Das Ergebnis von " + a + " + " + b + " sollte " + (a + b) + " sein.\nDein Ergebnis ist "
				+ "            " + rechne(a, b, new String("+")));
		System.out.println("Das Ergebnis von " + a + " - " + b + " sollte " + (a - b) + " sein.\nDein Ergebnis ist "
				+ "            " + rechne(a, b, new String("-")));
		System.out.println("Das Ergebnis von " + a + " * " + b + " sollte " + (a * b) + " sein.\nDein Ergebnis ist "
				+ "            " + rechne(a, b, new String("*")));
		System.out.println("Das Ergebnis von " + a + " / " + b + " sollte " + (a / b) + " sein.\nDein Ergebnis ist "
				+ "            " + rechne(a, b, new String("/")));
	}
}
