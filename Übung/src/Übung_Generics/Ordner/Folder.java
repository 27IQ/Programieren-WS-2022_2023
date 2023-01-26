package Ordner;
//--------------- Aufgabe 1 ---------------
public class Folder <T> {
	
	private T value;
	
	public Folder (T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
