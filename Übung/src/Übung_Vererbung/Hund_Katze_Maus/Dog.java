package Übung_Vererbung.Hund_Katze_Maus;
//--------------------- Aufgabe 1 ---------------------
public class Dog extends Animal
{

    @Override
    public void eat(Food food) {
        if(!food.getTyp().equals("Dogfood"))
        return;

        while(food.getVolume()>0&&hunger>0){
           hunger--;
           food.setVolume(food.getVolume()-1);
        }     
    }

}