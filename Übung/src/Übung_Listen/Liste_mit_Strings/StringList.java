package Liste_mit_Strings;

public class StringList {
	// Das erste Element der Liste
	private StringListElement first;
	private int size=0;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(String string) {
		StringListElement e=new StringListElement();
		e.setString(string);

		if(first!=null){
			StringListElement current=first;

			while(current.getNext()!=null){
				current=current.getNext();
			}
		
			current.setNext(e);
			e.setPrev(current);

		}else{
			first=e;
		}
		size++;
	}

	// Aufgabe 2
	public void insert(String string, int index) {
		StringListElement current=first,e=new StringListElement();
		e.setString(string);

		if(0<index&&index<=size){
			for(int i=1;i<index;i++){
				current=current.getNext();
			}

			if(current.getNext()!=null){
				e.setNext(current.getNext());
				e.setPrev(current);
				e.getNext().setPrev(e);
				current.setNext(e);
			}else{
				e.setPrev(current);
				current.setNext(e);
			}

			size++;
			
		}else if(0==index){
			e.setNext(first);
			if(first!=null){
				first.setPrev(e);
				first=e;
			}else{
				first=e;
			}
			size++;
		}
	}

	// Aufgabe 3
	public String get(int index) {
		if(-1<index&&index<=size){
			StringListElement current=first;

			for(int i=1;i<=index;i++){
				current=current.getNext();
			}
			return current.getString();
		}
		return "";
	}

	// Aufgabe 4
	public void remove(int index) {
		if(first!=null&&first.getNext()!=null){
			StringListElement current=first;
			if(index>1){
				for(int i=1;i<index;i++){
					current=current.getNext();
				}

				current.getNext().setPrev(current.getPrev());
				current.getPrev().setNext(current.getNext());
				
			}else if(index==0){
				first.getNext().setPrev(null);
				first=first.getNext();
			}else if(index==1){
				current=current.getNext();
				current.getNext().setPrev(current.getPrev());
				current.getPrev().setNext(current.getNext());
			}


		}else if(first!=null){
			first=null;
			size=1;
		}
		
		if(first!=null){
			
		}else{
			size=1;
		}
		size--;
	}

	/*
	 * Ende des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		StringList liste = new StringList();
		liste.append("Hallo");
		liste.append("Welt");
		liste.append("!");
		System.out.println("first --> \"Hallo\" <--> \"Welt\" <--> \"!\" --> null");
		System.out.println(liste);
		liste.remove(0);
		liste.remove(0);
		liste.remove(0);
		System.out.println("first --> null");
		System.out.println(liste);
		liste.append("ist");
		liste.append("!");
		liste.insert("Dieser", 0);
		liste.insert("falsch", 2);
		liste.insert("Satz", 1);
		System.out.println(
				"first --> \"Dieser\" <--> \"Satz\" <--> \"ist\" <--> \"falsch\" <--> \"!\" --> null");
		System.out.println(liste);
		liste = new StringList();
		liste.insert("Test1", 0);
		liste.insert("Test2", 1);
		System.out.println("first --> \"Test1\" <--> \"Test2\" --> null");
		System.out.println(liste);
		liste.append("Test3");
		liste.append("Test4");
		liste.append("Test5");
		liste.append("Test6");
		System.out.println(
				"first --> \"Test1\" <--> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(0);
		System.out.println(
				"first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(4);
		System.out.println(
				"first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		liste.remove(1);
		System.out.println("first --> \"Test2\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		System.out.println("Test2");
		System.out.println(liste.get(0));
		System.out.println("Test4");
		System.out.println(liste.get(1));
		System.out.println("Test5");
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