package Übungsblatt_2;

public class Alterscheck {

    public static void alterscheck(String name, int alter){

        if(alter<18){
            System.out.println(name+" ist zu jung!");
        }else if (alter<=67){
            System.out.println(name+" kann angestellt werden!");
        }else{
            System.out.println(name+" ist zu alt!");
        }
    }

    public static boolean alterscheck( int alter){
        
        boolean angestellt=false;

        if (alter>=18&&alter<=67){
            angestellt=true;
        }

        return angestellt;
    }

    public static void main(String[] args) {
        System.out.println("Dies ist die Ausgabe für Teil a:");
        alterscheck("Arya", 17);
        alterscheck("Sansa", 18);
        alterscheck("John", 68);
        System.out.println("----------\nDies ist die Ausgabe für Teil b:");
        System.out.println("Tom:" + alterscheck(16));
        System.out.println("Jane:" + alterscheck(19));
        System.out.println("Michael:" + alterscheck(70));
        }
}
