package Übung_Strings_und_Schleifen;

public class CheckPalindrom {
	//Aufgabe 1

	public String constructString(char[] letters){
		String text="";
		for (int i = 0; i < letters.length; i++) {
			text=text+letters[i];
		}
		return text;
	}

	public String reverse(String toReverse) {
		char[] letters=toReverse.toCharArray();
		char[] reversed=new char[toReverse.length()];

		for(int i=0;i<toReverse.length();i++){
			reversed[i]=letters[letters.length-1-i];
		}
		return constructString(reversed);
	}
	
	//Aufgabe 2
	public boolean palindrome(String palindrome) {
		return palindrome.equalsIgnoreCase(reverse(palindrome));
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
