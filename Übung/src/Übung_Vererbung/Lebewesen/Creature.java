package Übung_Vererbung.Lebewesen;

public abstract class Creature {

	private int age = 1;

	public abstract Creature reproduce();

	public abstract double bedTime();

	public void aging() {
		age++;
	}

	public int getAge() {
		return age;
	}

}
