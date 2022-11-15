package Übungsblatt_5;

public class Aufgabe3 {
    
    public static void main(String[] args) {
        Studiengang BWL=new Studiengang("BWL");
        BWL.setProgammieren(true);

        Studiengang AI=new Studiengang("AI");
        AI.setProgammieren(true);

        Studiengang Lehramt=new Studiengang("Lehramt");
        Lehramt.setRegelstudienzeit(8);
        Lehramt.setProgammieren(true);

        Studiengang Biologie=new Studiengang("Biologie");

        Studiengang Chemie=new Studiengang("Chemie");

        Studiengang Mechanik=new Studiengang("Mechanik");
        Mechanik.setRegelstudienzeit(5);

        Studiengang Elektrotechnik=new Studiengang("Elektrotechnik");

        Student[] s={new Student("jeff1"),new Student("bob2"),new Student("soos3"),new Student("helikopterhelikopter4"),new Student("parakopterparaopter5"),new Student("foof6"),new Student("schwellek7")};

        s[0].setStudiengang(BWL);
        s[1].setStudiengang(AI);
        s[2].setStudiengang(Lehramt);
        s[3].setStudiengang(Biologie);
        s[4].setStudiengang(Chemie);
        s[5].setStudiengang(Mechanik);
        s[6].setStudiengang(Elektrotechnik);

        durchsucheStudenten(s);
        belegtProgrammieren(s);
    }

    public static void durchsucheStudenten(Student[] s) {
        for (Student student : s) {
            switch (student.getStudiengang().getName()) {
                case "BWL":
                    System.out.println(student.getName()+": Dieser Student studiert BWL");
                    break;
                case "AI":
                    System.out.println(student.getName()+": Dieser Student studiert AI");
                    break;
                case "Lehramt":
                    System.out.println(student.getName()+": Dieser Student studiert Lehramt");
                    break;
                case "Biologie":
                    
                    break;
                case "Chemie":
                    
                    break;
                case "Mechanik":
                    
                    break;
                case "Elektrotechnik":
                    
                    break;
            }
        }
        
    }

    public static void belegtProgrammieren(Student[] s){
        int counter =0;
        for (Student student : s) {
            if(student.getStudiengang().getName()=="BWL"||student.getStudiengang().getName()=="AI"||student.getStudiengang().getName()=="Lehramt")
            counter++;
        }

        System.out.println(counter+" Studenten belegen Progammieren");
        System.out.println(s.length-counter+" Studenten belegen KEIN Progammieren");
    }
}
