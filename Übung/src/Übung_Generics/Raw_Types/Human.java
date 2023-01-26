package Raw_Types;
//---------------------------- Aufgabe 1 -------------------------
public class Human <S,T> {
	
	private String name;
	private S leftPocket;  // Soll generisch werden
	private T rightPocket; // Soll generisch werden
	
	public Human (String name, S left, T right) {
		this.name = name;
		this.leftPocket = left;
		this.rightPocket= right;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public S getLeftPocket() {
		return leftPocket;
	}

	public void setLeftPocket(S leftPocket) {
		this.leftPocket = leftPocket;
	}

	public T getRightPocket() {
		return rightPocket;
	}

	public void setRightPocket(T rightPocket) {
		this.rightPocket = rightPocket;
	}
}

