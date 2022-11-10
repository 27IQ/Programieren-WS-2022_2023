
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Train chocho = new Train();
		System.out.println("Zug ohne Anhänger:");
		printTrain(chocho);
		Coach firstCoach = new Coach(5);
		chocho.append(firstCoach);
		System.out.println("Zug mit ersten Anhänger:");
		printTrain(chocho);

		Coach secondCoach = new Coach(7);
		chocho.append(secondCoach);
		Coach thirdCoach = new Coach(22);
		chocho.append(thirdCoach);
		Coach fourthCoach = new Coach(18);
		chocho.append(fourthCoach);
		Coach fithCoach = new Coach(1);
		chocho.append(fithCoach);
		
		System.out.println("Zug mit fünf Anhänger:");
		printTrain(chocho);
		
		int[] passengers = { 5, 3, 7, 9, 49 };
		System.out.println("Passagiere: "+Arrays.toString(passengers)+" können einsteigen: "+chocho.checkAvailability(passengers));
		
		int[] passengers2 = { 5, 3, 7, 9, 50 };
		System.out.println("Passagiere: "+Arrays.toString(passengers2)+" können einsteigen: "+chocho.checkAvailability(passengers2));
		
		int[] passengers3 = { 5, 3, 7, 9, 49, 1 };
		System.out.println("Passagiere: "+Arrays.toString(passengers3)+" können einsteigen: "+chocho.checkAvailability(passengers3));
		
		
		System.out.println("\n\nWeiteren Wagen hinter Position 4 einfügen");
		Coach anotherCoach = new Coach(99);
		chocho.coupleCoach(anotherCoach, 4);
		printTrain(chocho);
		
		System.out.println("Auskoppeln von anotherCoach(99 Passagiere)");
		chocho.uncoupleCoach(anotherCoach);
		printTrain(chocho);
		System.out.println("Auskoppeln von firstCoach(5 Passagiere)");
		chocho.uncoupleCoach(firstCoach);
		printTrain(chocho);
		System.out.println("Auskoppeln von fithCoach(1 Passagier)");
		chocho.uncoupleCoach(fithCoach);
		printTrain(chocho);
		
		System.out.println("Auskoppeln von letzten Wagen (18 Passagiere)");
		chocho.remove();
		printTrain(chocho);
		System.out.println("Auskoppeln von letzten Wagen (22 Passagiere)");
		chocho.remove();
		printTrain(chocho);
		System.out.println("Auskoppeln von letzten Wagen (7 Passagiere)");
		chocho.remove();
		printTrain(chocho);
	}

	private static void printTrain(Train train) {
		if(train == null) {
			System.out.println("Kein Zug vorhanden");
			return;
		}

		/*Unnötige Aufhübschung Start*/		
		System.out.println("      ___");
		System.out.println(" _][__| |");
		System.out.print("<________|-:");		
		/*Unnötige Aufhübschung Ende*/
		
		Coach nextCoach;
		nextCoach = train.getFirstCoach();
		while (nextCoach != null) {
			System.out.print("[" + nextCoach.getNumberOfPassengers() + "]-:");
			nextCoach = nextCoach.getNext();
		}
		System.out.println("null");
		
		/*Unnötige Aufhübschung Start*/	
		System.out.println("  O-O-O-O\n");
		/*Unnötige Aufhübschung Ende*/
	}
}
