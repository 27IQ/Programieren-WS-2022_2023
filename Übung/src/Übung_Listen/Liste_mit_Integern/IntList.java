package Liste_mit_Integern;

public class IntList {

	// Das erste Element der Liste.
	private IntListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(int number) {
		IntListElement element=new IntListElement(),current=first;
		element.setNumber(number);

		if(first==null){
			first=element;
			return;
		}

		if(element.getNumber()<first.getNumber()){
			element.setNext(first);
			first=element;
			return;
		}

		int counter=1;
		while(element.getNumber()>current.getNumber()){
			current=current.getNext();
			counter++;

			if(current==null)
			break;
		}

		current=first;
		for (int i = 1; i < counter-1; i++) {
			current=current.getNext();
		}

		element.setNext(current.getNext());
		current.setNext(element);
	}

	// Aufgabe 2
	public int size() {
		if(first==null)
		return 0;

		if(first.getNext()==null)
		return 1;

		IntListElement current=first;
		int counter=0;
		while(current!=null){
			current=current.getNext();
			counter++;
		}
		return counter;
	}

	// Aufgabe 3
	public int get(int index) {
		if(-1>index||index>size()){
			return 0;
		}

		IntListElement current=first;
		for (int i = 0; i < index; i++) {
			current=current.getNext();
		}

		return current.getNumber();
	}


	public IntListElement getElement(int index) {
		return first;
	}

	// Aufgabe 4
	public void reverse() {
		IntListElement[] map=new IntListElement[size()];
		IntListElement current=first;

		for (int i = 0; i < map.length; i++) {
			map[i]=current;
			current=current.getNext();
		}

		first=map[map.length-1];
		current=first;

		for (int i = 0; i < map.length; i++) {
			current.setNext(map[map.length-i-1]);
			current=current.getNext();
		}
		current.setNext(null);
	}

	
	

	/*
	 * ENDE des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		IntList l = new IntList();
		l.append(10);
		l.append(20);
		l.append(42);
		l.append(-10);
		l.append(30);
		//l.append(60);
		System.out.println("So sieht die Liste aus: " + l);
		//System.out.println(l.size());
		System.out.println("Das Element an Index 0: " + l.get(0));
		System.out.println("Das Element an Index -10 (Gibt es nicht, sollte also 0 sein): " + l.get(-10));
		System.out.println("Das Element an Index 100 (Gibt es nicht, sollte also 0 sein): " + l.get(100));
		System.out.println("Das Element an Index 2: " + l.get(2));
		
		System.out.println("Die Liste hat " + l.size() + " Elemente.");
		l.reverse();
		System.out.println("Liste wurde gedreht");
		System.out.println("Nun sieht die Liste so aus: " + l);
	}

	public String toString() {
		String liste = "first --> ";
		IntListElement element = first;
		while (element != null) {
			liste = liste + element.getNumber();
			liste = liste + " --> ";
			element = element.getNext();
		}
		liste = liste + "null";
		return liste;
	}
}