package aufgabe2;


public class Main {
	public static void main(String[] args) {
			
		//Array mit Studierenden-Objekten
		Student[] studenten = fillArray();
		
		int anzahl_Informatiker = 0;
		int anzahl_Mint = 0;
		
		//Schleife und switch-Ausdruck
		
		for (int i = 0; i < studenten.length; i++) {
			switch (studenten[i].getStudiengang()) {
				case MATHEMATIK:
					anzahl_Mint++;
					break;
			
				case INFORMATIK:
					anzahl_Mint++;
					anzahl_Informatiker++;
					studenten[i].setRegelstudienzeit(8);
					break;
				
				case BIOLOGIE:
					anzahl_Mint++;
					break;

				case E_TECHNIK:
					anzahl_Mint++;
					break;

				case MEDIZIN:
					studenten[i].setRegelstudienzeit(10);
					studenten[i].setPraktikum(true);
					break;
				default:
					studenten[i].setPraktikum(true);
				break;
			}
			System.out.println("Der Student "+studenten[i].getName()+ " belegt den Studiengang "+studenten[i].getStudiengang());
		}
		

		System.out.println("\nDie Anzahl an Informatikern ist: "+anzahl_Informatiker);
		System.out.println("Die Anzahl an MINT-Studierenden ist: "+anzahl_Mint);
		System.out.println("Julia mit dem Studiengang Medizin hat " +studenten[4].getRegelstudienzeit() +" Semester Regelstudienzeit.");
	}

	private static Student[] fillArray() {
		Student a = new Student("Tom", Studiengang.INFORMATIK);
		Student b = new Student("Samy", Studiengang.BWL);
		Student c = new Student("Alina", Studiengang.LINGUISTIK);
		Student d = new Student("Rob", Studiengang.BIOLOGIE);
		Student e = new Student("Julia", Studiengang.MEDIZIN);
		Student f = new Student("Mark", Studiengang.MATHEMATIK);
		Student g = new Student("Jessica", Studiengang.INFORMATIK);
		Student h = new Student("Matt", Studiengang.BWL);
		Student i = new Student("Malcom", Studiengang.LINGUISTIK);
		Student j = new Student("Jasha", Studiengang.E_TECHNIK);
		Student k = new Student("Laura", Studiengang.INFORMATIK);
		Student l = new Student("Ben", Studiengang.BIOLOGIE);
		Student[] studenten = { a, b, c, d, e, f, g, h, i, j, k, l };
		return studenten;
	}
	
	
}
