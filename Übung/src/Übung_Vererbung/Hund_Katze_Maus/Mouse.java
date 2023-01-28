package Übung_Vererbung.Hund_Katze_Maus;
//--------------------- Aufgabe 2 ---------------------
public class Mouse extends Animal
{

    @Override
    public void eat(Food food) {
        if(!food.getTyp().equals("Cheese")&&!food.getTyp().equals("Peanuts"))
        return;

        while(food.getVolume()>0&&hunger>0){
            hunger--;
            food.setVolume(food.getVolume()-1);
        } 
    }

    public void getHungry(){
        hunger+=5;
    }
	
}