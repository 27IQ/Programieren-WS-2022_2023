package Übungsblatt_6.Aufgabe3;

public class Mensch {
    private Mund mund;
    private String name;
    private final int geburtsjahr;
    private Mensch partner;
    public Mensch(String name,int geburtsjahr) {
    this.name = name;
    this.geburtsjahr = geburtsjahr;
    mund = new Mund();
    }
    public void nenneNameUndAlter(int aktuellesJahr) {
    System.out.println("Hallo ich bin "+ name +" und "
    + "ich bin "+getAlter(aktuellesJahr)+" alt");
    }
    private int getAlter(int aktuellesJahr) {
    int alter = aktuellesJahr - geburtsjahr;
    return alter;
    }
    public int getGeburtsjahr(){
    return geburtsjahr;
    }
    public void setPartner(Mensch partner) {
    this.partner = partner;
    }
    public void fuerAnderenSprechen() {
    partner.mund.sprechen("Ich "+ name +
    " spreche aus dem Mund von "+partner.name);
    }
    public void nenneAltersunterschied(int geburtsjahr) {
    System.out.println(geburtsjahr - geburtsjahr);
    }
    }
