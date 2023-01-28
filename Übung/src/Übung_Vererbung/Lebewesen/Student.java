package Übung_Vererbung.Lebewesen;
//	-------------------- Aufgabe 3 --------------------
// Aufgabe 3 a)
public class Student extends Human {
	
	private int matrikelNr;
	
	// Aufgabe 3 a)
	public Student(boolean earlyRiser, String nation, int mat) {
		super(earlyRiser, nation);
		this.matrikelNr=mat;
	}
	
	// Aufgabe 3 b)
	@Override
	public double bedTime(){
		double bedtime =super.bedTime()+2;

		if(bedtime>24)
		return 24;

		return bedtime;
	}
	

    // Aufgabe 3 c) 
	public boolean under18 () {
		return getAge()<18;
	}
	
	// Ende des zu bearbeitenden Bereichs
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
}
