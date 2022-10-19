package Übung_Strings_und_Schleifen;

public class CheckPalindrom {
	//Aufgabe 1
	public String reverse(String toReverse) {
		return null;
	}
	
	//Aufgabe 2
	public boolean palindrome(String palindrome) {
		return false;
	}
	
	// Die Main Methode zum Testen deiner Methoden
	public static void main(String[] args) {
		CheckPalindrom check = new CheckPalindrom();
		System.out.println("Die Ausgabe sollte cba lauten: "+check.reverse("abc"));
		System.out.println("Die Ausgabe sollte ffeed lauten: "+check.reverse("deeff"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Lagerregal"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Rentner"));
		System.out.println("Die Ausgabe sollte false lauten: "+check.palindrome("Hallo Welt!"));
	}
}
