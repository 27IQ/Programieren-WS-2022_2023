package Übung_Interface.Elektronikgeräte;


//--------------------- Aufgabe 1 ---------------------
public class PC extends Computer implements Display
{

    @Override
    public String showThis(String string) {
        return "Dieser Computer zeigt an: "+string;
    }

    @Override
    public String showThat() {
        return "Dies ist ein Computer";
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int divide(int number1, int number2) {
        return number1/number2;
    }

    @Override
    public int add(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1-number2;
    }
	
}