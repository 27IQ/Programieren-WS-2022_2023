public class chars {
    public static void main(String[] args) {

        char character='a';
        int charPosition=character - 'a';  //Abstanz zu 'a'
        System.out.println(charPosition);   
        int newCharPosition = (charPosition + 3)% 26;   //Caeser 3 Verschiebungen 
        System.out.println(newCharPosition);

        //System.out.println(3%26);
        //System.out.println(27%26);
    }
}
