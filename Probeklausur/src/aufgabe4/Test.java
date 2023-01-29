package aufgabe4;

public class Test {
	public static void main(String[] args) {
		List list = new List();

		/*optionales Template für ihre Testfälle*/
		// T1: beschreibung
		// fehlerhaftes Verhalten
		fillList(list);
		System.out.println("\nT1:");
		//list.printValues();
		//fügen Sie hier ihren Testfall ein
		
		list.printValues();
		list.deleteNodeWithValue(new Bank(3, "J")); //wird nicht gelöscht 
		list.deleteNodeWithValue(new Bank(6, "n"));	//wird gelöscht
		list.deleteNodeWithValue(new Bank(1, "s")); //wird auch nicth glöscht sondern 1o
		list.printValues();


		System.out.println("\nT2:");
		list.clear();

		list.deleteNodeWithValue(new Bank(1, "s"));

		//erster und letzter werden nicht gelöscht und Banken mit der gleichen Nummer aber anderem String werden gelöscht 
		//(Zeile 18 1o wird statt 1s gelöscht )


	}

	public static void fillList(List list) {
		list.clear();

		list.insert(new Node(new Bank(3, "J")));
		list.insert(new Node(new Bank(1, "o")));
		list.insert(new Node(new Bank(6, "n")));
		list.insert(new Node(new Bank(4, "a")));
		list.insert(new Node(new Bank(1, "s")));

	}
}