package aufgabe5;

public abstract class Immobilie implements Verkaufbar{

    public int Grundpreis;
    public Besitztyp besitztyp;

    public Immobilie(int Grundpreis,Besitztyp besitztyp){
        this.Grundpreis=Grundpreis;
        this.besitztyp=besitztyp;
    }

    public int getKaufpreis(){
        if(besitztyp==Besitztyp.PRIVAT)
        return Grundpreis*Faktor;

        return Grundpreis;
    }

    public Besitztyp getBesitztyp(){
        return besitztyp;
    }
}