public class DatentypenBsp {

    public static void Beispiele(){
        String a="penis";
        char c='h';

        System.out.println(a.charAt(2)); // dritter index: n

        System.out.println(a+=c); //fügt char zu String hinzu: penish 

        System.out.println(a+Integer.toString(10)); //convert int to String: penish10

        System.out.println((a+Integer.toString(10)).substring(6)); // vorderer teil wird wegeschnitten: 10

        System.out.println((Integer.parseInt((a+Integer.toString(10)).substring(6)))+1); // 10 zurückconvertiert  zu int und +1: 11


    }



    public static void main(String[] args) {
        //Beispiele();

        /*int i=1;
        System.out.println(i++);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(--i);*/




    }
}
