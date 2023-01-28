package Übung_Exeptions.Datenbank_Exeptions;

import java.util.Scanner;
import java.util.HashMap;

public class Datenbank {

    private String userName;
    private String givenPassword;
    private String key;
    private String value;

    private Scanner sc;
    
    private static final String passwortError = "Falsches Passwort!";
    private static final String nutzerError = "Der Benutzername darf nur aus Buchstaben und Zahlen bestehen!";
    private static final String keyError = "Der Key darf nur aus Buchstaben und Zahlen bestehen!";
    private static final String valueError = "Der Wert ist keine ganze Zahl!";

    private HashMap<String, Integer> lager;
    private HashMap<String, Integer> kaufhaus;

    private String password = "passwort123";

    public Datenbank(HashMap<String, Integer> lager, HashMap<String, Integer> kaufhaus) {
        this.lager = lager;
        this.kaufhaus = kaufhaus;
    }
    
    public HashMap<String, Integer> getLager() {
    	return lager;
    }
    
    public HashMap<String, Integer> getKaufhaus() {
    	return kaufhaus;
    }

    //Aufgabe 1

    public String nimmInput() {
        sc = new Scanner(System.in);
        String s=sc.nextLine();
        return s;
    }

    //Aufgabe 2
    public void pruefeInput() throws InputError {
    	pruefeName();
        pruefePassword();
        pruefeKey();
        pruefeValue();
    }

    public void pruefeName() throws InputError {
        if(!userName.matches("[a-zA-Z0-9]+"))
        throw new InputError(nutzerError);
    }

    public void pruefePassword() throws InputError{
        if(!givenPassword.matches(password))
        throw new InputError(passwortError);
    }

    public void pruefeKey() throws InputError {
        if(!key.matches("[a-zA-Z0-9]+"))
        throw new InputError(keyError);
    }

    public void pruefeValue() throws InputError {
        if(!value.matches("[0-9]+"))
        throw new InputError(valueError);
    }

    //Aufgabe 3
    public void ablauf() {
        try {
            bewegeValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void bewegeValue() throws InputError, LagerError{
        if(!lager.containsKey(key))
        throw new InputError("Key wurde im Lager nicht gefunden!");
        
        if(Integer.parseInt(value)<0)
        throw new InputError("Ungueltiger Value!");

        if(Integer.parseInt(value)>lager.get(key))
        throw new LagerError("Zu niedriger Lagerbestand! "+lager.get(key));

        if(!kaufhaus.containsKey(key))
        kaufhaus.put(key, 0);

        int lagervalue=lager.get(key),kaufhausvalue=kaufhaus.get(key),intvalue=Integer.parseUnsignedInt(value);

        lager.replace(key, lagervalue-intvalue);
        kaufhaus.replace(key, kaufhausvalue+intvalue);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> lagerTest = new HashMap<String, Integer>();
        lagerTest.put("Brot", 10);
        lagerTest.put("Milch", 8);
        HashMap<String, Integer> kaufhausTest = new HashMap<String, Integer>();
        kaufhausTest.put("Milch", 3);

        Datenbank main = new Datenbank(lagerTest, kaufhausTest);

        System.out.println("Bitte geben Sie Benutzername, Passwort, Key, und Value an.");
        main.userName = main.nimmInput();
        main.givenPassword = main.nimmInput();
        main.key = main.nimmInput();
        main.value = main.nimmInput();
        try {
        	//main.pruefeInput();
        	main.ablauf();
        }
        catch(Exception e) {
        	System.out.println("Beim Pr�fen der Eingaben ist ein Fehler aufgetreten: " + e.getMessage() + "Bitte starten Sie das Programm erneut.");
        }
            
        System.out.println("Im Lager ist so viel Brot vorhanden: " + lagerTest.get("Brot"));
        System.out.println("Im Lager ist so viel Milch vorhanden: " + lagerTest.get("Milch"));
        if(kaufhausTest.containsKey("Brot")) {
            System.out.println("Im Kaufhaus ist so viel Brot vorhanden: " + kaufhausTest.get("Brot"));
        }
        else {
            System.out.println("Im Kaufhaus ist kein Brot vorhanden.");
        }
        System.out.println("Im Kaufhaus ist so viel Milch vorhanden: " + kaufhausTest.get("Milch"));
    }
}
