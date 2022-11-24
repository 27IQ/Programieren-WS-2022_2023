package Übungsblatt_6;

public class Aufgabe2 {
    public static int multiplyFromStartToEnd(int start, int end){
        if(start>end){
            return 1;
        }

        return start*=multiplyFromStartToEnd(start+1, end);
    }

    public static void main(String[] args) {
        System.out.println(multiplyFromStartToEnd(1,1 ));
        System.out.println(multiplyFromStartToEnd(0,1 ));
        System.out.println(multiplyFromStartToEnd(1,2 ));
        System.out.println(multiplyFromStartToEnd(3,8 ));
        System.out.println(multiplyFromStartToEnd(4,9 ));
    }
}
