package Übung_Vererbung.Hund_Katze_Maus;
/*
 * Diese Klasse stellt die Oberklasse fuer Hund, Katze und Maus dar.
 * Dazu hat Tier ein paar Methoden, die alle Tiere gemeinsam haben.
 * Wie diese Methoden ueberschrieben werden sollen, steht dann in
 * der entsprechenden Klasse.
 */
public abstract class Animal
{
	//Zahl, die den Hunger eines Tieres symbolisiert.
	public int hunger;
	//Das Gewicht des Tieres.
	public int weight;
	
	//Abstrakt, da jedes Tier anders frisst.
	public abstract void eat(Food food);
	
	//Jedes Tier kann mit der Zeit hungrig werden.
	public void getHungry()
	{
		hunger+=10;
	}
	
	//---setter und getter Methoden fuer gewicht---
	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}