package Übung_Vererbung.Häuser;

public abstract class Building {
	
	// Diese Klasse ist nicht zu bearbeiten. Sie dient als Oberklasse fuer Hochhaus
	// und Familienwohnung.
	
	private int plotArea;
	
	public Building() {
		plotArea = 35;
	}
	
	public abstract int rentalCosts ();  
	
	public int getPlotArea() {
		return plotArea;
	}

	protected void setPlotArea(int plotArea) {
		this.plotArea = plotArea;
	}

}
