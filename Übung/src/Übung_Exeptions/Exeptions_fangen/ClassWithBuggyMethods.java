package Übung_Exeptions.Exeptions_fangen;
public class ClassWithBuggyMethods
{
	/*
	 * Die main Methode.
	 * Sie kann nach Belieben verandert werden.
	 * Die main Methode ist in dieser Klasse,
	 * weil array und index private sind, das heisst,
	 * man kann nur innerhalb von dieser Klasse auf die Variablen
	 * zugreifen.
	 */
	public static void main(String[] args)
	{
		try
		{
			ClassWithBuggyMethods klasse = new ClassWithBuggyMethods();
			klasse.array = new int[3];
			klasse.array[0] = 5;
			klasse.index = 0;
			System.out.println("Das sollte 5 sein: " + CatchException.method1(klasse));
			klasse.index = 3;
			System.out.println("Das sollte nicht gehen: " + CatchException.method1(klasse));
			System.out.println("Die Laenge des Arrays ist: " + CatchException.method2(klasse));
			klasse.array = null;
			System.out.println("Die Laenge eines Arrays, welches nicht vorhanden ist: " + CatchException.method2(klasse));
			klasse.index = 42;
			klasse.reallyRiskyMethod();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Ein Array mit Integer Werten
	private int[] array;
	//Ein Index fuer dieses Array
	private int index;
	
	/*
	 * Diese Methode sollte das Element an der Stelle index zurueckgeben.
	 */
	public int getElement()
	{
		return array[index];
	}
	
	/*
	 * Diese Methode gibt die Laenge (also die Anzahl der Elemente) des Arrays zurueck.
	 */
	public int getLength()
	{
		return array.length;
	}
	
	/*
	 * In dieser Methode tritt immer eine Exception auf.
	 * Fraglich ist nur welche.
	 */
	public void reallyRiskyMethod()
	{
		if(index == 42)
			throw new RuntimeException("Es ist ein ganz schlimmer Fehler aufgetreten.");
		else if(index == 27)
			throw new RuntimeException("Es ist ein nicht ganz so schlimmer Fehler aufgetreten.");
		else if(index > 9)
			throw new NullPointerException();
		else if(index < 0)
			throw new IndexOutOfBoundsException();
		else
			throw new ClassCastException();
	}
}