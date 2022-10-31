package Übungsblatt_2;

public class Schleife {

    public static void whileSchleife(){
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void dowhileSchleife(){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }

    public static void forSchleife(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void emptyforSchleife(){
        int i=0;
        for(;;){
            System.out.println(i);
            if(i==10){
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        //whileSchleife();
        //dowhileSchleife();
        //forSchleife();
        //emptyforSchleife();
    }
}
