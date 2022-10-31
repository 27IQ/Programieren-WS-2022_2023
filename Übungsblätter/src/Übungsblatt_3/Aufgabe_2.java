package Übungsblatt_3;

public class Aufgabe_2 {

    public static void printArrayWithFor(String[][] a){
        for(int i=0; i<a.length;i++){
            for(int b=0;b<a[i].length;b++){
                System.out.println(a[i][b]);
            }
        }
    }

    public static void printArrayWithForEach(String[][] a){
        for(String[] s:a){
            for (String p : s) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        String i[][] = new String[2][];
        i[0] = new String[3];
        i[0][0] = "ErstesInneresArray,Indexposition0";
        i[0][1] = "ErstesInneresArray,Indexposition1";
        i[0][2] = "ErstesInneresArray,Indexposition2";
        String[] zweitesInneresArray ={"ZweitesInneresArray, Indexposition0","ZweitesInneresArray, Indexposition1"};
        i[1] = zweitesInneresArray;
        printArrayWithFor(i);
        System.out.println("--------------------");
        printArrayWithForEach(i);
    }
}
