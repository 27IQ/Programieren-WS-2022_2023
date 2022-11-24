package Aufgabe_Modellierung_Unternehmen;

public class Mitarbeiter {
    String name;
    int geburtsjahr,anstellungsjahr,gehaltsstufe;

    public Mitarbeiter(String name,int geburtsjahr,int anstellungsjahr){
        this.name=name;
        this.geburtsjahr=geburtsjahr;
        this.anstellungsjahr=anstellungsjahr;
    }

    public int alter(int aktuellesJahr){
        return aktuellesJahr-geburtsjahr;
    }

    public boolean rente(int aktuellesJahr){
        if(alter(aktuellesJahr)>=70)
        return true;

        return false;
    }

    public int getaktuellegehaltsstufe(int aktuellesJahr){
        int neueGehaltsstufe=gehaltsstufe;
        while(aktuellesJahr-anstellungsjahr>=5){
            neueGehaltsstufe++;
            aktuellesJahr-=5;
        }
        return neueGehaltsstufe;
    }

}
