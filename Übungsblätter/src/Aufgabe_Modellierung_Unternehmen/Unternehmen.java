package Aufgabe_Modellierung_Unternehmen;

import java.util.ArrayList;

public class Unternehmen {
    String name;
    int gründungsjahr,steuernummer;
    Abteilung[] abteilungen;
    ArrayList<Mitarbeiter> l=new ArrayList<Mitarbeiter>();

    public Unternehmen(String name,int gründungsjahr,int steuernummer){
        this.name=name;
        this.gründungsjahr=gründungsjahr;
        this.steuernummer=steuernummer;
        abteilungen=new Abteilung[5];
    }

    public Abteilung[] getAbteilungen() {
        return this.abteilungen;
    }

    public void setAbteilungen(Abteilung[] abteilungen) {
        this.abteilungen = abteilungen;
    }

    public void addMitarbeiter(Mitarbeiter m){
        l.add(m);
    }

    public void removeMitarbeiter(Mitarbeiter m){
        l.remove(m);
    }



}
