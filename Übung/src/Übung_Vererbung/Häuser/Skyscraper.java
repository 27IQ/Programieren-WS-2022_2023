package Übung_Vererbung.Häuser;
//	-------------------- Aufgabe 1 --------------------
// A)
public class Skyscraper extends Building {

	private int apartments;

	public Skyscraper(int apartments) {
		super();
		this.apartments = apartments;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.-----

	@Override
	public int rentalCosts() {
		int cost = 100*getPlotArea()-300*apartments;
		
		if(cost<300)
		return 300;

		return cost;
	}
	
	@Override
	public void setPlotArea(int plotArea){
		if(plotArea>80||plotArea<20){
			super.setPlotArea(35);
			return;
		}

		super.setPlotArea(plotArea);
	}
}
