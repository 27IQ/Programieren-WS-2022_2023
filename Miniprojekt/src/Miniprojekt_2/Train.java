public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		if(head==null)
			return 0;

		Waggon current=head;
		int counter=1;
		while(current.getNext()!=null){
			counter++;
			current=current.getNext();
		}
		return counter;
	}

	public int getPassengerCount() {
		int count=0;
		if(head==null)
			return 0;

		Waggon current=head;
		while(current.getNext()!=null){
			count+=current.getPassengers();
			current=current.getNext();
		}

		count+=current.getPassengers();
		current.getNext();

		return count;
	}

	public int getCapacity() {
		if(head==null)
		return 0;
		Waggon current=head;
		int capacity=0;

		while(current.getNext()!=null){
			capacity+=current.getCapacity();
			current=current.getNext();
		}

		capacity+=current.getCapacity();
		current.getName();
		
		return capacity;
	}

	public void appendWaggon(Waggon waggon) {
		if(head==null){
			head=waggon;
			return;
		}

		
		Waggon current=head;
		while(current.getNext()!=null){
			current=current.getNext();
		}

		current.setNext(waggon);
	}

	public void boardPassengers(int numberOfPassengers) {
		if(head==null)
		return;

		Waggon current=head;

		while(numberOfPassengers!=0){
			while(current.getPassengers()<current.getCapacity()){
				numberOfPassengers--;
				current.setPassengers(current.getPassengers()+1);

				if(numberOfPassengers==0)
				return;
			}

			if(current.getNext()==null)
				return;
			
			current=current.getNext();
		}

	}

	public Train uncoupleWaggons(int index) {
		Train t=new Train();

		if(0 > index&&index > getSize()||head==null)
		return t;

		if(index==0){
			t.appendWaggon(head);
			head=null;
			return t;
		}
		
		Waggon current=head;

		for(int i=1;i<index;i++){
			current=current.getNext();
		}
		Waggon next=current.getNext();

		current.setNext(null);
		t.appendWaggon(next);
		return t;
	}

	public void insertWaggon(Waggon waggon, int index) {
		if(index<0)
		return;

		if(index>=getSize()||head==null){
			appendWaggon(waggon);
			return;
		}

		if(index==0){
			waggon.setNext(head);
			head=waggon;
			return;
		}

		Waggon current=head;
		for (int i = 1; i < index; i++) {
			current=current.getNext();
		}

		waggon.setNext(current.getNext());
		current.setNext(waggon);
	}

	public void turnOver() {
		if(head==null||head.getNext()==null)
		return;

		Waggon current=head;
		Waggon[] map=new Waggon[getSize()];
		
		for (int i = 0; i < getSize(); i++) {
			map[i]=current;
			current=current.getNext();
		}

		head=map[map.length-1];
		current=head;
		for (int i = map.length-2; i >=0; i--) {
			current.setNext(map[i]);
			current=current.getNext();
		}
		current.setNext(null);
	}

	public void removeWaggon(Waggon waggon) {
		if(head==null||head.getNext()==null&&waggon!=head){
			return;
		}else if(head.getNext()==null&&waggon==head){
			head=null;
			return;
		}else if(waggon==head){
			head=head.getNext();
			return;
		}
		
		Waggon current=head;

		

		int counter=1;

		while(current.getNext()!=null&&current!=waggon){
			current=current.getNext();
			counter++;
		}

		if(current!=waggon)
		return;

		current=head;
		for (int i = 1; i < counter-1; i++) {
			current=current.getNext();
		}

		
		if(current.getNext().getNext()!=null){
			Waggon next=current.getNext().getNext();
			current.getNext().setNext(null);
			current.setNext(next);
		}else{
			current.setNext(null);
		}
		
		
	}

	public Waggon getWaggonAt(int index) {
		if(-1<index&&index<getSize()){
			Waggon current=head;

			for (int i = 1; i <= index; i++) {
				current=current.getNext();	
			}

			return current;
		}
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
