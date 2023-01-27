package Übung_Interface.Elektronikgeräte;
/*
 * Jedes Geraet mit einem Display soll die beiden
 * Methoden showThis und showThat haben.
 */
public interface Display
{
	public String showThis(String string);
	public String showThat();
}