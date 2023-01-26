package Übung_Graphen;


public class OneWayStreet {
	
	private Crossroad target;
	private int distance;
	
	public OneWayStreet (Crossroad target, int distance) {
		this.target = target;
		this.distance = distance;
	}

	public Crossroad getTarget() {
		return target;
	}

	public void setTarget(Crossroad target) {
		this.target = target;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String toString () {
		return ""+distance;
	}

}
