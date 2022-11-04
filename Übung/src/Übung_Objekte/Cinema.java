/*
 * Diese Klasse stellt ein Kino dar.
 * Ein Kino besteht aus einem rechteckigen Saal, der durch das boolean Array symbolisiert wird.
 * Dabei bedeutet der Wert false, dass der Platz an dieser Stelle frei, also nicht reserviert ist. 
 * True bedeutet, dass der Platz schon reserviert ist.
 */
public class Cinema {
	//Das Array, welches die Plaetze darstellt.
	//true bedeutet, Platz ist reserviert, false bedeutet, Platz ist frei.
	private boolean[][] seats;
	
	// Der Konstruktor initialisiert ein neues Kino mit der uebergebenen Groesse.
	public Cinema(int rows, int seatsInTheRows) {
		seats = new boolean[rows][seatsInTheRows];
	}
	
	// Gibt zurueck, ob der uebergebene Platz frei ist.
	// ACHTUNG: Dieser Platz muss existieren, damit hier keine Exception auftritt.
	public boolean available(int row, int seat) {
		if(seats[row][seat] == false) {
			return true;
		}
		//plaetze[row][seat] == true
		else {
			return false;
		}
	}
	
	/*
	 * Diese Methode reserviert den Platz, der uebergeben wird.
	 * Falls der Platz erfolgreich reserviert werden konnte,
	 * wird true zurueckgegeben, sollte der Platz schon
	 * reserviert sein, wird false zurueckgegeben.
	 * Auch hier gilt: Der uebergebene Platz muss existieren.
	 */
	public boolean reserve(int row, int seat) {
		//Platz ist frei
		if(available(row, seat)) {
			seats[row][seat] = true;
			return true;
		}
		//Platz ist nicht frei
		else {
			return false;
		}
	}
	
	// Gibt zurueck, wie viele Reihen von Sitzplaetzen das Kino besitzt.
	public int rows() {
		return seats.length;
	}
	
	// Gibt zurueck, wie viele Sitzplaetze in jeder Reihe des Kinos vorhanden sind.
	public int seatsInTheRows() {
		return seats[0].length;
	}
	
	// Diese Methode gibt das Kino auf der Konsole aus.
	public void print() {
		for(int i = 0; i < seats.length; i++) {
			System.out.print("[");
			for(int j = 0; j < seats[i].length-1; j++) {
				if(seats[i][j] == true) {
					System.out.print("reserviert");
				}
				if(seats[i][j] == false) {
					System.out.print("   frei   ");
				}
				System.out.print("|");
			}
			if(seats[i][seats[i].length-1] == true) {
				System.out.print("reserviert");
			}
			if(seats[i][seats[i].length-1] == false) {
				System.out.print("   frei   ");
			}
			System.out.println("]");
		}
	}
}