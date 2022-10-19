package Übung_If_und_Schleifen;

public class Primzahlen {

	/*
	 * Diese Methode soll zurueckgeben, ob die uebergebene Zahl eine Primzahl ist.
	 * Eine Zahl ist genau dann eine Primzahl, wenn sie durch genau 2 Zahlen teilbar ist,
	 * naemlich 1 und diese Zahl. Anders formuliert koennte man auch sagen:
	 * Eine Zahl ist genau dann eine Primzahl, wenn keine Zahl i existiert,
	 * fuer die gilt: i>=2 und i < zahl und zahl%i == 0
	 * Sollte die uebergebene Zahl eine Primzahl sein, soll true zureuckgegeben werden, sonst false.
	 */
	public static boolean isPrime(int zahl)
	{
		for(int i=2; i<100;i++){
			if(i>=2&&i < zahl&&zahl%i == 0){
				return false;
			}
		}
		return true ;
	}
	
	//In der Main Methode kannst du verschieden Faelle testen.
	public static void main(String[] args) {
		System.out.println(isPrime(42));//sollte false ergeben
		System.out.println(isPrime(41));//sollte true ergeben
		System.out.println(isPrime(7));//sollte true ergeben
		System.out.println(isPrime(11));//sollte true ergeben
		System.out.println(isPrime(100));//sollte false ergeben
		System.out.println(isPrime(141));//sollte false ergeben
	}
}