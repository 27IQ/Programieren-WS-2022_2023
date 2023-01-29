package aufgabe5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lagerhaus
 */
public class Lagerhaus extends Immobilie{

    public List<Lagerhaus> lagerhäuser= new ArrayList<Lagerhaus>();
    private int flaeche;

    public Lagerhaus(int Grundpreis,Besitztyp besitztyp, int flaeche) {
        super(Grundpreis, besitztyp);
        this.flaeche=flaeche;
    }

    public int getflaeche() throws FlaecheNegativException{
        if(flaeche<0)
        throw new FlaecheNegativException();

        return flaeche;
    }

    public boolean abbruch;

    public List<Lagerhaus> sortedLaferhäuser(){

        abbruch=false;

        List<Lagerhaus> l= lagerhäuser.stream().sorted((l1,l2)->{
            try {
                return l1.getflaeche()-l2.getflaeche();
            } catch (FlaecheNegativException e) {
                System.out.println("Ein Lagerhaus hat eine negative Fläche!");
                abbruchtrue();
                return 0;
            }
        }).collect(Collectors.toList());

        if(abbruch)
        return null;

        return l;
    }

    public void abbruchtrue(){
        abbruch=true;
    }
    
}