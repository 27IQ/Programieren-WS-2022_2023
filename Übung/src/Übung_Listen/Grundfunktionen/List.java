package Grundfunktionen;

public class List {

	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement) {
		if(head==null){
			head=newElement;
		}else{
			Element current=head;
			while(current.getNext()!=null){
				current=current.getNext();
			}
			current.setNext(newElement);
		}
	}

	// Aufgabe 2
	public int getSize() {
		if(head!=null){
			Element current=head;
			int count=1;
			while(current.getNext()!=null){
				current=current.getNext();
				count++;
			}
			return count;
		}
		return 0;
	}

	// Aufgabe 3
	public void increase() {
		if(head!=null){
			Element current=head;
			while(current.getNext()!=null){
				current.setValue(current.getValue()+1);
				current=current.getNext();
			}
			current.setValue(current.getValue()+1);
		}
	}

	// Aufgabe 4
	public void deleteElement() {
		if(head!=null&&head.getNext()!=null){
			head=head.getNext();
		}else if(head.getNext()==null){
			head=null;
		}
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(START_LABEL);

		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getValue());
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
}
