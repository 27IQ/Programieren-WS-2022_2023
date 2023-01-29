package aufgabe2;


public class Student {
	private final String name;
	private int regelstudienzeit = 6;
	private Studiengang studiengang;
	private boolean praktikum = false;

	public Student(String name, Studiengang studiengang) {
		this.name = name;
		this.studiengang = studiengang;
	}

	// GETTER & SETTER
	public int getRegelstudienzeit() {
		return regelstudienzeit;
	}

	public void setRegelstudienzeit(int regelstudienzeit) {
		this.regelstudienzeit = regelstudienzeit;
	}

	public Studiengang getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(Studiengang studiengang) {
		this.studiengang = studiengang;
	}

	public String getName() {
		return name;
	}

	public void setPraktikum(boolean praktikum) {
		this.praktikum = praktikum;
	}

	public boolean isPraktikum() {
		return praktikum;
	}

}
