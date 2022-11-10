public class Train {
	private Coach firstCoach = null;
	private Coach lastCoach = null;

	public void append(Coach c) {
		if (c == null) {
			return;
		}
		if (firstCoach == null) {
			firstCoach = c;
			lastCoach = c;
		} else {
			lastCoach.setNext(c);
			lastCoach = c;
		}
	}

	public void remove() {
		if (firstCoach == null)
			return;
		if (firstCoach.getNext() == null) {
			lastCoach = null;
			firstCoach = null;
		} else {
			lastCoach = firstCoach;
			while (lastCoach.getNext().getNext() != null) {
				lastCoach = lastCoach.getNext();
			}
			lastCoach.setNext(null);
		}
	}

	public Coach getFirstCoach() {
		return firstCoach;
	}

	public void setFirstCoach(Coach firstCoach) {
		this.firstCoach = firstCoach;
	}

	public Coach getLastCoach() {
		return lastCoach;
	}

	public void setLastCoach(Coach lastCoach) {
		this.lastCoach = lastCoach;
	}

	public boolean checkAvailability(int[] passengers) {
		if(passengers==null) {
			return true;
		}
		Coach currentCoach = firstCoach;
		for (int i = 0; i < passengers.length; i++) {
			
			if (currentCoach == null ) {
				return false;
			}
			int maximumAdditionalPassengers = 50 - currentCoach.getNumberOfPassengers();
			if(maximumAdditionalPassengers < passengers[i] ) {
				return false;
			}
			currentCoach = currentCoach.getNext();
		}
		return true;
	}

	public void coupleCoach(Coach coach, int position) {
		if(coach == null || position<0) {
			return;
		}
		Coach pointer = firstCoach;
		if (position < 1) {
			firstCoach = coach;
			firstCoach.setNext(pointer);
			return;
		}
		int counter = 1;
		while (pointer.getNext() != null && counter < position) {
			pointer = pointer.getNext();
			counter++;
		}
		if (pointer == lastCoach) {
			append(coach);
		} else {
			coach.setNext(pointer.getNext());
			pointer.setNext(coach);
		}

	}
	
	public void uncoupleCoach(Coach coach) {
		if(coach==null || firstCoach==null) {
			return;
		}
		
		if(firstCoach==coach) {
			firstCoach = firstCoach.getNext();
		}
		else {
			Coach pointer = firstCoach;
			while(pointer.getNext() !=null && pointer.getNext() != coach) {
				pointer = pointer.getNext();
			}
			if(pointer.getNext()!=null) {
				pointer.setNext(pointer.getNext().getNext());
			}
		}
		
	}
}