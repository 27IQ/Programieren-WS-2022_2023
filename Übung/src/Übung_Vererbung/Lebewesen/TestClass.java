package Übung_Vererbung.Lebewesen;

public class TestClass {

	public static void main(String[] args) {
		TestClass tester = new TestClass();

		// Test Aufgabe 1 (Klasse Animal) :
		tester.testAnimal();
		// Test Aufgabe 2 (Klasse Human) :
		tester.testHuman();
		// Test Aufgabe 3 (Klasse Student) :
		tester.testStudent();

	}

	public void testAnimal() {
		System.out.println("Die Klasse Animal wird jetzt getestet:\n");

		// Testen ob Animal von Lebewesen erbt und die Methode reproduce() richtig
		// funktioniert
		Creature testAnimal = new Animal(8, false);
		for (int i = 0; i < 8; i++) {
			testAnimal.aging();
		}
		boolean correct = true;
		Animal childAnimal = (Animal) testAnimal.reproduce();
		childAnimal.aging();
		if (!(childAnimal.getNumberOfLegs() == 8 && !childAnimal.isPet())) {
			correct = false;
			System.out.println("Die Methode reproduce() bei der Klasse Animal hat noch nicht funktioniert.");
		}
		Creature testAnimal2 = new Animal(4, true);
		testAnimal2.aging();
		Animal childAnimal2 = (Animal) testAnimal2.reproduce();
		if (!(childAnimal2 == null)) {
			correct = false;
			System.out.println(
					"Die Methode reproduce() bei der Klasse Animal hat noch nicht richtig funktioniert. Es hat sich vermehrt obwohl es noch zu jung war.");
		}

		if (correct) {
			System.out.println("Die Methode reproduce() scheint zu funktionieren.");
		}

		// Testen ob die aging() Methode richtig ueberschrieben wurde
		if (testAnimal.getAge() == 17 && childAnimal.getAge() == 3) {
			System.out.println("Das Tier hat das korrekte Alter! Die Methode aging() scheint zu funktionieren");
		} else {
			System.out.println(
					"Das Tier hat nicht das korrekte Alter! Die Methode aging() scheint nicht zu funktionieren");
		}
		// Testen ob die Methode bedTime() richtig ueberschrieben wurde
		if (testAnimal.bedTime() == 22.0 && childAnimal.bedTime() == 22.0) {
			System.out.println("Die Methode betTime() scheint fuer Animale richtig implemenAnimalt zu sein.");
		} else {
			System.out.println("Die Methode bedTime() scheint noch nicht zu funktionieren.");
		}

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public void testHuman() {
		System.out.println("Die Klasse Human wird jetzt getestet:\n");

		// Testen ob Human von Creature erbt und die Methode reproduce() richtig
		// funktioniert
		Creature testHuman = new Human(true, "Bayern");
		for (int i = 0; i < 25; i++) {
			testHuman.aging();
		}
		Human child = (Human) testHuman.reproduce();
		if (child != null && child.isEarlyRiser() && child.getNation().equals("Bayern")) {
			System.out.println("Die Methode reproduce() scheint zu funktionieren");
		} else {
			System.out.println("Etwas scheint bei der Methode reproduce() noch nicht zu funktionieren.");
		}
		Human kind2 = (Human) child.reproduce();
		if (kind2 != null) {
			System.out.println(
					"Obwohl der Mensch noch zu jung war konnte er ein Kind bekommen. Etwas scheint mit der reproduce() Methode noch nicht zu funktionieren!");
		}
		// Testen ob die Methode bedTime richtig funktioniert
		System.out.println("Ihre Berechnung von bedTime :     " + testHuman.bedTime());
		System.out.println("Das erwartete Ergebnis :          " + 18.0);
		Human human1 = new Human(false, "Narnia");
		System.out.println("Ihre Berechnung von bedTime :     " + human1.bedTime());
		System.out.println("Das erwartete Ergebnis :          " + 22.0);
		human1 = new Human(true, "Narnia");
		System.out.println("Ihre Berechnung von bedTime :     " + human1.bedTime());
		System.out.println("Das erwartete Ergebnis :          " + 21.0);

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public void testStudent() {
		System.out.println("Die Klasse Student wird jetzt getestet:\n");

		// Testen ob Student von Human erbt und die Methode bedTime richtig
		// funktioniert
		Human student1 = new Student(false, "Nirgendwo", 123456);
		System.out.println("Ihre Berechnung von bedTime :     " + student1.bedTime());
		System.out.println("Das erwartete Ergebnis :          " + 21.0);
		student1 = new Student(true, "Mordor", 98765);
		System.out.println("Ihre Berechnung von bedTime :     " + student1.bedTime());
		System.out.println("Das erwartete Ergebnis :          " + 24.0);
		// Testen der Methode under18()
		boolean correct = true;
		Student student2 = new Student(true, "Essen", 117);
		if (!student2.under18()) {
			correct = false;
			System.out.println("Der Student ist noch keine 18 Jahre alt. under18() gibt aber false zurueck.");
		}
		for (int i = 0; i < 30; i++) {
			student2.aging();
		}

		if (student2.under18()) {
			correct = false;
			System.out.println("Der Student ist bereits aelter als 18 Jahre alt. Under18() gibt aber true zurueck");
		}
		if (correct) {
			System.out.println("Die Methoden under18() scheint zu funktionieren");
		}

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
