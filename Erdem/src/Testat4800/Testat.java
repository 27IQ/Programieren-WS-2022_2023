package Testat4800;

public class Testat {
    public static Fraction apply( Fraction[] arr, Fraction f, int i ){
        if(0>i||i>=arr.length)
        return new Fraction(-2,1);

        Fraction sum=new Fraction(0,1);

        if(i-1!=-1)
        sum=apply(arr, f, i-1);

        String[] frac =arr[i].toString().split(" / "); 
        double value =Double.parseDouble(frac[0])/Double.parseDouble(frac[1]);

        String[] frac1 =f.toString().split(" / "); 
        double value1 =Double.parseDouble(frac1[0])/Double.parseDouble(frac1[1]);
        
        if(value>value1){
            sum=sum.add(arr[i]);
        }

        return sum;
    }   
}
