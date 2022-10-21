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
	public static char[] getArray(String text){
		char[] letters=new char[text.length()];
		for (int i=0;i<text.length();i++){
			letters[i]=text.charAt(i);
		}
		return letters;
	}

	public static String constructString(char[] letters){
		String text="";
		for (int i = 0; i < letters.length; i++) {
			text=text+letters[i];
		}
		return text;
	}

	public static String encrypt(String text, int number) {
		char[] letters=getArray(text);
		if(number>0){
			for (int i=0;i<text.length();i++){
				for(int a=0;a<number;a++){
					if(letters[i]=='z'){
						letters[i]='a';
					}else if(letters[i]=='.'||letters[i]=='!'||letters[i]==' '||letters[i]=='?'||letters[i]=='-'||letters[i]==','||letters[i]==':'||letters[i]=='"');
					else{
						letters[i]=++letters[i];
					}
				}
			}
		}else{
			for (int i=0;i<text.length()-1;i++){
				for(int a=number;a<0;a++){
					if(letters[i]=='a'){
						letters[i]='z';
					}else if(letters[i]=='.'||letters[i]=='!'||letters[i]==' '||letters[i]=='?'||letters[i]=='-'||letters[i]==','||letters[i]==':'||letters[i]=='"');
					else{
						letters[i]=++letters[i];
					}
				}
			}
		}
		return constructString(letters);
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