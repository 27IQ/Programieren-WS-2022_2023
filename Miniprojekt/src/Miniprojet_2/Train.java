public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		return -1;
	}

	public int getPassengerCount() {
		return -1;
	}

	public int getCapacity() {
		return -1;
	}

	public void appendWaggon(Waggon waggon) {
		if(head==null){
			head=waggon;
			return;
		}

		
		Waggon current=head;
		while(true){
			current=current.getNext();
		}
	}

	public void boardPassengers(int numberOfPassengers) {
	}

	public Train uncoupleWaggons(int index) {
		return new Train();
	}

	public void insertWaggon(Waggon waggon, int index) {
	}

	public void turnOver() {
	}

	public void removeWaggon(Waggon waggon) {
	}

	public Waggon getWaggonAt(int index) {
		return null;
	}

	@Override
	public String toString() {
		if (getSize() == 0) {
			return LOCOMOTIVE;
		}

		StringBuilder str = new StringBuilder(LOCOMOTIVE);

		Waggon pointer = head;
		while (pointer != null) {
			str.append(" <---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		return str.toString();
	}
	
	public Waggon getHead() {
		return head;
	}

}
