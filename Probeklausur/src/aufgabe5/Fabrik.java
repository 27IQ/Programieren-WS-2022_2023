package aufgabe5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Fabrik
 */
public class Fabrik extends Immobilie {

    List<Fabrik> fabriken=new ArrayList<Fabrik>();

    public Fabrik(int Grundpreis, Besitztyp besitztyp) {
        super(Grundpreis, besitztyp);
        //TODO Auto-generated constructor stub
    }

    public List<Fabrik> getPrivateFactories() throws KeineWeiterenFabrikenException{
        if(fabriken.isEmpty())
        throw new KeineWeiterenFabrikenException();

        return fabriken.stream().filter(s->s.getBesitztyp()==Besitztyp.PRIVAT).collect(Collectors.toList());
    }
    
}