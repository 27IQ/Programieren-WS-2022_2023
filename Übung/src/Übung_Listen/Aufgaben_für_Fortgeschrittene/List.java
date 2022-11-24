package Aufgaben_für_Fortgeschrittene;

public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	//Aufgabe 1
	public void addList(List newList) {
		if(head==null){
			head=newList.getHead();
			return;
		}

		if(head.getNext()==null){
			head.setNext(newList.getHead());
			return;
		}

		Element current=head;
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(newList.getHead());	
	}

	public Element getHead(){
		return head;
	}

	//Aufgabe 2
	public void moveElement(int prevPos, int afterPos) {
		Element removed=remove(prevPos);
		if(removed!=null)
		insertElement(removed,afterPos);
	}

	public Element remove(int pos){
		if(0>pos&&pos>getSize())
		return null;

		if(head==null)
		return null;

		Element found=null;
		if(pos==1){
			found=head;
			head=head.getNext();
			return found;
		}

		Element current=head;
		for (int i = 1; i < pos-1; i++) {
			current=current.getNext();
		}

		found=current.getNext();
		
		if(current.getNext().getNext()!=null){
			current.setNext(current.getNext().getNext());
			return found;
		}

		current.setNext(null);
		return found;
	}

	public void insertElement(Element e,int pos){
		if(0>pos&&pos>getSize())
		return;

		if(head==null)
		return;
	
		Element current=head;
		for (int i = 1; i < pos-1; i++) {
			current=current.getNext();
		}

		if(current.getNext()!=null){
			e.setNext(current.getNext());
		}else{
			e.setNext(null);
		}

		current.setNext(e);
	}

	//Aufgabe 3
	public void filterElements(int threshold) {
		boolean[] remove=new boolean[getSize()];

		if(head==null)
		return;

		Element current=head;
		for (int i = 0; i < getSize(); i++) {	
			if(current.getValue()>threshold)
			remove[i]=true;

			current=current.getNext();
		}

		int counter =0;
		for (int i = 0; i < remove.length; i++) {
			if(remove[i]==true){
				remove(i-counter+1); //1,4,8,9
				counter++;
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

	// Methode, die die komplette Liste loescht.
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
			str.append(" (" + pointer.getValue() + ")");
			pointer = pointer.getNext();
		}
		str.append("---> null");
		return str.toString();
	}
}