
public class GeradeUngerade {
	/*
	 * Die main Methode. Hier kannst du deine Methoden testen. Es sind schon ein
	 * paar Testfaelle vorgegeben, du kannst aber auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		System.out.println("1 ist eine ungerade Zahl: " + isOddNumber(1));
		System.out.println("4 ist eine ungerade Zahl: " + isOddNumber(4));
		System.out.println("5 ist eine ungerade Zahl: " + isOddNumber(5));
		System.out.println("42 ist eine ungerade Zahl: " + isOddNumber(42));
		System.out.println("1 ist eine gerade Zahl: " + isEvenNumber(1));
		System.out.println("10 ist eine gerade Zahl: " + isEvenNumber(10));
		System.out.println("11 ist eine gerade Zahl: " + isEvenNumber(11));
		System.out.println("42 ist eine gerade Zahl: " + isEvenNumber(42));
	}

	// Aufgabe 1
	public static boolean isEvenNumber(int number) {
		if(number==0)
		return true;

		return isOddNumber(number-1);
	}

	// Aufgabe 2
	public static boolean isOddNumber(int number) {
		if(number==0)
		return false;

		return isEvenNumber(number-1);
	}
}