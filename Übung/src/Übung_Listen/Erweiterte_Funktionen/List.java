public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement, int position) {
		if(head!=null){
<<<<<<< HEAD
			if(position>1&&position<=getSize()){
				Element current=head;
				for(int i=1;i<position-1;i++){
					current=current.getNext();
				}

=======
			if(position>1&&position<=getSize()+1){
				Element current=head;

				for(int i=1;i<position-1;i++){
					current=current.getNext();
				}

>>>>>>> 96ffac978d0244e7b351b8712a618439e6fc0d6b
				if(current.getNext()!=null){
					newElement.setNext(current.getNext());
					current.setNext(newElement);
				}else{
					current.setNext(newElement);
				}

<<<<<<< HEAD
			}else{
				if(position==1){
					head=newElement;
				}
			}
=======
			}else if(position==1&&position<=getSize()+1){
				newElement.setNext(head);
				head=newElement;
			}
		}else{
			head=newElement;
>>>>>>> 96ffac978d0244e7b351b8712a618439e6fc0d6b
		}
	}

	// Aufgabe 2
	public int getPosition(Element wanted) {
<<<<<<< HEAD
		int currentPos=1;
		Element current=head;

		while(current!=wanted){
			current=current.getNext();
			currentPos++;
			if(current==null){
				currentPos=0;
				break;
			}
		}

=======
		int currentPos=0;
		if(head!=null){
			currentPos++;
			Element current=head;

			while(current!=wanted){
				current=current.getNext();
				currentPos++;
				if(current.getNext()==null&&current!=wanted){
					currentPos=0;
					break;
				}
			}
		}
>>>>>>> 96ffac978d0244e7b351b8712a618439e6fc0d6b
		return currentPos;
	}

	// Aufgabe 3
	public String getName(int position) {
		Element current=head;

		if(position<=getSize()){
			for(int i=1;i<position;i++){
				current=current.getNext();
			}
			return current.getName();
		}

		return null;
	}

	// Aufgabe 4
	public void deleteElement() {

		if(head!=null){
<<<<<<< HEAD
			Element current=head;
			for(int i=1;i<getSize()-1;i++){
				current=current.getNext();
			}
			if(head.getNext()==null){
				head=null;
			}else{
=======
			if(head.getNext()==null){
				head=null;
			}else{
				Element current=head;
				for(int i=1;i<getSize()-1;i++){
					current=current.getNext();
				}
>>>>>>> 96ffac978d0244e7b351b8712a618439e6fc0d6b
				current.setNext(null);
			}
		}
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