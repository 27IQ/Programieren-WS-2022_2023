package Übungsblatt_1;

public class Happy {
    
    public static void main(String[] args) {
        String s="";
        for(int i=0;i<4;i++){
            System.out.println("Because I'm happy");
            switch (i) {
                case 0:
                    s=" feel like a room without a roof";
                break;
                case 1:
                    s="feel like happiness is the truth";
                break;
                case 2:
                    s="know what happiness is to you";
                break;
                case 3:
                    s=" feel like that's what you wanna do";
                break;
            }
            System.out.println("Clap along if you"+s);
        }
    }
}
