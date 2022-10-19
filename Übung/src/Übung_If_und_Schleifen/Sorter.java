package Übung_If_und_Schleifen;

import java.util.Arrays;

public class Sorter {

	/*
	 * Diese Methode bekommt ein int[] uebergeben und soll dieses sortieren.
	 * Dabei soll aber nur eine Kopie bearbeitet werden, das uebergebene Array soll
	 * seine Elemente behalten. Die sortierte Kopie wird dann zurueckgegeben.
	 * Hierbei sollen die Zahlen in aufsteigender Reihenfolge sortiert sein.
	 * Beispiel: sort({10,5,42,17,108}) --> {5,10,17,42,108}
	 */
	
	public int[] sort(int[] toSort)
	{
		int sorted[]=new int[toSort.length];	
		for(int i=0;i<toSort.length;i++){
			sorted[i]=getsmallest(sorted);
		}
		return sorted;
	}
	
	public int getsmallest (int p[]){
		int smallest=p[0];
		for(int i=1;i<p.length-1;i++){
			if(smallest>p[i]);
			smallest=p[i];
		}
		return smallest;
	}
	/*
	 * Diese Methode soll das uebergebene Array auch sortieren, allerdings soll diesmal direkt das Array
	 * sortiert werden und keine Kopie angelegt werden. Entsprechend hat diese Methode auch
	 * keinen Rueckgabewert.
	 * Beispiel:
	 * int[] a = new int[]{10,5,42,17,108};
	 * sort2(a);
	 * --> a ist jetzt {5,10,17,42,108}
	 */
	public void sort2(int[] toSort)
	{
		
	}
	
	/*
	 * Die Main Methode zum Testen deiner Methoden.
	 */
	public static void main(String[] args) {
		int[] toSort = new int[]{10,5,42,17,108};
		Sorter sort = new Sorter();
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		System.out.println("Das Ergebnis: "+Arrays.toString(sort.sort(toSort)));
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		sort.sort2(toSort);
		System.out.println("Das Ergebnis: "+Arrays.toString(toSort));
	}
}
