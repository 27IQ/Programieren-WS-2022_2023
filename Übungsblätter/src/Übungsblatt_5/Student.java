package Übungsblatt_5;

public class Student {
    String name;
    Studiengang studiengang;
    
    Student(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public Studiengang getStudiengang() {
        return this.studiengang;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    public int getRegelstudienzeit(){
        return studiengang.getRegelstudienzeit();
    }
    
    public boolean modulProgrammierung(){
        if(studiengang!=null)
        return studiengang.getProgammieren();

        return false;
    }

}
