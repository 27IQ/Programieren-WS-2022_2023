package Übung_Vererbung.Hund_Katze_Maus;
/*
 * Diese Klasse repraesentiert das Futter fuer alle Tiere.
 */
public class Food
{
	//Die Menge des Futters.
	private int volume;
	//Der Typ des Futters.
	private String typ;
	
	//Parameterloser Konstruktor
	//Werte fuer menge und typ muessen spaeter durch
	//setMenge bzw. setTyp gesetzt werden.
	public Food()
	{
		
	}
	
	//Konstruktor mit Parametern
	//Legt Werte fuer menge und typ sofort fest
	public Food(int volume, String typ)
	{
		this.volume = volume;
		this.typ = typ;
	}
	
	//-----getter und setter Methoden-----
	public int getVolume()
	{
		return volume;
	}
	
	public void setVolume(int menge)
	{
		this.volume = menge;
	}
	
	public String getTyp()
	{
		return typ;
	}
	
	public void setTyp(String typ)
	{
		this.typ = typ;
	}
}