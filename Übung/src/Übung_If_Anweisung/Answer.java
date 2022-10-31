package Übung_If_Anweisung;


public class Answer {
	/*
	 * Die main Methode verschiedene Aufrufe testen
	 */
	public static void main(String[] args) {
		System.out.println(Answer.theAnswer(42));//sollte true zurueckgeben
		System.out.println(Answer.theAnswer(27));//sollte false zurueckgeben
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der �bergeben Parameter 42 ist.
	 * Wenn dies der Fall ist, dann soll true zur�ckgegeben werden, ansonsten false.
	 */
	public static boolean theAnswer(int zahl)
	{
		//Hier beginnt der zu bearbeitende Bereich
		return zahl==42;
		//Hier endet der zu bearbeitende Bereich
	}
}
