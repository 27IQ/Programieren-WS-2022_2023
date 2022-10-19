package Basic;
// Begrüssung
//
// Die Methode greeting soll eine Begrüssung abhängig vom als Parameter
// übergebenen Namen zurückgeben. Vervollständigen Sie die Methode
// greeting so, dass sie folgenden Aufrufbeispielen genügt:
// 
// greeting("Anton") --> "Hallo, Anton!"
// greeting("Barbara") --> "Hallo, Barbara!"
// greeting("Christoph") --> "Hallo, Christoph!"

import java.util.Scanner;

public class Greeting {

	// ----- diese Methode verändern -----
	public static String greeting(String name) {
		String greeting = "Hallo, "+name+"!";

		return greeting;
	}

	private static String getName() {
		System.out.print("Name: ");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();

		return name;
	}

	public static void main(String[] args) {
		String name = getName();
		System.out.println(greeting(name));
	}

}
