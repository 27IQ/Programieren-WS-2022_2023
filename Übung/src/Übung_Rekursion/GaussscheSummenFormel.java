public class GaussscheSummenFormel
{
	/*
	 * Die main Methode.
	 * Hier sind schon ein paar Testfaelle vorgegeben.
	 * Trotzdem darfst du auch noch eigene Testfaelle dazu schreiben.
	 */
	public static void main(String[] args)
	{
		System.out.println("Die Summe von 1+2 ist: ");
		System.out.println(calculateSum(2));
		System.out.println("Die Summe von 1+2+3 ist: ");
		System.out.println(calculateSum(3));
		System.out.println("Die Summe von 1+2+3+4 ist: ");
		System.out.println(calculateSum(4));
		System.out.println("Die Summe von 1+2+3+4+5 ist: ");
		System.out.println(calculateSum(5));
	}
	
	// Aufgabe 1
	public static int calculateSum(int n)
	{
		if(n<1)
		return 0;

		return calculateSum(n-1)+n;
	}
}