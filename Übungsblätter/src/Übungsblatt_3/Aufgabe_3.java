package Übungsblatt_3;

public class Aufgabe_3 {
    
    public static int[][] filterArray(int[][] array, int filter){
        int offset;
        int[] lengths=new int[array.length];

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

        int[][] filteredArray=new int[lengths.length][];

        for(int i=0;i<lengths.length;i++){
            filteredArray[i]=new int[lengths[i]];
        }
        
        for(int i=0;i<array.length;i++){
            offset=0;
            for(int a=0;a<array[i].length;a++){
                if(array[i][a]!=filter){
                    try{
                        filteredArray[i][a-offset]=array[i][a];
                    }catch(ArrayIndexOutOfBoundsException e){
                        offset++;
                        filteredArray[i][a-offset]=array[i][a];  
                    }
                }else{
                    offset++;
                }
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

        int[][] test2={{19,9,3,0,13},{6,7,9,4,5}};
        erg=filterArray(test2, 9);
        for (int[] is : erg) {
            for(int fo :is) {
                System.out.println(fo);
            }
            System.out.println("----------");
        }
        
    }
}
