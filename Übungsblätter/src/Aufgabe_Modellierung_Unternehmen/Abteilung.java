package Aufgabe_Modellierung_Unternehmen;

import java.util.ArrayList;

public class Abteilung {
    int mitarbeiterzahl,max;
    String name,aktuellesprojekt;
    Abteilungstyp typ;
    ArrayList<Mitarbeiter> l=new ArrayList<Mitarbeiter>();

    public Abteilung(String name,Abteilungstyp typ,ArrayList<Mitarbeiter> l){
        this.name=name;
        this.typ=typ;
        this.l=l;
        max=50;
    }

    public Abteilung übertrageAbteilung(String name,Abteilungstyp typ){
        Abteilung a=new Abteilung(name, typ,l);
        return a;
    }

    public int getMitarbeiterzahl() {
        return this.mitarbeiterzahl;
    }

    public void setMitarbeiterzahl(int mitarbeiterzahl) {
        this.mitarbeiterzahl = mitarbeiterzahl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAktuellesprojekt() {
        return this.aktuellesprojekt;
    }

    public void setAktuellesprojekt(String aktuellesprojekt) {
        this.aktuellesprojekt = aktuellesprojekt;
    }

    public void addMitarbeiter(Mitarbeiter m){
        l.add(m);
    }

    public void removeMitarbeiter(Mitarbeiter m){
        l.remove(m);
    }
}
