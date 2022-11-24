package Übungsblatt_6.Aufgabe4;

public class Aufgabe4 {

	public double calculatePrice(ToolOrder[] toolOrders) {
		double preis=0,zwischenpreis;

		for (ToolOrder toolOrder : toolOrders) {
			zwischenpreis=toolOrder.getBaseprice()*toolOrder.getQuantity();
			switch(toolOrder.getEnergyLabel()){
				case A:
					zwischenpreis*=2;
					if(toolOrder.getManufacturer()==Manufacturer.HACKINTOSH)
					zwischenpreis=0;
					break;
				case B:
					zwischenpreis+=2;
					if(toolOrder.getManufacturer()==Manufacturer.HACKINTOSH)
					zwischenpreis=0;
					break;
				case C:
					if(toolOrder.getManufacturer()==Manufacturer.BEST_BASICS)
					zwischenpreis=0;
					break;
				case D:
					if(toolOrder.getManufacturer()==Manufacturer.PREMIUM_INC)
					zwischenpreis=0;
					break;
				case E:
					if(toolOrder.getManufacturer()==Manufacturer.PREMIUM_INC)
					zwischenpreis=0;
					break;
				case F:
					zwischenpreis*=0.9;
					if(toolOrder.getManufacturer()==Manufacturer.PREMIUM_INC)
					zwischenpreis=0;
					break;
				case G:
					zwischenpreis*=0.9;
					if(toolOrder.getManufacturer()==Manufacturer.PREMIUM_INC)
					zwischenpreis=0;
					break;
				default:
					break;
			}
			preis+=zwischenpreis;
		}

		return preis;
	}


	public static void main(String[] args) {
		
	}
}
