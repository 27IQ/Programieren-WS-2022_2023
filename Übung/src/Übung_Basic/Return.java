package Übung_Basic;
public class Return
{
	/*
	 * Diese Methode soll so ergaenzt werden, dass sie immer 0 zurueckgibt.
	 */
	public static int getZero() {
		return 0;
	}
	
	/*
	 * Diese Methode soll immer 42 zurueckgeben.
	 */
	public static int get42() {
		return 42;
	}
	
	/*
	 * Diese Methode gibt einen boolean zurueck. Der zurueckgegebene boolean soll hier immer false sein.
	 */
	public static boolean isWrong() {
		return false;
	}
	
	/*
	 * Diese Methode soll die mathematische Zahl Pi zurueckgeben, mit einer Genauigkeit von mindestens
	 * 2 Nachkommastellen. Es reicht also fuer diese Aufgabe vollkommen aus, Pi = 3.14 zu verwenden.
	 * Wenn du die Zahl genauer bestimmen kannst, geht das natuerlich auch.
	 */
	public static double PI() {
		return 3.14;
	}
	
	/*
	 * Die main Methode. Hier kannst du deine Methoden testen.
	 */
	public static void main(String[] args) {
		System.out.println("Die Ausgabe sollte 0 sein: "+getZero());
		System.out.println("Die Ausgabe sollte 42 sein: "+get42());
		System.out.println("Die Ausgabe sollte false sein: "+isWrong());
		System.out.println("Die Ausgabe sollte 3.14 sein: "+PI());
	}
}