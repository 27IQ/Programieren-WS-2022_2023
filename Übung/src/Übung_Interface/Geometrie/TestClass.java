package Übung_Interface.Geometrie;
import java.text.DecimalFormat;

public class TestClass {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#0.00");
		
		GeometricManager manager = new GeometricManager(new Geometric [4]);
		
		manager.shapes[0] = new Rectangle (5,4);
		manager.shapes[1] = new Circle (2);
		
		double area = 0;
		area = manager.shapes[0].area();
		System.out.println("------------------ Test Aufgabe 1 ------------------");
		System.out.println("Der Flaecheninhalt ihres Rechtecks:  "+ f.format(area));
		System.out.println("Erwarteter Flaecheninhalt:           " + f.format(20.0));
		
		System.out.println("\n------------------ Test Aufgabe 2 ------------------");
		area = manager.shapes[1].area();
		System.out.println("Der Flaecheninhalt ihres Kreises:  " + f.format(area));
		System.out.println("Erwarteter Flaecheninhalt:         " + f.format(12.57));
		
		System.out.println("\n------------------ Test Aufgabe 3 ------------------");
		manager.shapes[2]= new Circle (3.1);
		manager.shapes[3] = new Rectangle (3,6);
		System.out.println("Ihre Ausgabe bei der Methode totalArea: "+ f.format(manager.totalArea()));
		System.out.println("Erwartete Ausgabe:                      " + f.format(80.76));
		
		System.out.println("\n------------------ Test Aufgabe 4 ------------------");
		System.out.println("Ihre Ausgabe bei der Methode countCircle:  " + manager.countCircles());
		System.out.println("Erwartete Ausgabe:                         " + 2);
		
		System.out.println("\n------------------ Test Aufgabe 5 ------------------");
		manager.increase();
		System.out.println("Nach dem Aufruf der Methode increase, sollte nun auch die Methode totalArea einen groesseren Wert zurueckgeben:");
		System.out.println("Ihre Ausgabe:       " + f.format(manager.totalArea()));
		System.out.println("Erwartete Ausgabe:  " + f.format(139.08));

	}

}
