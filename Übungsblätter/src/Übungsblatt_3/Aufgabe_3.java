package Übungsblatt_3;

public class Aufgabe_3 {
    
    public static int[][] filterArray(int[][] array, int filter){
        int offset=0,offset2=0,empty=0;
        int[] lengths=new int[array.length];
        boolean haswritten;

        for(int i=0;i<array.length;i++){
            lengths[i]=array[i].length;
        }

        for(int i=0;i<array.length;i++){
            for(int a=0;a<array[i].length;a++){
                if(array[i][a]==filter){
                    lengths[i]--;
                }
            }
        }

        for(int i=0;i<lengths.length;i++){
            if(lengths[i]==0){
                empty++;
            }
        }

        int[] lengths2=new int[array.length-empty];

        for(int i=0;i<lengths.length;i++){
            if(lengths[i]!=0){
                lengths2[i-offset]=lengths[i];
            }else{
                offset++;
            }
        }

        int[][] filteredArray=new int[lengths2.length][];

        for(int i=0;i<lengths2.length;i++){
            filteredArray[i]=new int[lengths2[i]];
        }

        for(int i=0;i<array.length;i++){
            offset=0;
            haswritten=false;
            for(int a=0;a<array[i].length;a++){
                if(array[i][a]!=filter){
                    filteredArray[i-offset2][a-offset]=array[i][a]; 
                    haswritten=true;
                }else{
                    offset++;
                }
            }
            if(haswritten==false){
                offset2++;
            }
        }
        return filteredArray;
    }

    public static void main(String[] args) {
        int[][] test={{1,9,3,0},{6,7,9,4,5}};
        int[][] erg=filterArray(test, 6);
        for (int[] is : erg) {
            for(int fo :is) {
                System.out.println(fo);
            }
            System.out.println("----------");
        }
        System.out.println("%%%%%%%%%%%");
        int[][] test2={{19,9,3,0,13},{9,9,9},{1,6,14,9}};
        erg=filterArray(test2, 9);
        for (int[] is : erg) {
            for(int fo :is) {
                System.out.println(fo);
            }
            System.out.println("----------");
        }
        
    }
}
