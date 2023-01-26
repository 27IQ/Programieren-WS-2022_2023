package Übung_Graphen;

public class RoadSystem {

	public static void main(String[] args) {

		Graph graph1 = new Graph();
		System.out.println("--------------Test der Methode addCrossroad------------------\n");
		graph1.addCrossroad();
		System.out.println(graph1 + "            (Erwartet [1])");
		graph1.addCrossroad();
		graph1.addCrossroad();
		System.out.println(graph1 + "      (Erwartet [1, 2, 3])");

		System.out.println("\n--------------Test der Methode findCrossroad------------------\n");
		System.out.println(graph1.findCrossroad(2) + "               (Erwartet 2)");
		System.out.println(graph1.findCrossroad(1) + "               (Erwartet 1)");
		System.out.println(graph1.findCrossroad(4) + "            (Erwartet null)");

		System.out.println("\n--------------Test der Methode addOneWayStreet------------------\n");
		graph1.addOneWayStreet(1, 2, 10);
		System.out.println(graph1 + "            (Erwartet: 1 ---> 2   [distance = 10]) \n");
		graph1.addOneWayStreet(1, 3, 24);
		graph1.addOneWayStreet(3, 2, 11);
		System.out.println("Die Folgenden zwei Graphen sollten identisch aussehen: \n" + graph1 + "\n");
		graph1.addOneWayStreet(4, 2, 2);
		System.out.println(graph1);
		
		System.out.println("\n--------------Test der Methode findOneWayStreet------------------\n");
		System.out.println("Strecke von Kreuzung 1 nach 2:   "+graph1.findOneWayStreet(1, 2) + "  (Erwartete Ausgabe:  10)");
		System.out.println("Strecke von Kreuzung 1 nach 3:   "+graph1.findOneWayStreet(1, 3) + "  (Erwartete Ausgabe:  24)");
		System.out.println("Strecke von Kreuzung 3 nach 1:   "+graph1.findOneWayStreet(3, 1) + "  (Erwartete Ausgabe:  -1)");

		System.out.println("\n--------------Test der Methode removeOneWayStreet------------------\n");
		System.out.println("Die Strasse von 1 nach 2 sollte nun entfernt sein");
		graph1.removeOneWayStreet(1, 2);
		System.out.println(graph1);
		System.out.println("\nDie Folgenden zwei Graphen sollten identisch aussehen:");
		graph1.removeOneWayStreet(3, 2);
		System.out.println(graph1 + "\n");
		graph1.removeOneWayStreet(3, 1);
		graph1.removeOneWayStreet(5, 4);
		System.out.println(graph1 + "\n");

		System.out.println("\n--------------Test der Methode removeCrossroad------------------\n");
		graph1.removeCrossroad(2);
		System.out.println("Die Kreuzung mit der id 2 sollte nun entfernt sein");
		System.out.println(graph1);
		System.out.println("\nDer Graph sollte jetzt keine Kreuzungen und Strassen mehr enthalten");
		graph1.removeCrossroad(1);
		graph1.removeCrossroad(3);
		System.out.println(graph1);

		System.out.println("\n--------------Test der Methode totalDistance------------------\n");
		graph1.addCrossroad();
		graph1.addCrossroad();
		graph1.addCrossroad();
		graph1.addOneWayStreet(6, 5, 19);
		graph1.addOneWayStreet(6, 4, 3);
		graph1.addOneWayStreet(5, 4, 11);
		System.out.println(graph1);
		System.out.println("Die Strecke aller Strassen addiert ergibt: "+graph1.totalDistance());

	}

}
