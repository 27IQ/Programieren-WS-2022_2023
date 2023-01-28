package Übung_Exeptions.Experimente_mit_Exceptions;
import java.util.Arrays;

public class ExceptionExperimente
{
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public static int convert(String number)
	{
		try {
			return Integer.parseUnsignedInt(number);
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
	// Aufgabe 2
	public static int convert(double number)
	{
		if(number%1==0){
			return (int)number;
		}else{				
			throw new UnsupportedOperationException();
		}	
	}
	
	// Aufgabe 3
	public static int[] add(int[] array1, int[] array2)
	{
		if(array1.length!=array2.length)
		throw new IllegalArgumentException();

		int[] sum=new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			sum[i]=array1[i]+array2[i];
		}

		return sum;
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	/*
	 * Die main Methode.
	 * Wie immer koennen Sie hier ihre Methoden testen.
	 * Natuerlich koennen Sie sich auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args)
	{
		try
		{
			System.out.println("42 = "   + ExceptionExperimente.convert("42"));   //"42" wird nach 42 umgewandelt.
			System.out.println("Hallo = "+ ExceptionExperimente.convert("Hallo"));//"Hallo" kann nicht umgewandelt werden, deswegen sollte -1 ausgegeben werden.
			System.out.println("42.0 = " + ExceptionExperimente.convert(42.0));   //42.0 wird zu 42 umgewandelt.
			System.out.println("42.5 = " + ExceptionExperimente.convert(42.5));   //42.5 hat Nachkommastellen, deswegen sollte hier eine Exception auftreten.
			System.out.println("[1, 2, 3] + [4, 5, 6] = [5, 7, 9]. Deine Methode gibt " + Arrays.toString(ExceptionExperimente.add(new int[]{1,2,3}, new int[]{4,5,6}))+" zurueck.");//Methode add sollte die beiden Arrays addieren. Arrays.toString(int[]) wandelt das Ergebnis in einen String um.
			System.out.println("[1, 2, 3] + [4, 5] geht nicht. Deine Methode gibt das hier zurueck: " + Arrays.toString(ExceptionExperimente.add(new int[]{1,2,3}, new int[]{4,5})));//Hier sollte eine Exception auftreten, da die beiden Arrays unterschiedlich gross sind.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}