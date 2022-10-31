

public class Pyramide {
	
	/*
	 * Diese Methode soll eine Pyramide aus * zurueckgeben.
	 * Dabei wird mit n die breite der untersten Reihe angegeben.
	 * Als n wird immer eine ungerade Zahl angegeben.
	 * Eine Pyramide sieht wie folgt aus:
	 *   *
	 *  ***
	 * *****
	 * Diese wird so erstellt, dass in der obersten Zeile 1 * ist, in der darunterliegenden 3 *,...
	 * in der (n/2+1)ten Zeile (die unterste Zeile) kommmen n *.
	 * Vor dem ersten * in jeder Zeile muessen noch Leerzeichen eingesetzt werden,
	 * damit die Sterne jeder Zeile in der Mitte stehen. Nach dem letzten Stern in
	 * jeder Zeile kommt ein Zeilenumbruch, dann beginnt die n�chste Zeile.
	 * Nach der letzten Zeile folgt KEIN Zeilenumbruch mehr.
	 * Das Zeichen Zeilenumbruch ist das Folgende: \n
	 */
	public static String machePyramideLayer(int n) {
		String pyramide="";
		for(int i=1;i<=n;i++){

			for(int a=0;a<(n-i);a++){
				pyramide+=" ";
			}

			for(int a=0;a<(i*2)-1;a++){
				pyramide+="*";
			}

			if(i<n){
				pyramide+="\n";
			}
		}
		return pyramide;
	}
	 
	public static String machePyramide(int n){
		int layer=0;
		while(n>0){
			n-=2;
			layer++;
		}
		return machePyramideLayer(layer);
	}
	/*
	 * Beispielmethode.
	 * So sieht die Loesung fuer n=5 aus.
	 */
	public static String beispiel() {
		return "  *\n ***\n*****";
	}
	
	//In der Main Methode kannst du deine eigene Methode testen. Du kannst natuerlich auch eigene Testfaelle schreiben.
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(machePyramide(1));
		System.out.println();
		System.out.println(machePyramide(3));
		System.out.println();
		System.out.println(machePyramide(5));
		System.out.println();
		System.out.println(machePyramide(7));
	}
}