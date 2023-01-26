package Übung_Graphen;

import java.util.LinkedList;

public class Graph {

	private LinkedList<Crossroad> crossroads;
	private int globalId;

	public Graph() {
		crossroads = new LinkedList<Crossroad>();
		globalId = 1;
	}

	// Beginn des zu Bearbeitenden Bereichs:

	//Aufgabe 1
	public void addCrossroad() {
		crossroads.add(new Crossroad(globalId));
		globalId++;
	}

	//Aufgabe 2
	public Crossroad findCrossroad(int id) {
		if(crossroads.isEmpty())
		return null;

		int i=-1;
		do{
			i++;
			if(crossroads.get(i).getId()==id)
			return crossroads.get(i);
			
		}while(crossroads.get(i)!=crossroads.getLast());

		return null;
	}

	//Aufgabe 3
	public void addOneWayStreet(int startCrossroadId, int targetCrossroadId, int distance) {
		Crossroad start=findCrossroad(startCrossroadId),target=findCrossroad(targetCrossroadId);

		if(start==null||target==null)
		return;

		start.getOneWayStreets().add(new OneWayStreet(target, distance));
	}

	//Aufgabe 4
	public int findOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		Crossroad start=findCrossroad(startCrossroadId),target=findCrossroad(targetCrossroadId);
		int distance=-1;

		if(start==null||target==null)
		return distance;

		if(!start.getOneWayStreets().isEmpty()){
			int i=-1;
			do{
				i++;
				if(start.getOneWayStreets().get(i).getTarget().getId()==target.getId())
				distance=start.getOneWayStreets().get(i).getDistance();

			}while(start.getOneWayStreets().get(i)!=start.getOneWayStreets().getLast());
		}

		return distance;
	}

	//Aufgabe 5
	public void removeOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		Crossroad start=findCrossroad(startCrossroadId),target=findCrossroad(targetCrossroadId);

		if(start==null||target==null)
		return;

		if(start.getOneWayStreets().isEmpty())
		return;

		int i=-1;
		do{
			i++;
			if(start.getOneWayStreets().get(i).getTarget()==target){
				start.getOneWayStreets().remove(i);
				return;
			}

		}while(start.getOneWayStreets().get(i)!=start.getOneWayStreets().getLast());
	}

	//Aufgabe 6
	public void removeCrossroad(int id) {
		if(crossroads.isEmpty())
		return;

		Crossroad target=findCrossroad(id);

		if(target==null)
		return;

		while(!target.getOneWayStreets().isEmpty())
		target.getOneWayStreets().remove();

		int i=-1;
		do{
			i++;
			int j=-1;
			do{
				j++;

				if(crossroads.get(i).getOneWayStreets().isEmpty())
				break;

				if(crossroads.get(i).getOneWayStreets().get(j).getTarget()==target){
					removeOneWayStreet(crossroads.get(i).getId(), id);
					j--;
				}

			}while(crossroads.get(i).getOneWayStreets().get(j)!=crossroads.get(i).getOneWayStreets().getLast());
		}while(crossroads.get(i)!=crossroads.getLast());

		i=-1;
		do{
			i++;
			if(crossroads.get(i).getId()==id){
				crossroads.remove(i);
				return;
			}

		}while(crossroads.get(i)!=crossroads.getLast());
	}

	//Aufgabe 7
	public int totalDistance() {
		int counter=0;

		if(crossroads.isEmpty())
		return counter;
		
		int i=-1;
		do{
			i++;
			int j=-1;
			do{
				j++;

				if(crossroads.get(i).getOneWayStreets().isEmpty())
				break;

				counter+=crossroads.get(i).getOneWayStreets().get(j).getDistance();

			}while(crossroads.get(i).getOneWayStreets().get(j)!=crossroads.get(i).getOneWayStreets().getLast());
		}while(crossroads.get(i)!=crossroads.getLast());

		return counter;
	}

	
	// Ende des zu Bearbeitenden Bereiches

	public String toString() {
		if (crossroads.isEmpty()) {
			return "Crossroads im Graphen: []  Der Graph ist leer.";
		}
		String result = "Crossroads im Graphen: " + crossroads;
		for (Crossroad crossroad : crossroads) {
			for (OneWayStreet oneWayStreet : crossroad.getOneWayStreets()) {
				result += "\n" + crossroad + " ---> " + oneWayStreet.getTarget() + "   [distance = "
						+ oneWayStreet.getDistance() + "]";
			}
		}
		return result;
	}

}