package Miniprojekt_1;
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] newdata = new int[data.length+1];
		for(int i=0;i<data.length;i++){
			newdata[i]=data[i];
		}
		newdata[newdata.length-1]=value;
		data=newdata;
	}

	public void addValues(int[] values) {
		int[] newdata = new int[data.length+values.length];
		for(int i=0;i<data.length;i++){
			newdata[i]=data[i];
		}
		for(int i=0;i<values.length;i++){
			newdata[data.length+i]=values[i];
		}
		data=newdata;
	}

	public int getMinimumValue() {
		int current=data[0];
		for (int i = 0; i < data.length-1; i++) {
			if(current>data[i+1]){
				current=data[i+1];
			}
		}
		return current;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				counter++;
			}
		}

		int[] valuesAbove= new int[counter];

		counter=0;

		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				valuesAbove[counter]=data[i];
				counter++;
			}	
		}
		return valuesAbove;
	}

	// --------------------------------------------------------------
	
	public void printData() {
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		Measurement m = new Measurement();
		System.out.println("Neues Measurement-Objekt m erzeugt. m:");
		// ErwarteteAusgabe:
		// []
		m.printData();

		System.out.println("------------------------------------------------------------------");
		
		m.addValue(85);
		System.out.println("Hinzufuegen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzufuegen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte ueber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte ueber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}