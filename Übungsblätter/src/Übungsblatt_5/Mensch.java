package Übungsblatt_5;

public class Mensch {
    String name;
    int alter;
    Mensch Mutter,Vater;

    Mensch(String name){
        this.name = name;
    }

    public void nenneDeinenNamen(){
        System.out.println(name);
    }

    public void nenneVaterUndMutterName(){
        if(Mutter!=null)
        System.out.println("Mutter: "+this.Mutter.getName());
        
        if(Vater!=null)
        System.out.println("Vater: "+this.Vater.getName());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setVater(Mensch Vater){
        this.Vater=Vater;
    }

    public Mensch getVater(){
        return this.Vater;
    }

    public void setMutter(Mensch Mutter){
        this.Mutter=Mutter;
    }

    public Mensch getMutter(){
        return this.Mutter;
    }



    public static void main(String[] args) {
        Mensch j=new Mensch("jeff"),v=new Mensch("Vater"),m=new Mensch("Mutter");
        j.nenneDeinenNamen();
        j.nenneVaterUndMutterName();
        j.setVater(v);
        j.setMutter(m);
        j.nenneVaterUndMutterName();

        v=null;
        m=null;
    }

}
