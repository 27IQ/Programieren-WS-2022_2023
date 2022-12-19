package Tetstat41900;

public class Testat {
    public static Fraction apply( Fraction[] arr, Fraction f, int i ){
        if(0>i||i>=arr.length)
        return new Fraction(-1,1);

        Fraction counter =new Fraction();

        if(i-1!=-1)
        counter=apply(arr, f, i-1);

        String[] frac =arr[i].toString().split(" / "); 
        double value =Double.parseDouble(frac[0])/Double.parseDouble(frac[1]);

        String[] frac1 =(f.multiply(f)).toString().split(" / "); 
        double value1 =Double.parseDouble(frac1[0])/Double.parseDouble(frac1[1]);

        if(0<value&&value<value1){
            counter=counter.add(new Fraction(1,1));
        }

        return counter;
    }
}
