package Übung_Exeptions.Exeptions_werfen;
/*
 * Diese Klasse ist eine Exception, die in KlasseMitExceptions geworfen werden soll.
 * Damit eine eigene Exception geworfen werden kann, muss die entsprechende Klasse
 * von Exception oder einer Unterklasse davon erben.
 * In diesem Fall wird RuntimeException als Oberklasse verwendet.
 */
public class MyException extends RuntimeException
{
	/*
	 * Einfacher Konstruktor ohne Parameter
	 */
	public MyException()
	{
		super();
	}
	
	/*
	 * Konstruktor mit einem uebergebenen String.
	 * Dieser String stellt die Fehlermeldung dar.
	 */
	public MyException(String error)
	{
		super(error);
	}
}
