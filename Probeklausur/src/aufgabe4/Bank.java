package aufgabe4;

public class Bank implements Comparable<Bank> {
	private int number;
	private String name;

	public Bank(int nummer, String name) {
		this.number = nummer;
		this.name = name;
	}

	// Aufgabenteil a
	public String toString() {
		return Integer.toString(number)+name;
	}

	public int compareTo(Bank bank) {
		return compare(this.number, bank.number);
	}

	public static int compare(int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}

	// GETTER SETTER
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
