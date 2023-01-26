package Comparable;

// ---------------- Aufgabe 1 ----------------------
public class Element implements Comparable<Element>{   // Das Interface Comparable soll implementiert werden
	
	private Element next;
	private int value;
	
	public Element(int value, Element next) {
		this.value = value;
		this.next = next;
	}
	
	public Element getNext() {	
		return next;
	}
	
	public void setNext(Element next) {
		this.next = next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	// Die Methode compareTo soll hier implementiert werden.
	// Zu bearbeitender Bereich

	@Override
	public int compareTo(Element o) {
		if(this.value<o.value)
		return-1;

		if(this.value>o.value)
		return 1;
	
		return 0;
	}

	
	//Ende des zu bearbeitenden Bereichs

}
