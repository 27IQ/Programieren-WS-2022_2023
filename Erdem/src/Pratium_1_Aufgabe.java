public class Pratium_1_Aufgabe {
    //Aufgaben zum Einstieg in das Programmierung mit Java

    //1 - Summe
    public static int  interval( int a, int b ){
        return 0;
    }

    //2 - Quersumme
    public static int digitSum( int x ){
        return 0;
    }

    //3 - Ziffern/Zahlen/Quersumme als Text
    public static String digitToString(int z1){
        return "";
    }

    public static String intToString( int z ){
        return "";
    }

    public static String digitSumToString(int z){
        return "";
    }

    //4 - Harshad-Zahlen
    public static boolean isHarshad( int z ){
        return true;
    }

    public static void computeHarshads( int n ){

    }

    //5 - Eulersche Zahl
    public static double computeEuler( int n ){
        return 0;
    }

    //Aufgaben zur Vorbereitung auf Testat 1

    //1 - Werte zählen
    public static int countNegatives( int[] arr ){
        return 0;
    }

    //2 - Werte aufsummieren
    public static int sumUpNegatives( int[] arr ){
        return 0;
    }

    //3 - Bestimmen des Maximums in einem Feld
    public static int maximum( int[] arr ){
        return 0;
    }

    //4 - Bestimmen der Häufigkeit des Maximums in einem Feld
    public static int countMaximum( int[] arr ){
        return 0;
    }

    //5 - Sortierung prüfen
    public static boolean isSorted( int[] arr ){
        return false;
    }

    //6 - Palindrome erkennen
    public static boolean checkArray( int[] arr ){
        return false;
    }

    //7 - Erhöhen der Inhalte eines Feldes
    public static int[] increaseArray( int[] arr, int z ){
        return arr;
    }

    //8 - Bedingtes Verdoppeln der Inhalte eines Feldes
    public static int[] doubleIfContainsPositive( int[] arr ){
        return arr;
    }

    //9 - Erzeugen eines Textes
    public static String toString(int[] zahlen){
        return "";
    }

    //10 - Erzeugen eines Feldes mit drei Elementen
    public static int[] copyStartingValues( int[] arr ){
        return arr;
    }

    //11 - Erzeugen eines Feldes mit ausgesuchten Inhalten
    public static int[] selectNegatives( int[] arr ){
        return arr;
    }

    //12 - Erzeugen eines Feldes mit invertiertem Inhalt
    public static int[] copyAndInvert( int[] arr ){
        return arr;
    }

    //13 - Zusammenführen von Feldern
    public static int[] addArrays( int[] arr1, int[] arr2 ){
        return arr1;
    }

    //14 - Zählen von Folgen
    public static int countSequences( int[] arr ){
        return 0;
    }

    //15 - Analyse eines Felds
    public static boolean twoTimes( int[] arr ){
        return false;
    }

    public static void main(String[] args) {

        System.out.println("\n------ 1 - Summe ------");
        System.out.println("should be 56 ---> "+interval(5, 11));
        System.out.println("should be 56 ---> "+interval(5,11));
        System.out.println("should be 5 ---> "+interval(3,-1));
        System.out.println("should be 4 ---> "+interval(4,4));
        System.out.println("should be 0 ---> "+interval(0,0));

        System.out.println("\n------ 2 - Quersumme ------");
        System.out.println("should be 12 ---> "+digitSum(345));

        System.out.println("\n------ 3 - Ziffern/Zahlen/Quersumme als Text ------");
        System.out.println("should be sieben ---> "+digitToString(7));
        System.out.println("should be minus-drei-vier ---> "+intToString(-34));
        System.out.println("should be eins-zwei ---> "+digitSumToString(345));

        System.out.println("\n------ 4 - Harshad-Zahlen ------");
        System.out.println("should be true ---> "+isHarshad(777));
        System.out.println("should be 1,2,3,45,6,7,8,9,10,12,18,20");
        computeHarshads(20);
        

        System.out.println("\n------ 5 - Eulersche Zah ------");
        System.out.println("should be 2.7180555555555554 ---> "+computeEuler(7));

        System.out.println("\n------ 1 - Werte zählen ------");
        int[] element14={1,-7,1,5,-1,2,4};
        System.out.println("should be 2 ---> "+countNegatives(element14));

        System.out.println("\n------ 2 - Werte aufsummieren ------");
        System.out.println("should be -8 ---> "+sumUpNegatives(element14));

        System.out.println("\n------ 3 - Bestimmen des Maximums in einem Feld ------");
        int[] element15={1,-7,1,5,-1,2,4,5};
        System.out.println("should be 5 ---> "+maximum(element15));

        System.out.println("\n------ 4 - Bestimmen der Häufigkeit des Maximums in einem Feld ------");
        System.out.println("should be 2 ---> "+countMaximum(element15));

        System.out.println("\n------ 5 - Sortierung prüfen ------");
        int[] element16={1,4,5,7,8};
        System.out.println("should be true ---> "+(isSorted(element16)));
        int[] element17={1,4,5,7,7,8};
        System.out.println("should be true ---> "+(isSorted(element17)));
        int[] element18={1,4,5,3,7,8};
        System.out.println("should be false ---> "+(isSorted(element18)));

        System.out.println("\n------ 6 - Palindrome erkennen ------");
        int[] ispalindrome={12, 34, 78, 34, 12};
        int[] ispalindrome1={5, 17, 88, 88, 17, 5};
        int[] nopalindrome={5, 17, 88, 88, 5};

        System.out.println("should be true: "+checkArray(ispalindrome));
        System.out.println("should be true: "+checkArray(ispalindrome1));
        System.out.println("should be false: "+checkArray(nopalindrome));

        System.out.println("\n------ 7 - Erhöhen der Inhalte eines Feldes ------");
        int[] element13={80,7,1,56,11,72,43,37};
        System.out.println("should be 97,24,18,73,28,89,60,54 ---> "+toString(increaseArray(element13, 17)));

        System.out.println("\n------ 8 - Bedingtes Verdoppeln der Inhalte eines Feldes ------");
        int[] element11={1,-7,1,5,-1,2,4};
        System.out.println("should be 1,-14,2,10,-2,4,8 ---> "+toString(doubleIfContainsPositive(element11)));
        int[] element12={-1,-7,-1,-5,-1,-2,-4};
        System.out.println("should be -1,-7,-1,-5,-1,-2,-4 ---> "+toString(doubleIfContainsPositive(element12)));
        
        System.out.println("\n------ 9 - Erzeugen eines Textes ------");
        int[] element10={80,7,1,56,11,72,43,37};
        System.out.println("should be 80,7,1,56,11,72,43,37 ---> "+toString(element10));

        System.out.println("\n------ 10 - Erzeugen eines Feldes mit drei Elementen ------");
        System.out.println("should be 80,7,1 ---> "+toString(copyStartingValues(element10)));

        System.out.println("\n------ 11 - Erzeugen eines Feldes mit ausgesuchten Inhalten ------");
        int[] element={80,-7,1,56,-11,-72,0,37};
        System.out.println("should be -7,-11,-72 ---> "+toString(selectNegatives(element)));

        System.out.println("\n------ 12 - Erzeugen eines Feldes mit invertiertem Inhalt ------");
        int[] element2={80,-7,1,56,-11,-72,0,37};
        System.out.println("should be 37,0,-72,-11,56,1,-7,80 ---> "+toString(copyAndInvert(element2)));

        System.out.println("\n------ 13 - Zusammenführen von Feldern ------");
        int[] element3={80,-7,1,56},element4={-11,-72,0,37};
        System.out.println("should be 80,-7,1,56,-11,-72,0,37 ---> "+toString(addArrays(element3, element4)));

        System.out.println("\n------ 14 - Zählen von Folgen ------");
        int[] element5={80,7,1,0,11,72,0,0,37,61};
        System.out.println("should be 3 ---> "+countSequences(element5));

        System.out.println("\n------ 15 - Analyse eines Felds ------");
        int[] element6={2,3,4,3,7,7,4,1,2,1};
        int[] element7={2,2,8,8,5,5,3,3,9,9};
        int[] element8={2,3,2,3,5,5,1,2,1,2};
        int[] element9={2,3,3,5,5,4,1,2,1};
        System.out.println("should be true ---> "+twoTimes(element6));
        System.out.println("should be true ---> "+twoTimes(element7));
        System.out.println("should be false ---> "+twoTimes(element8));
        System.out.println("should be false ---> "+twoTimes(element9));


    }

    
}
