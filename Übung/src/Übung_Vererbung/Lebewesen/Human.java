package Übung_Vererbung.Lebewesen;
//	-------------------- Aufgabe 2 --------------------
// 2 a)
public class Human extends Creature {

	private boolean earlyRiser;
	private String nation;

	public Human(boolean earlyRiser, String nation) {
		this.earlyRiser = earlyRiser;
		this.nation = nation;
	}

	public boolean isEarlyRiser() {
		return earlyRiser;
	}

	public void setEarlyRiser(boolean earlyRiser) {
		this.earlyRiser = earlyRiser;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 2 b) und c)

	@Override
	public Creature reproduce() {
		if(getAge()>18)
		return new Human(getAge()%2==0, nation);

		return null;
	}

	@Override
	public double bedTime() {
		int earlyRiserValue=0;

		if(earlyRiser==false)
		earlyRiserValue++;

		switch (nation) {
			case "Narnia":
				return 21+earlyRiserValue;
			case "Oz":
				return 19+earlyRiserValue;
			case "Mordor":
				return 24;
			default:
				return 18+earlyRiserValue;
		}
	}

	
}
