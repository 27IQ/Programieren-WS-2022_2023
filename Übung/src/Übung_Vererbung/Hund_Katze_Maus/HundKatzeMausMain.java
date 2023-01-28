package Übung_Vererbung.Hund_Katze_Maus;
public class HundKatzeMausMain
{
	/*
	 * Die main Methode fuer diese Aufgabe.
	 * Hier kannst du natuerlich auch eigene Testfaelle schreiben.
	 * Wenn du die Aufgabe richtig geloest hast, sollten hier keine
	 * Syntaxfehler mehr auftreten.
	 */
	public static void main(String[] args)
	{
		//Dog wird getestet
		System.out.println("Die Klasse Dog wird getestet:");
		Animal animal = new Dog();
		animal.getHungry();
		animal.getHungry();
		System.out.println(animal.hunger);
		Food food = new Food(10, "Dogfood");
		animal.eat(food);
		System.out.println(animal.hunger);
		food = new Food(10, "Cheese");
		animal.eat(food);
		System.out.println(animal.hunger+"\n");
		
		//Cat wird getestet
		System.out.println("Die Klasse Cat wird getestet:");
		Cat cat = new Cat();
		Mouse mouse = new Mouse();
		mouse.weight = 10;
		cat.getHungry();
		System.out.println(cat.hunger);
		cat.eat(mouse);
		System.out.println(cat.hunger);
		food = new Food(2, "Catfood");
		cat.eat(food);
		System.out.println(cat.hunger);
		food = new Food(10, "Dogfood");
		cat.eat(food);
		System.out.println(cat.hunger+"\n");
		
		//Mouse wird getestet
		System.out.println("Die Klasse Mouse wird getestet:");
		animal = new Mouse();
		animal.getHungry();
		animal.getHungry();
		System.out.println(animal.hunger);
		food = new Food(5, "Cheese");
		animal.eat(food);
		System.out.println(animal.hunger);
		food = new Food(10, "Peanuts");
		animal.eat(food);
		System.out.println(animal.hunger);
	}
}