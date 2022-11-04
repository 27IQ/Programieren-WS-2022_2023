public class Vector {
	private int x;	//X-Koordinate des Vektors
	private int y;	//Y-Koordinate des Vektors
	private int z;	//Z-Koordinate des Vektors
	
	/*
	 * Parameterloser Konstruktor.
	 * Setzt alle Variablen auf 0.
	 */
	public Vector(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	;
	// Aufgabe 1
	public Vector(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	// Aufgabe 2
	public void add(Vector v){
		x+=v.getX();
		y+=v.getY();
		z+=v.getZ();
	}
	
	// Aufgabe 3
	public int scalarProduct(Vector v) {
		return x*v.getX()+y*v.getY()+z*v.getZ() ;
	}
	
	// Aufgabe 4
	public Vector clone() {
		return new Vector(x, y, z);
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	//Getter und Setter Methoden fuer die vorhandenen Variablen
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	//Mit der toString Methode koennen Sie ihren Vektor ausgeben.
	//Sie koennen diese Methode in der main Methode nutzen.
	public String toString() {
		return "Vektor hat folgende Werte: x = " + x + ", y = " + y + ", z = " + z + ".";
	}
	
	/*
	 * Die main Methode.
	 * Hier koennen Sie ihre Methoden testen.
	 * Wenn Sie moechten, duerfen Sie auch eigene
	 * Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		Vector v = new Vector(10, 20, 30);
		System.out.println("Neuer Vektor wurde erstellt.");
		System.out.println(v.toString() + " (10, 20, 30) waere richtig.");
		v = new Vector();
		v.setX(10);
		v.setY(20);
		v.setZ(30);
		System.out.println("Variablen wurden ueber set Methoden gesetzt.");
		System.out.println(v);
		Vector v2 = new Vector();
		v2.setX(30);
		v2.setY(40);
		v2.setZ(50);
		v.add(v2);
		System.out.println("Vektor wird addiert.");
		System.out.println(v + " (40, 60, 80) waere richtig.");
		System.out.println("Das Skalarprodukt der beiden Vektoren wird berechnet.");
		System.out.println("Das Ergebnis: " + v.scalarProduct(v2) + " (7600 waere richtig)");
		System.out.println("Nun wird der Vektor geklont.");
		v2 = v.clone();
		System.out.println("Vektor v wird ausgegeben:");
		System.out.println(v);
		System.out.println("Vektor v2 wird ausgegeben:");
		System.out.println(v2);
		System.out.println("v und v2 sind gleich? " + (v == v2) + " (false waere richtig)");
	}
}