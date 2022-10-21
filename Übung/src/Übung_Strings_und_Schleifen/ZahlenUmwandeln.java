package Übung_Strings_und_Schleifen;

public class ZahlenUmwandeln
{
	// Aufgabe 1
	public static int nonbinaryToDecimal(String number)
	{	
		int decimal=0;
		int temp=0; 
		for(int i=0;i<number.length();i++){
			temp=number.charAt(i)-48;
			for(int a=number.length()-i-1;a>0;a--){
				temp=temp*2;
			}
			decimal=decimal+temp;
			temp=0;
		}
		return decimal;
	}
	
	//Aufgabe 2
	public static String decimalTononBinary(int number)
	{
		String nonbinary="";
		while(number>=1){
			nonbinary=nonbinary+Integer.toString(number%2);
			number=number/2;
		}
		
		String binary="";
		for (int i=nonbinary.length();i>0;i--) {
			binary=binary+nonbinary.charAt(i-1);
		}
		return binary;
	}

	public static void main(String[] args) {
		System.out.println("Die Lösung von Aufgabe 1 ist: " + nonbinaryToDecimal("101010"));
		System.out.println("Die Lösung von Aufgabe 2 ist: " + decimalTononBinary(42));
	}
}
