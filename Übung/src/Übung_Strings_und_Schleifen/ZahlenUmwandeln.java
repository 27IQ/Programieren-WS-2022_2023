package Übung_Strings_und_Schleifen;

public class ZahlenUmwandeln
{
	// Aufgabe 1
	public static int binaryToDecimal(String number)
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
	public static String decimalToBinary(int number)
	{
		String binary="";
		while(number>=1){
			binary=binary+Integer.toString(number%2);
			number=number/2;
		}
		
		return "";
	}

	public static void main(String[] args) {
		System.out.println("Die Lösung von Aufgabe 1 ist: " + binaryToDecimal("101010"));
		System.out.println("Die Lösung von Aufgabe 2 ist: " + decimalToBinary(42));
	}
}
