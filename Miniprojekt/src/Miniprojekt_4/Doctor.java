package Miniprojekt_4;

public class Doctor extends Person{

	private String phdTopic;

	public Doctor(String firstName, String lastName, int yearOfBirth) {
		super(firstName, lastName, yearOfBirth);
		this.phdTopic="Dr. ";
	}

	public String getPhdTopic() {
		return phdTopic;
	}

	public void setPhdTopic(String phdTopic) {
		this.phdTopic = phdTopic+" ";
	}

	@Override
	public String getName() {
		return getPhdTopic()+super.getName();
	}
}
