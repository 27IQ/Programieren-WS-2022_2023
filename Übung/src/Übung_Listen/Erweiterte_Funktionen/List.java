public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement, int position) {

	}

	// Aufgabe 2
	public int getPosition(Element wanted) {
		return 0;
	}

	// Aufgabe 3
	public String getName(int position) {
		return null;
	}

	// Aufgabe 4
	public void deleteElement() {

	}

	// ------------- HILFSMETHODEN ---------------

	// Methode zum Ausgeben der Anzahl der Elemente in der Liste.
	public int getSize() {
		int count = 0;
		Element pointer = head;
		while (pointer != null) {
			count++;
			pointer = pointer.getNext();
		}
		return count;
	}

	// Methode zum Einfuegen eines neuen Elementes am Ende der Liste.
	public void addElement(Element newElement) {
		if (head == null) {
			head = newElement;
		} else {
			Element pointer = this.head;
			while (pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(newElement);
		}
	}

	// Methode, die die komplette Liste löscht.
	public void clearList() {
		head = null;
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(START_LABEL);
		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		str.append("---> null");
		return str.toString();
	}
}