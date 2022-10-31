package Übung_If_Anweisung;

public class CheckNumbers {
	

	/*
	*	Aufgabe 1:
	*	Die Methode checkEven soll ueberprüfen, ob die uebergebene Zahl number gerade ist.
	*	Wenn die Zahl gerade ist soll true zurückgegeben werden, ansonsten
	*	soll false zurückgegeben werden.
	*/
	public static boolean checkEven(int number)
	{
		return number%2==0;//Dieses Return Statement ist zu bearbeiten.
	}
	
	/*
	*	Aufgabe 2:
	*	Die Methode checkOdd soll ueberprüfen, ob die uebergebene Zahl number ungerade ist.
	*	Wenn die Zahl ungerade ist soll true zurückgegeben werden, ansonsten
	*	soll false zurückgegeben werden.
	*/
	public static boolean checkOdd(int number)
	{
		if(number<0){
			return (number*(-1))%2>0;
		}
		return number%2>0;//Dieses Return Statement ist zu bearbeiten.
	}
	
	//In der Main Methode werden verschiedene Testfaelle getestet. Sie koennen sich aber auch eigene ausdenken und testen
	public static void main(String[] args) {
		System.out.println(checkEven(42));//Sollte true zurueckgeben
		System.out.println(checkEven(27));//Sollte false zurueckgeben
		System.out.println(checkEven(28));//Sollte true zurueckgeben
		System.out.println(checkOdd(42));//Sollte false zurueckgeben
		System.out.println(checkOdd(27));//Sollte true zurueckgeben
		System.out.println(checkOdd(28));//Sollte false zurueckgeben
		System.out.println(checkOdd(-1));
	}
}
