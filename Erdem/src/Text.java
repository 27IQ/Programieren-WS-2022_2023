public class Text {

    public static String[] zahlen={"null","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun"};

    public static String digitToString(int z){
        String finalString="";
        if(z<0){
            finalString="minus-"+finalString;
            z*=-1;
        }

        String zahl=Integer.toString(z);

        String tmp="";
        if(tmp=="");    //vscode unassinged fehler unterdrückung

        for(int i=0;i<zahl.length();i++){
            finalString+=zahlen[Integer.parseInt(tmp=""+zahl.charAt(i))];
            if(i<zahl.length()-1){
                finalString+="-";
            }
        }

        return finalString;
    }


    public static void main(String[] args) {
        System.out.println(digitToString(-90));
    }
}
