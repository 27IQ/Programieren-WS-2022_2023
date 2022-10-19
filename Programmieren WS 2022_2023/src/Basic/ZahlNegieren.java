package Basic;
public class ZahlNegieren {
	
	/*
	 * Die Methode negiere soll die uebergebene Zahl negieren.
	 * Das bedeutet, das Vorzeichen der Zahl soll geaendert werden.
	 * Der Rueckgabewert soll die gleiche Zahl sein, nur mit dem anderen Vorzeichen,
	 * aus + wird - und aus - wird +.
	 */
	public static int negiere(int zahl)
	{
		return zahl*-1; 
	}
	
	//Hier kannst du deine Methode testen. Du kannst dir auch eigene Testfaelle ausdenken
	public static void main(String[] args) {
		System.out.println(negiere(42));
		System.out.println(negiere(-27));
		System.out.println(negiere(28));
		System.out.println(negiere(-32));
		System.out.println(negiere(54));
		System.out.println(negiere(0));
	}
}
