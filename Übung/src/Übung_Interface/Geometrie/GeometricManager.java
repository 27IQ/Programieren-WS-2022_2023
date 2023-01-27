package Übung_Interface.Geometrie;


public class GeometricManager {
	
	Geometric [] shapes;
	
	public GeometricManager (Geometric [] shapes) {
		this.shapes = shapes;
	}
	
	//Beginn des zu bearbeitenden Bereiches
	
	// Aufgabe 3
	public double totalArea () {
		double totalArea=0;
		
		for (Geometric geometric : shapes) {
			totalArea+=geometric.area();
		}
		
		return totalArea;
	}
	
	// Aufgabe 4
	public int countCircles () {
		int counter=0;
		
		for (Geometric geometric : shapes) {
			if(geometric instanceof Circle)
			counter++;
		}
		
		return counter;
	}
	
	// Aufgabe 5
	public void increase () {
		for (Geometric geometric : shapes) {
			if(geometric instanceof Rectangle){
				increaseRectangle((Rectangle)geometric);
			}else{
				increaseCicle((Circle)geometric);
			}
		}
	}

	public void increaseRectangle(Rectangle r){
		r.setWidth(r.getWidth()+1);
		r.setHeight(r.getHeight()+1);
	}

	public void increaseCicle(Circle c){
		c.setRadius(c.getRadius()+1);
	}


}
