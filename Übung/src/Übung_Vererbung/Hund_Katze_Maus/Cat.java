package Übung_Vererbung.Hund_Katze_Maus;
//--------------------- Aufgabe 3 ---------------------
public class Cat extends Animal
{
	public void eat(Mouse mouse)
	{
		hunger-=mouse.getWeight()/2;

		if(hunger<0)
		hunger=0;
	}

	@Override
	public void eat(Food food) {
		if(!food.getTyp().equals("Catfood"))
		return;

		while(food.getVolume()>0&&hunger>0){
			hunger--;
			food.setVolume(food.getVolume()-1);
		} 
	}	
}