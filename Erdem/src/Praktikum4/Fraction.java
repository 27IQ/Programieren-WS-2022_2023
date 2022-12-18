package Praktikum4;

public class Fraction {
    int nenner,zaehler;

    public Fraction(int zaehler,int nenner){
        this.nenner=nenner;
        this.zaehler=zaehler;
    }

    public int getNenner() {
        return this.nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZaehler() {
        return this.zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    @Override
    public String toString(){
        return("("+Integer.toString(this.zaehler)+"/"+Integer.toString(this.nenner)+")");
    }

    public boolean isvalid(){
        return nenner!=0;
    }

    public boolean isgreater(Fraction f){
        return ((zaehler/nenner)>(f.getZaehler()/(f.getNenner())));
    }

    public boolean islesser(Fraction f){
        return ((zaehler/nenner)<(f.getZaehler()/(f.getNenner())));
    }

    public boolean ispositive(){
        return zaehler>=0&&nenner>0;
    }

    public boolean isEqual(Fraction f){
        return nenner==f.getNenner()&&zaehler==f.getZaehler();
    }
}
