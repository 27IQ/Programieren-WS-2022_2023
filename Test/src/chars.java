public class chars {
    public static void main(String[] args) {

        char character='a';
        int charPosition=character - 'a';  //Abstanz zu 'a'
        System.out.println(charPosition);   
        int newCharPosition = (charPosition + 3)% 26;   //Caeser 3 Verschiebungen 
        System.out.println(newCharPosition);


        int[][] a=new int[5][3];
        
        for (int[] is : a) {
            for (int is2: is) {
                
            }
        }

        //System.out.println(3%26);
        //System.out.println(27%26);
    }
}
