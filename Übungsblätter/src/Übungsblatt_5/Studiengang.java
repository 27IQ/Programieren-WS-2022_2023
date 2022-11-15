package Übungsblatt_5;

public class Studiengang {
    String name;
    int Regelstudienzeit=6;
    boolean progammieren=false;

    Studiengang(String name){
        this.name=name;
        this.Regelstudienzeit=Regelstudienzeit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegelstudienzeit() {
        return this.Regelstudienzeit;
    }

    public void setRegelstudienzeit(int Regelstudienzeit) {
        this.Regelstudienzeit = Regelstudienzeit;
    }

    public boolean getProgammieren() {
        return this.progammieren;
    }

    public void setProgammieren(boolean progammieren) {
        this.progammieren = progammieren;
    }
 
}
