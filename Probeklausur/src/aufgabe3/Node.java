package aufgabe3;

public class Node {
	private Gemuese gemuese;
	private int number;
	private Node left;
	private Node right;

	public Node(int number, Gemuese gemuese) {
		this.number = number;
		this.gemuese = gemuese;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Gemuese getGemuese() {
		return gemuese;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}