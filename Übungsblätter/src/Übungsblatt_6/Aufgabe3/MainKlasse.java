package Übungsblatt_6.Aufgabe3;

public class MainKlasse {
    public static final int ANNA_GEBURTSJAHR = 2001;
    public static final int BERT_GEBURTSJAHR = 2000;
    public static void main(String[] args) {
    //Mund mundOhneMensch = new Mund();
    Mensch anna = new Mensch("Anna",ANNA_GEBURTSJAHR);
    anna.nenneNameUndAlter(2021);
    // anna.getAlter(2021);
    Mensch bert = new Mensch("Bert",BERT_GEBURTSJAHR);
    bert.nenneAltersunterschied(anna.getGeburtsjahr());
    anna.setPartner(bert);
    anna.fuerAnderenSprechen();
    
    }
    }