package aufgabe3;

public class Gemuese {
	private String bezeichnung;
	private String farbe;
	private int gewicht;

	public Gemuese(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	// GETTER & SETTER
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
}
