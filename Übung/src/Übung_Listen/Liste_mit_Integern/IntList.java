package Liste_mit_Integern;

public class IntList {

	// Das erste Element der Liste.
	private IntListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(int number) {
		IntListElement i=new IntListElement(),current;
		i.setNumber(number);
		
		if(first!=null&&first.getNext()!=null){
			current=first;
			
			while(current.getNumber()<current.getNext().getNumber()){
				current=current.getNext();

				if(current.getNext()==null){
					current.setNext(i);
					break;

				}else if(current.getNumber()<current.getNext().getNumber()){
					i.setNext(current.getNext());
					current.setNext(i);
				}
			}

		}else if(first!=null){
			first.setNext(new IntListElement());
			first.getNext().setNumber(number);

		}else if(first==null){
			first=i;
		}
	}

	// Aufgabe 2
	public int size() {
		int counter=0;
		if(first!=null&&first.getNext()!=null){
			counter++;
			IntListElement current=first;
			while(current.getNext()!=null){
				current=current.getNext();
				counter++;
			}
		}else if(first!=null){
			return 1;
		}
		
		return counter;
	}

	// Aufgabe 3
	public int get(int index) {
		if(-1<index&&index<size()-1){
			IntListElement current=first;
			for (int i = 0; i < index; i++) {
				current=current.getNext();
			}
			return current.getNumber();
		}
		return 0;
	}


	public IntListElement getElement(int index) {
		if(-1<index&&index<size()){
			IntListElement current=first;
			for (int i = 1; i < index+1; i++) {
				current=current.getNext();
			}
			return current;
		}
		return null;
	}

	// Aufgabe 4
	public void reverse() {
		int length=size();
		IntListElement e=getElement(length-1);
		getElement(length-2).setNext(null);
		e.setNext(first);
		first=e;

		for (int i = 1; i < length; i++) {
			e=getElement(length-1);
			getElement(length-2).setNext(null);

			IntListElement current=first;
			for(int a=1;a<i;a++){
				current=current.getNext();
			}

			e.setNext(current.getNext());
			current.setNext(e);
		}
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
		System.out.println("So sieht die Liste aus: " + l);
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