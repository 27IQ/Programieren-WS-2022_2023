import java.util.Arrays;

public class PrimeNumbers
{
	//Das Array, in dem alle Primzahlen gespeichert werden.
	private int[] primeNumbers;
	
	//Im Konstruktor werden n Primzahlen gefunden und gespeichert.
	public PrimeNumbers(int n)
	{
		primeNumbers = new int[n];
		primeNumbers[0] = 2;
		int index = 1;
		int zahl = 3;
		boolean prim = true;
		while(index < n)
		{
			prim = true;
			for(int i = 2; i < zahl; i++)
			{
				if(zahl % i == 0)
				{
					prim = false;
				}
			}
			if(prim == true)
			{
				primeNumbers[index] = zahl;
				index++;
			}
			zahl++;
		}
	}
	
	//Gibt die indexte Primzahl zurueck
	public int getPrimeNumber(int index)
	{
		return primeNumbers[index];
	}
	
	//Stellt alle gefundenen Primzahlen als String dar, damit man diese ausgeben kann.
	public String toString()
	{
		return Arrays.toString(primeNumbers);
	}
}
