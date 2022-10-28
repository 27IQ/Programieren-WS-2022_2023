public class Text {

    public static String[] zahlen={"null","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun"};

    public static String digitToString(int z){
        boolean negativ=false;
        String zahl=Integer.toString(z), finalString="";
        if(z<0){
            negativ=true;
            zahl=Integer.toString(z*(-1));
        }

        String tmp;

        for(int i=0;i<zahl.length();i++){
            finalString+=zahlen[Integer.parseInt(tmp=""+zahl.charAt(i))];
            if(i<zahl.length()-1){
                finalString+="-";
            }
        }

        if(negativ==true){
            finalString="minus-"+finalString;
        }

        return finalString;
    }


    public static void main(String[] args) {
        System.out.println(digitToString(-90));
    }
}
