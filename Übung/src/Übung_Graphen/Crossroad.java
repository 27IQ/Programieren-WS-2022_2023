package Übung_Graphen;

import java.util.LinkedList;

public class Crossroad {
	
	private LinkedList<OneWayStreet> oneWayStreets;
	private int id;
	
	
	public Crossroad (int id) {
		this.id = id;
		oneWayStreets = new LinkedList<OneWayStreet>();
	}
	
	public int getId() {
		return id;
	}
	
	public LinkedList<OneWayStreet> getOneWayStreets(){
		return oneWayStreets;
	}
	
	public String toString () {
		return id+"";
	}
	

}
