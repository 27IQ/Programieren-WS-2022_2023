package Aufgabe_Modellierung_Unternehmen;

import java.util.ArrayList;

public class UnternehmenManager {
    public ArrayList<Unternehmen> l=new ArrayList<Unternehmen>();

    public void addUnternehmen(Unternehmen u){
        l.add(u);
    }

    public void removeUnternehmen(Unternehmen u){
        l.remove(u);
    }
}
