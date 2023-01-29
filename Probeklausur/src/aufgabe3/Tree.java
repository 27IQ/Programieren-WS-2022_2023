package aufgabe3;
/* 
 * Aufgabenteil a
 * Frage: Erstellen Sie sich eine Skizze, in der Sie die weiteren Knoten einfügen. 
 * Geben Sie alle Knoten mit Höhe 2 von links nach rechts an. (8 Punkte)
 * 
 * Antwort: 58,5,25,60,7,50,95.40,1,98
 * 
 * 				   /95
 * 				25	
 * 			   /   \7
 * 			5
 * 		   /   \1		
 * 		58
 * 		  \	   /98
 * 			60	
 * 			   \
 * 				50	
 * 				   \40		
 * 
 * 
 * 
 * Aufgabenteil c
 * Frage: Beschreiben Sie was passiert, wenn ein Knoten mit der gleichen Zahl
 * wie ein bereits vorhandener Knoten eingefügt wird. (2 Punkte)
 * 
 * Antwort: 
 * Er wird Rechts von gleichen knoten eingeordnet (an der nächsten freien Stelle die nach dem normalen Algorithmus ermittlet wird)
 * 
 * 
 * Aufgabenteil d
 * Frage: Die Klasse Node soll statt Gemüse eine generische Nutzlast besitzen.
 * Warum muss diese generische Klasse mit Hinblick auf die Methode countSpecificNodes(Node node, String text)
 * ein Interface implementieren und was muss das Interface bereitstellen?
 * 
 * Antwort:
 * 	  Wir benötigen ein interface um sicherzustellen dass das Objekt eine Bezeichnung hat die wir abrufen können damit wir in der Methode danach suchen können
 */

public class Tree {
	private Node root;

	public void add(int number, String text) {
		Node insertableNode = new Node(number, new Gemuese(text));
		if (root == null) {
			root = insertableNode;
		} else {
			if (insertableNode.getNumber() % 2 == 0) {
				if (root.getLeft() != null)
					add(insertableNode, root.getLeft());
				else
					root.setLeft(insertableNode);
			} else {
				if (root.getRight() != null)
					add(insertableNode, root.getRight());
				else
					root.setRight(insertableNode);
			}
		}
	}

	private void add(Node insertableNode, Node currentNode) {
		if (insertableNode.getNumber() < currentNode.getNumber()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(insertableNode);
			} else {
				add(insertableNode, currentNode.getLeft());
			}
		} else if (insertableNode.getNumber() >= currentNode.getNumber()) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(insertableNode);
			} else {
				add(insertableNode, currentNode.getRight());
			}
		}
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(58, "Tomate");
		tree.add(5, "Salat");
		tree.add(25, "Olive");
		tree.add(60, "Gurke");
		tree.add(7, "Tomate");
		tree.add(50, "Karotte");
		tree.add(95, "Zwiebel");
		tree.add(40, "Olive");
		tree.add(1, "Lauch");
		tree.add(98, "Gurke");
		System.out.println("Nodecount Olive: " + tree.countSpecificNodes("Olive"));
	}

	public int countSpecificNodes(String text) {
		if (root != null)
			return countSpecificNodes(root, text);
		return 0;
	}

	//Aufgabenteil b)
	public int countSpecificNodes(Node node, String bezeichnung) {
		int counter=0;

		if(node.getLeft()!=null)
		counter+=countSpecificNodes(node.getLeft(), bezeichnung);

		if(node.getGemuese().getBezeichnung().equals(bezeichnung))
		counter++;

		if(node.getRight()!=null)
		counter+=countSpecificNodes(node.getRight(), bezeichnung);

		return counter;
	}
}