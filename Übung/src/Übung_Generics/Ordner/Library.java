package Ordner;
public class Library {

	public static void main(String[] args) {
		
		Folder <String> folder1 = new Folder <String>("ABCD");
		folder1.setValue("DCBA");
		System.out.println("Ihre Ausgabe:         "+ folder1.getValue());
		System.out.println("Erwartete Ausgabe:    DCBA");
		System.out.println("------------------------------------------------------------");
		System.out.println("Ihre Ausgabe:         "+folder1.getValue().length());
		System.out.println("Erwartete Ausgabe:    4");
		System.out.println("------------------------------------------------------------");
		
		
		Folder <Integer> folder2 = new Folder <Integer> (12);
		int result = folder2.getValue() + 10;
		System.out.println("Ihre Ausgabe:         "+result);
		System.out.println("Erwartete Ausgabe:    22");

	}

}
