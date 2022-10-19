package Übung_Strings_und_Schleifen;

public class CaesarChiffrierung {
	/*
	* Hinweis: Diese Aufgabe ist ein guter Moment, um sich tiefer mit dem Datentyp char auseinanderzusetzen.
	* Wie wird das Zeichen im Datentyp char gespeichert?
	* Was geschieht, wenn ich eine Addition oder Subtraktion auf char ausfuehre?
	*
	* Natuerlich laesst sich die Aufgabe auch ohne dieses Wissen loesen,
	* vielleicht nur nicht so elegant.
	*/
	public static String encrypt(String text, int number) {
		return null;
	}

	public static String decrypt(String text, int number) {
		return null;
	}
	
	 //Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	public static void main(String[] args) {
		System.out.println("Wenn man den String \"abcd\" mit der number 1 encryptt, sollte das Ergebnis \"bcde\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("abcd", 1));
		System.out.println("Wenn man den String \"wxyz\" mit der number 2 encryptt, sollte das Ergebnis \"yzab\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("wxyz", 2));
		System.out.println("Wenn man den String \"Hallo Welt!\" mit der number 3 encryptt, sollte das Ergebnis \"Kdoor Zhow!\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("Hallo Welt!", 3));
		System.out.println("Wenn man den String \"bcde\" mit der number 1 decryptt, sollte das Ergebnis \"abcd\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("bcde", 1));
		System.out.println("Wenn man den String \"yzab\" mit der number 2 decryptt, sollte das Ergebnis \"wxyz\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("yzab", 2));
		System.out.println("Wenn man den String \"Kdoor Zhow!\" mit der number 3 decryptt, sollte das Ergebnis \"Hallo Welt!\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("Kdoor Zhow!", 3));		
	}
}