public class ListsMedium {
	
	// Fuehre diese main-Methode aus, um die Methoden deiner List Klasse zu ueberpruefen.
	public static void main (String[] args) {
	List list = new List();
	
	System.out.println("---------- Erstellen der Liste ----------");
	System.out.println(String.format("Neue Liste mit %d Elementen:", list.getSize()));
	System.out.println(list.toString());
	System.out.println("");
	
	Element element1 = new Element(27 ,"Stefan");
	Element element2 = new Element(21 , "Anna");
	Element element3 = new Element(18 , "Paul");
	Element element4 = new Element(31 , "Max");
	Element element5 = new Element(20 , "Lisa");
	Element element6 = new Element(25 , "Maxim");
	Element element7 = new Element(23 , "Marie");
	Element element8 = new Element(29 , "Isabelle");
	Element element9 = new Element(32 , "Valentin");
	Element element10 = new Element(23 , "Sabine");
	
	list.addElement(element1,1);
	list.addElement(element2,2);
	list.addElement(element3,3);
	list.addElement(element4,4);
	list.addElement(element5,5);
	list.addElement(element6,6);
	list.addElement(element7,7);
	list.addElement(element8,8);
	list.addElement(element9,9);
	list.addElement(element10,10);
	
	System.out.println("---------- Einfuegen der Elemente in die Liste ----------");
	System.out.println(String.format("Die Liste hat nun %d Elemente:", list.getSize()));
	System.out.println(list.toString());
	System.out.println("");
	
	Element element42 = new Element(42 , "Peter");
	list.addElement(element42,10);
	
	System.out.println("---------- Einfuegen im Index ----------");
	System.out.println(String.format("Die Liste hat nun %d Elemente:", list.getSize()));
	System.out.println(list.toString());
	System.out.println("");
	
	Element elementSearch = element4;
	int result = list.getPosition(elementSearch);
	
	System.out.println("---------- Suche nach Max ----------");
	System.out.println(String.format("Max steht an %d. Stelle", result));
	System.out.println(list.toString());
	System.out.println("");
	
	String name = list.getName(8);
	
	System.out.println("---------- Suche Namen ----------");
	System.out.println(String.format("An 8. Stelle steht: " + name));
	System.out.println(list.toString());
	System.out.println("");

	list.deleteElement();
	
	System.out.println("---------- Loeschen des letzten Elementes ----------");
	System.out.println(String.format("Die Liste hat nun %d Elemente:", list.getSize()));
	System.out.println(list.toString());

	list.deleteElement();
	list.deleteElement();
	list.deleteElement();
	list.deleteElement();
	list.deleteElement();
	list.deleteElement();
	list.deleteElement();

	System.out.println(list.getPosition(element1));
	System.out.println(list.getPosition(element2));
	System.out.println(list.getPosition(element3));
	System.out.println(list.getPosition(element4));
	/*System.out.println(list.getPosition(element5));
	System.out.println(list.getPosition(element6));
	System.out.println(list.getPosition(element7));
	System.out.println(list.getPosition(element8));
	System.out.println(list.getPosition(element9));
	System.out.println(list.getPosition(element42));
	System.out.println(list.getPosition(element10));*/
	}
}