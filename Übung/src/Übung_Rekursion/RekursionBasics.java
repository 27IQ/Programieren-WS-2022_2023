
public class RekursionBasics {
	
	
//	-------------------- Aufgabe 1 --------------------
	
	public static int summenFormel(int n) {
		return rekursSummenFormel(n);
	}
	
	private static int rekursSummenFormel(int n) {

		if(n!=0){
			n+=rekursSummenFormel(n-1);
		}
		return n;
	}
	
	
//	-------------------- Aufgabe 2 --------------------
	
	public static int summenFormel2(int n) {
		return rekursSummenFormel2(n);
	}
	
	private static int rekursSummenFormel2(int n) {
		
		if(n!=0){
			n=(n*2)+rekursSummenFormel2(n-1);
		}
		return n;
	}
	
	
//	-------------------- Aufgabe 3 --------------------
	
	public static long fakultaet(int n) {
		return rekursFakultaet(n);
	}
	
	private static long rekursFakultaet(int n) {
		if(n==0)
		return 1;

		n*=rekursFakultaet(n-1);

		return n;
	}
	
	
//	-------------------- Aufgabe 4 --------------------
	
	public static int potenz(int basis, int exponent) {
		return rekursPotenz(basis, exponent);
	}
	
	private static int rekursPotenz(int b, int e) {
		if(e==0)
		return 1;

		return b*rekursPotenz(b, e-1);
		
	}
	
	
//	------------------ Main-Methode ------------------
	
	public static void main(String[] args) {
		System.out.println("---------- Aufgabe 1 ----------");
		System.out.println("Summenformel f�r n = 2");
		System.out.println("Erwartete Ausgabe: 3");
		System.out.println("Deine Ausgabe:     " + summenFormel(2));
		
		System.out.println("\nSummenformel f�r n = 6");
		System.out.println("Erwartete Ausgabe: 21");
		System.out.println("Deine Ausgabe:     " + summenFormel(6));
		
		System.out.println("\n---------- Aufgabe 2 ----------");
		System.out.println("Summenformel2 f�r n = 2");
		System.out.println("Erwartete Ausgabe: 6");
		System.out.println("Deine Ausgabe:     " + summenFormel2(2));
		
		System.out.println("\nSummenformel f�r n = 6");
		System.out.println("Erwartete Ausgabe: 42");
		System.out.println("Deine Ausgabe:     " + summenFormel2(6));
		
		System.out.println("\n---------- Aufgabe 3 ----------");
		System.out.println("Fakultaet f�r n = 2 und n = 6");
		System.out.println("2! = " + fakultaet(2) + " (erwartet: 2)");
		System.out.println("6! = " + fakultaet(6) + " (erwartet: 720)");
		
		System.out.println("\n---------- Aufgabe 4 ----------");
		System.out.println("2^6 = " + potenz(2,6) + " (erwartet: 64)");
		System.out.println("6^2 = " + potenz(6,2) + " (erwartet: 36)");

	}
}