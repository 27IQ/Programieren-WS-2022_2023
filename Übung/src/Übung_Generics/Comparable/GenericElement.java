package Comparable;

// ---------------- Aufgabe 2 ----------------------
public class GenericElement <T extends Comparable> implements Comparable<GenericElement<T>>{    // Die Klassendeklaration muss noch angepasst werden.
	
	private GenericElement<T> next;
	private T value;  // Soll generisch werden.
	
	public GenericElement(T value, GenericElement<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public GenericElement<T> getNext() {	
		return next;
	}
	
	public void setNext(GenericElement<T> next) {
		this.next = next;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	// Die Methode compareTo soll hier implementiert werden.
	// Zu bearbeitender Bereich:

	@Override
	public int compareTo(GenericElement<T> o) {
		return this.getValue().compareTo(o.getValue());
	}

	//Ende des zu bearbeitenden Bereichs
}
