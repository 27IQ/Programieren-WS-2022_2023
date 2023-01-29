package aufgabe4;

public class Node {
	private Bank bank;
	private Node next;
	private Node previous;

	public Node(Bank bank) {
		this.bank = bank;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getPrevious() {
		return previous;
	}

	public Bank getBank() {
		return bank;
	}
}
