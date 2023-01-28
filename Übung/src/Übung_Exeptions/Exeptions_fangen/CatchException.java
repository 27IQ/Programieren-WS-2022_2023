package Übung_Exeptions.Exeptions_fangen;


public class CatchException
{
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufagbe 1
	public static int method1(ClassWithBuggyMethods obj)
	{
		try {
			return obj.getElement();
		} catch (Exception e) {
			return -1;
		}
	}
	
	// Aufgabe 2
	public static int method2(ClassWithBuggyMethods obj)
	{
		try {
			return obj.getLength();
		} catch (Exception e) {
			return -1;
		}
	}
	
	// Aufgabe 3
	public static String method3(ClassWithBuggyMethods obj)
	{
		try {
			obj.reallyRiskyMethod();
		}catch (NullPointerException e1){
			return "NullPointerException aufgetreten";
		}catch (IndexOutOfBoundsException e2){
			return "Das haette nicht passieren duerfen";
		}catch (ClassCastException e3){
			throw new NumberFormatException();
		}catch (RuntimeException e) {
			return e.getLocalizedMessage();
		}

		return "";
	}
	
	//=================================
	// Ende des zu bearbeitenden Codes
	//=================================	
}
