public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement, int position) {
		if(1>position||position>getSize()+1)
		return;

		if(head==null){
			head=newElement;
			return;
		}

		if(position==1){
			newElement.setNext(head);
			head=newElement;
			return;
		}

		Element current=head;
		for (int i = 1; i < position-1; i++) {
			if(current.getNext()!=null)
			current=current.getNext();
		}

		if(current.getNext()!=null)
		newElement.setNext(current.getNext());

		current.setNext(newElement);
	}

	// Aufgabe 2
	public int getPosition(Element wanted) {
		if(head==null)
		return 0;

		if(head==wanted)
		return 1;

		Element current=head;
		int pos=0;

		for (int i = 1; i <= getSize(); i++) {
			pos++;
			if(current.getName()==wanted.getName()&&current.getValue()==wanted.getValue())
			return pos;
			current=current.getNext();
		}

		return 0;
	}

	// Aufgabe 3
	public String getName(int position) {

		if(head==null||0>position||position>getSize())
		return null;

		Element current=head;
		for (int i = 1; i < position; i++) {
			current=current.getNext();
		}

		return current.getName();
	}

	// Aufgabe 4
	public void deleteElement() {
		if(head==null)
		return;

		if(head.getNext()==null){
			head=null;
			return;
		}

		Element current=head;
		for (int i = 1; i < getSize()-1; i++) {
			current=current.getNext();
		}

		current.setNext(null);
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