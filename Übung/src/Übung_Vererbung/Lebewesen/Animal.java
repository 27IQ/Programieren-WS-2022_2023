package Übung_Vererbung.Lebewesen;
//	-------------------- Aufgabe 1 --------------------
// 1 a)
public class Animal extends Creature {
	
	private int numberOfLegs;
	private boolean pet;
	
	
	public Animal (int legs, boolean pet) {
		numberOfLegs = legs;
		this.pet=pet;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int legs) {
		this.numberOfLegs = legs;
	}

	public boolean isPet() {
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 1 a) und b)

	@Override
	public Creature reproduce() {
		if(getAge()>8)
		return new Animal(numberOfLegs, pet);

		return null;
	}

	@Override
	public double bedTime() {
		return 22.0;
	}

	@Override
	public void aging(){
		super.aging();
		super.aging();
	}

	
	

}
