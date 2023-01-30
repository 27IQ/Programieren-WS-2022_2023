
public class Mitarbeiter {
private String vorname;
private String nachname;
private int gehalt;
private Abteilung abteilung;

public Mitarbeiter(String vorname, String nachname, int gehalt, Abteilung abteilung)  {
	this.vorname = vorname;
	this.nachname = nachname;
	this.gehalt = gehalt;
	this.abteilung = abteilung;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+vorname+" "+nachname+"; "+gehalt+"; "+abteilung;
	}

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

public String getNachname() {
	return nachname;
}

public void setNachname(String nachname) {
	this.nachname = nachname;
}

public int getGehalt() {
	return gehalt;
}

public void setGehalt(int gehalt) {
	this.gehalt = gehalt;
}

public Abteilung getAbteilung() {
	return abteilung;
}

public void setAbteilung(Abteilung abteilung) {
	this.abteilung = abteilung;
}


}
