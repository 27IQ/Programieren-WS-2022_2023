package Liste_mit_Strings;

public class StringList {
	// Das erste Element der Liste
	private StringListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(String string) {
		StringListElement element=new StringListElement(),current=first;
		element.setString(string);

		if(first==null){
			first=element;
			return;
		}

		while(current.getNext()!=null){
			current=current.getNext();
		}

		current.setNext(element);
		element.setPrev(current);
	}

	// Aufgabe 2
	public void insert(String string, int index) {
		StringListElement element=new StringListElement(),current=first;
		element.setString(string);

		if(first==null){
			first=element;
			return;
		}

		if(index==0){
			element.setNext(first);
			first.setPrev(element);
			first=element;
			return;
		}

		for (int i = 1; i < index; i++) {
			current=current.getNext();
		}


		element.setNext(current.getNext());
		if(current.getNext()!=null)
		current.getNext().setPrev(element);

		current.setNext(element);
		element.setPrev(current);
	}

	// Aufgabe 3
	public String get(int index) {
		StringListElement current=first;

		for (int i = 1; i <= index; i++) {
			current=current.getNext();
		}

		return current.getString();
	}

	// Aufgabe 4
	public void remove(int index) {
		StringListElement current=first;

		if(first==null)
		return;

		if(first.getNext()==null){
			first=null;
			return;
		}

		if(index==0){
			first.setPrev(null);
			first=first.getNext();
			first.setPrev(null);
			return;
		}

		for (int i = 1; i < index; i++) {
			current=current.getNext();
		}

		if(current.getNext().getNext()==null){
			current.getNext().setPrev(null);
			current.setNext(null);
			return;
		}

		current.getNext().getNext().setPrev(current);
		current.setNext(current.getNext().getNext());
	}

	/*
	 * Ende des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		StringList liste = new StringList();
		liste.append("Hallo");
		liste.append("Welt");
		liste.append("!");
		System.out.println("Erwartete Ausgabe: first --> \"Hallo\" <--> \"Welt\" <--> \"!\" --> null");
		System.out.println(liste);
		liste.remove(0);
		liste.remove(0);
		liste.remove(0);
		System.out.println("Erwartete Ausgabe: first --> null");
		System.out.println(liste);
		liste.append("ist");
		//System.out.println(liste);
		liste.append("!");
		//System.out.println(liste);
		liste.insert("Dieser", 0);
		//System.out.println(liste);
		liste.insert("falsch", 2);
		//System.out.println(liste);
		liste.insert("Satz", 1);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Dieser\" <--> \"Satz\" <--> \"ist\" <--> \"falsch\" <--> \"!\" --> null");
		System.out.println(liste);
		liste = new StringList();
		liste.insert("Test1", 0);
		liste.insert("Test2", 1);
		System.out.println("Erwartete Ausgabe: first --> \"Test1\" <--> \"Test2\" --> null");
		System.out.println(liste);
		liste.append("Test3");
		liste.append("Test4");
		liste.append("Test5");
		liste.append("Test6");
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test1\" <--> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(0);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(4);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		liste.remove(1);
		System.out.println("Erwartete Ausgabe: first --> \"Test2\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		System.out.println("Erwartete Ausgabe: Test2");
		System.out.println(liste.get(0));
		System.out.println("Erwartete Ausgabe: Test4");
		System.out.println(liste.get(1));
		System.out.println("Erwartete Ausgabe: Test5");
		System.out.println(liste.get(2));
	}

	public String toString() {
		String liste = "first --> ";
		StringListElement element = first;
		while (element != null) {
			liste = liste + "\"";
			liste = liste + element.getString();
			liste = liste + "\"";
			if (element.getNext() != null) {
				liste = liste + " <--> ";
			} else {
				liste = liste + " --> ";
			}
			element = element.getNext();
		}

		liste = liste + "null";

		return liste;
	}
}