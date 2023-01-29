package aufgabe4;

public class List {
	private Node head;

	public void clear() {
		head = null;
	}

	public void insert(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
			node.setPrevious(current);
		}
	}

	// Aufgabenteil b
	public void printValues() {
		if(head==null)
		return;

		String s="";
		Node  current=head;
		while(current!=null){
			s+=current.getBank().toString();
			current=current.getNext();

			if(current!=null)
			s+=",";
		}

		System.out.println(s);
	}

	public void deleteNodeWithValue(Bank bank) {
		if(head==null)			//T2
		return;


		Node current = head;
		Node lastNonDeletable = head;
		current = head.getNext(); 
		while (current != null) {
			if (current.getBank().compareTo(bank) != 0) {				
				if (current.getPrevious() != lastNonDeletable) {
					current.setPrevious(lastNonDeletable);
					lastNonDeletable.setNext(current);
				}
				lastNonDeletable = current;
			}
			current = current.getNext();
		}
	}
}
