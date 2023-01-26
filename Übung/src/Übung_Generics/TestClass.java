public class TestClass {
	
	public static void main (String [] args) {

		System.out.println("---------------------------- Test von methodWithProblems1 ----------------------------");
		Human <Integer,Integer> human1 = new Human <Integer,Integer>("Carl",13,14);
		//methodWithProblems1(human1);  // Diese Zeile sollte einen Kompilierfehler hervorrufen. Sobald dies der Fall ist, koennen Sie den Aufruf einfach auskommentieren.  Achtung! Wenn der Fehler erst beim ausfuehren des Programmes deutlich wird, ist die Aufgabe noch nicht geloest!
		human1.setRightPocket(human1.getRightPocket());
		Human <Integer,Boolean> human2 = new Human <Integer,Boolean>("Sarah",-2,false);
		ClassWithProblems.methodWithProblems1(human2);
		System.out.println("Ihr Ergebnis:          " + human2.getLeftPocket());
		System.out.println("Erwartetes Ergebnis:   42");
		System.out.println("Ihr Ergebnis:          "+ human2.getRightPocket());
		System.out.println("Erwartetes Ergebnis:   " + true);
		System.out.println("\n---------------------------- Test von methodWithProblems2 ----------------------------");
		Human <String,Double> human3 = new Human <String,Double>("Bob","Geld",17.31);
		Human <String,Double> human4 = new Human <String,Double>("Lea","Stein",-51.1);
		Human <String,Double> [] humans = new Human  [] {human3,human4};
		//methodWithProblems2(humans);  // Diese Zeile sollte einen Kompilierfehler hervorrufen. Sobald dies der fall ist, koennen Sie den Aufruf einfach auskommentieren.  Achtung! Wenn der Fehler erst beim ausfuehren des Programmes deutlich wird, ist die Aufgabe noch nicht geloest!
		Human <Integer,Integer> human5 = new Human <Integer,Integer>("Philip",81,13);
		Human <Integer,Integer> human6 = new Human <Integer,Integer>("Marie",81,0);
		Human <Integer,Integer> [] humans2 = new Human [] {human5,human6};
		int [] numbers = ClassWithProblems.methodWithProblems2(humans2);
		
		System.out.println("Ihr Ergebnis:            " +numbers[0]);
		System.out.println("Erwartetes Ergebnis:     " + 94);
		System.out.println("Ihr Ergebnis:            " + numbers[1]);
		System.out.println("Erwartetes Ergebnis:     " + 81);
		
	}
}