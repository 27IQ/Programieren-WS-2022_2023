package Übungsblatt_3;

public class Aufgabe_1_6 {
    
    public static void main(String[] args) {
        char[][] j = {{'a','b','c','d'},{},{'e','f'}}; 
        j[1]= new char[3];

        for (char[] cs : j) {
            System.out.println(cs);
        }
    }
}
