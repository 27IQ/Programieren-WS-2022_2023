public class Text {

    public static String[] zahlen={"null","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun"};

    public static String digitToString(int z){
        String finalString="";
        if(z<0){
            finalString="minus-"+finalString;
            z*=-1;
        }

        String zahl=Integer.toString(z);

        for(int i=0;i<zahl.length();i++){
            finalString+=zahlen[Integer.parseInt(""+zahl.charAt(i))];
            if(i<zahl.length()-1){
                finalString+="-";
            }
        }

        return finalString;
    }

    public static String digitToStringV2(int z){
        String finalString="";
        if(z<0){
            finalString="minus-"+finalString;
            z*=-1;
        }

        int length=0,current=1;

        while(z/current>0){
            current*=10;
            length+=1;
        }
        
        current/=10;

        for(int i=0;i<=length-1;i++){
            finalString+=zahlen[z/current];
            z-=current*(z/current);
            if(i<length-1){
                finalString+="-";
            }
        }

        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(digitToStringV2(-90));
    }
}
