package Übung_Vererbung.Häuser;
//	-------------------- Aufgabe 2 --------------------
// A)
public class FamilyHome extends Building {

	private int inhabitants;

	public FamilyHome(int inhabitants) {
		this.inhabitants = inhabitants;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.------

	@Override
	public int rentalCosts() {
		int cost=50*getPlotArea()-100*inhabitants;

		if(cost<600)
		return 600;

		return cost;
	}

	@Override
	public void setPlotArea(int plotArea){
		if(plotArea>60||plotArea<30){
			super.setPlotArea(35);
			return;
		}

		super.setPlotArea(plotArea);
	}
	
	
}


