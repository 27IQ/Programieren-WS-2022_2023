package Rekkursion_in_Listen2;

import java.text.*;

public class Kiosk {

	private static final String LIST = "|START|";
	public Item head;
	

//	-------------------- Aufgabe 1 --------------------

	public int getSize() {
		if(head==null)
		return 0;

		return getSizeRekurs(head);
	}
	
	private int getSizeRekurs(Item item) {
		if(item.getNext()!=null)
		return 1+getSizeRekurs(item.getNext());
		
		return 1;
	}
	
	
//	-------------------- Aufgabe 2 --------------------
	
	public void add(Item newItem) {
		if(head==null){
			head=newItem;
			return;
		}

		addRekurs(head, newItem);
	}
	
	private void addRekurs(Item item, Item newItem) {
		if(item.getNext()!=null){
			addRekurs(item.getNext(), newItem);
			return;
		}

		item.setNext(newItem);
	}
	
	
//	-------------------- Aufgabe 3 --------------------
	
	public double getPrice(String name) {
		if(head==null)
		return 0;

		return getPriceRekurs(head, name);
	}
	
	private double getPriceRekurs(Item item, String name) {
		if(item.getName()==name)
		return item.getPrice();

		if(item.getNext()!=null)
		return getPriceRekurs(item.getNext(), name);

		return 0;
	}
//	-------------------- Printmethode --------------------
	
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(LIST);
		DecimalFormat f = new DecimalFormat("#0.00");

		Item pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getName());
			str.append(" (" + f.format(pointer.getPrice()) + ") ");
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
	
}
