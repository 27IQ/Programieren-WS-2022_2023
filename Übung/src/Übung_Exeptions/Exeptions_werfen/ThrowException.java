package Übung_Exeptions.Exeptions_werfen;
public class ThrowException
{
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public void causeError()
	{
		throw new MyException();
	}
	
	// Aufgabe 2
	public void causeError(String error)
	{
		throw new MyException(error);
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	// Hinweis: Wird eine Exception nicht gefangen wird das Programm abbrechen.
	public static void main(String[] args)
	{
		ThrowException kme = new ThrowException();
		try
		{
			kme.causeError();
			System.out.println("Sollte nicht ausgegeben werden.");
		}
		catch(MyException exc)
		{
			System.out.println("Hurra, super so.");
		}
		try
		{
			kme.causeError("Fehler passiert.");
			System.out.println("Kein Fehler passiert.");
		}
		catch(MyException e)
		{
			System.out.println("Fehler: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Falsche Exception wurde geworfen.");
		}
		kme.causeError("Sollte nicht passieren.");
	}
}