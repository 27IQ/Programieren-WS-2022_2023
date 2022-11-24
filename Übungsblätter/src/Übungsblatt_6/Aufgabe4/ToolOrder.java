package Übungsblatt_6.Aufgabe4;

public class ToolOrder {
	private Manufacturer manufacturer;
	private EnergyLabel energyLabel;
	private double baseprice;
	private int quantity;
	
	public ToolOrder(Manufacturer manufacturer, EnergyLabel energyLabel, double baseprice, int quantity) {
		this.manufacturer = manufacturer;
		this.energyLabel = energyLabel;
		this.baseprice = baseprice;
		this.quantity = quantity;
	}


	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	public EnergyLabel getEnergyLabel() {
		return energyLabel;
	}

	public void setEnergyLabel(EnergyLabel energyLabel) {
		this.energyLabel = energyLabel;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
