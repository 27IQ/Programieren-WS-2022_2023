package Praktikum4;
public class Praktikum4 {
    
    public Fraction maximum( Fraction[] arr, int i ){
        if(0>i||i>=arr.length)
        return null;

        Fraction max=maximum(arr, i-1);

        if(max==null)
        return arr[i];

        if(!arr[i].isvalid())
        return max;

        if(max.isgreater(arr[i]))
            return max;

        return arr[i];
    }

    public Fraction lastPositive( Fraction[] arr, int i ){
        Fraction[] positives=PositiveArr(arr, i);

        if(positives.length-1==-1)
        return null;

        return positives[positives.length-1];
    }

    private Fraction[] PositiveArr( Fraction[] arr, int i ){
        if(0>i||i>=arr.length)
        return null;

        Fraction[] positives=PositiveArr(arr, i-1),returnvalues;
        int counter=0,length=0;

        if(arr[i].ispositive())
        counter++;

        if(positives!=null)
        length=positives.length;

        returnvalues=new Fraction[length+counter];

        for (int f=0;f<length-counter;f++) {
            returnvalues[f]=positives[f];  
        }

        if(counter==1)
        returnvalues[returnvalues.length-1]=arr[i];

        return returnvalues;
    }

    public Fraction firstPositive( Fraction[] arr, int i ){
        if(0>i||i>=arr.length)
        return null;

        Fraction Previous=firstPositive(arr, i-1);

        if(Previous!=null){

            if(Previous.ispositive())
            return Previous;

            return arr[i];

        }else{
            if(arr[i].ispositive())
            return arr[i];
        }

        return null;
    }

    public boolean isSorted( Fraction[] arr, int i ){
        if(0>=i||i>=arr.length)
        return false;

        boolean Previous=true;

        if(i!=1){
            Previous=isSorted(arr, i-1);
        }

        if(arr[i-1].isgreater(arr[i]))
        return false;

        return Previous;
    }

    public boolean contains( Fraction[] arr, int i, Fraction x ){
        if(0>i||i>=arr.length)
        return false;

        boolean Previous=contains(arr, i-1,x);
        
        if(arr[i].isEqual(x))
        Previous= true;
        
        return Previous;
    }

    public int countPositives( Fraction[] arr, int d, int t ){
        if(0>d||d>t||t>=arr.length)
        return 0;

        int counter=0;
        counter+=countPositives(arr, d, t-1);

        if(arr[t].ispositive())
        counter++;

        return counter;
    }

    public boolean contentCheck( Fraction[] arr1, Fraction[] arr2, int i ){
        if(0>i||i>=arr1.length||i>=arr2.length)
        return false;

        boolean isequal=true;

        if(i-1!=-1)
        isequal=contentCheck(arr1, arr2, i-1);

        if(!arr1[i].isEqual(arr2[i]))
        isequal=false;

        return isequal;
    }

    public boolean palindromCheck( Fraction[] arr, int i ){
        return palindromCheck(arr, i,0);
    }

    private boolean palindromCheck( Fraction[] arr, int i, int x){
        if(0>i||i>=arr.length)
        return false;

        boolean ispalindorme=true;

        if(x!=i)
        ispalindorme=palindromCheck(arr, i,x+1);

        if(!arr[0+x].isEqual(arr[i-x]))
        ispalindorme=false;

        return ispalindorme;
    }

    public int getIndex( Fraction[] arr, int i, Fraction x ){
        if(0>i||i>=arr.length)
        return -1;

        int index=getIndex(arr, i-1, x);

        if(index==-1&&arr[i].isEqual(x))
        return i;

        return index;
    }

    public static void main(String[] args) {
        Praktikum4 p=new Praktikum4();
        //p.maximumtest();
        //p.lastpositive();
        //p.firsstpositive();
        //p.sortedtest();
        //p.containstest();
        //p.countpositivestest();
        //p.isequaltest();
        //p.palindromChecktest();
        p.getIndextest();
    }

    private void maximumtest() {
        Fraction[] test={
            new Fraction(1, 2),
            new Fraction(3, 3),
            new Fraction(6, 8),
            new Fraction(1, 5),
            new Fraction(16, 24)
        };

        System.out.println(maximum(test, 3));
        System.out.println(maximum(test, 2));
    }

    private void lastpositive(){
        Fraction[] test={
            new Fraction(1, 2),
            new Fraction(-3, 3),
            new Fraction(6, 8),
            new Fraction(-1, 5),
            new Fraction(16, 24)
        };
        System.out.println(lastPositive(test, 3));

        Fraction[] test1={
            new Fraction(-1, 2),
            new Fraction(-3, 3),
            new Fraction(-6, 8),
            new Fraction(-1, 5),
            new Fraction(-16, 24)
        };
        System.out.println(lastPositive(test1, 3));

    }

    private void firsstpositive(){
        Fraction[] test1={
            new Fraction(-1, 2),
            new Fraction(-3, 3),
            new Fraction(6, 8),
            new Fraction(1, 5),
            new Fraction(-16, 24)
        };
        System.out.println(firstPositive(test1, 3));
    }

    private void sortedtest(){
        Fraction[] test1={
            new Fraction(-1, 2),
            new Fraction(-3, 3),
            new Fraction(6, 8),
            new Fraction(1, 5),
            new Fraction(-16, 24)
        };

        System.out.println(isSorted(test1, 4));

        Fraction[] test={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(6, 8),
            new Fraction(-16, 24)
        };

        System.out.println(isSorted(test, 5));
        System.out.println(isSorted(test, 4));
    }

    private void containstest(){
        Fraction[] test={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(6, 8),
            new Fraction(-16, 24)
        };

        Fraction[] test1={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(6, 8),
        };

        System.out.println(contains(test, 3, new Fraction(-16, 24)));
        System.out.println(contains(test, 4, new Fraction(-16, 24)));
        System.out.println(contains(test1, 3, new Fraction(-16, 24)));

    }

    private void countpositivestest(){
        Fraction[] test={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(7, 5),
            new Fraction(6, 8),
            new Fraction(-16, 24),
            new Fraction(16, 24)
        };

        System.out.println(countPositives(test, 1, 4));
    }

    private void isequaltest(){
        Fraction[] test={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(6, 8),
            new Fraction(-16, 24)
        };

        Fraction[] test1={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(6, 8),
            new Fraction(-16, 24)
        };

        Fraction[] test2={
            new Fraction(-3, 2),
            new Fraction(-1, 2),
            new Fraction(1, 5),
            new Fraction(-16, 24)
        };

        System.out.println(contentCheck(test, test2, 2));
        System.out.println(contentCheck(test1, test2, 0));
        System.out.println(contentCheck(test1, test2, 4));
        System.out.println(contentCheck(test1, test2, 3));
    }

    private void palindromChecktest(){
        Fraction[]test={
            new Fraction(1,4),
            new Fraction(3,6),
            new Fraction(5,7),
            new Fraction(5,7),
            new Fraction(3,6),
            new Fraction(1,4),
            new Fraction(5,7),
        };
        Fraction[]test2={
            new Fraction(1,4),
            new Fraction(3,6),
            new Fraction(5,7),
            new Fraction(3,6),
            new Fraction(1,4),
            new Fraction(5,7),
            new Fraction(5,7),
        };

        Fraction[]test3={
            new Fraction(1,4),
            new Fraction(3,6),
            new Fraction(5,7),
            new Fraction(1,4),
            new Fraction(3,6),
            new Fraction(1,4),
        };

        System.out.println(palindromCheck(test, 5));
        System.out.println(palindromCheck(test2, 4));
        System.out.println(palindromCheck(test3, 5));
    }

    private void getIndextest(){
        Fraction[]test={
            new Fraction(1,7),
            new Fraction(6,7),
            new Fraction(4,3),
            new Fraction(4,3),
            new Fraction(4,3),
        };

        System.out.println(getIndex(test, 3,new Fraction(4,3)));
        System.out.println(getIndex(test, 4,new Fraction(6,7)));
        System.out.println(getIndex(test, 4,new Fraction(4,3)));
    }


}
