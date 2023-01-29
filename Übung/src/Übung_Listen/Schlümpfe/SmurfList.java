package Schlümpfe;

public class SmurfList {
	
	public static final int SMURF_MAXIMAL_SIZE = 20;
	public static final int SMURF_MINIMAL_SIZE = 8;

	public SmurfNode head;
	
	public SmurfList(){
		head = null;
	}
	
	public SmurfNode getHead(){
		return head;
	}
	
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	
	// Aufgabe1
	public void addSmurf(Smurf smurf){
		if(SMURF_MINIMAL_SIZE>smurf.getSize()||smurf.getSize()>SMURF_MAXIMAL_SIZE)
		return;

		if(head==null){
			head=new SmurfNode(smurf,null);
			return;
		}

		if(smurf.getSize()<head.getSmurf().getSize()){
			SmurfNode node =new SmurfNode(smurf, head);
			head=node;
			return;
		}

		if(head.getNext()==null){
			head.setNext(new SmurfNode(smurf, null));
			return;
		}

		SmurfNode current=head;
		while(smurf.getSize()>current.getNext().getSmurf().getSize()){
			current=current.getNext();

			if(current.getNext()==null){
				current.setNext(new SmurfNode(smurf, null));
				return;
			}
		}

		SmurfNode node =new SmurfNode(smurf, current.getNext());
		current.setNext(node);
	}
	
	// Aufgabe 2
	public boolean containsSmurf(Smurf smurf){
		if(head==null)
		return false;

		SmurfNode current=head;
		while(current!=null){
			if(current.getSmurf().getName().compareTo(smurf.getName())==0||current.getSmurf().getSize()==smurf.getSize())
			return true;

			current=current.getNext();
		}

		return false;
	}
	
	// Aufgabe 3
	public int smurfPosition(Smurf smurf){
		if(head==null)
		return -1;

		SmurfNode current=head;
		int counter=1;
		while(current!=null){
			if(current.getSmurf().getName().compareTo(smurf.getName())==0||current.getSmurf().getSize()==smurf.getSize())
			return counter;

			counter++;
			current=current.getNext();
		}
		return -1;
	}
	
	// Aufgabe 4
	public int smurfPosition(String name){
		if(head==null)
		return -1;

		SmurfNode current=head;
		int counter=1;
		while(current!=null){
			if(current.getSmurf().getName().compareTo(name)==0)
			return counter;

			counter++;
			current=current.getNext();
		}
		return -1;
	}
	
	// Aufgabe 5
	public void downsizeSmurfs(int cm){
		if(head==null)
		return;

		while(head.getSmurf().getSize()-cm<SMURF_MINIMAL_SIZE){
			head=head.getNext();

			if(head==null)
			return;
		}

		SmurfNode current=head;
		while(current!=null){
			current.getSmurf().setSize(current.getSmurf().getSize()-cm);
			current=current.getNext();
		}

		current=head;
		while(current.getNext()!=null){
			if(current.getNext().getSmurf().getSize()<SMURF_MINIMAL_SIZE){
				current.setNext(current.getNext().getNext());
			}else{
				current=current.getNext();
			}
		}
	}
	
	// Aufgabe 6
	public void stretchSmurfs(int cm){
		if(head==null)
		return;

		while(head.getSmurf().getSize()+cm>SMURF_MAXIMAL_SIZE){
			head=head.getNext();

			if(head==null)
			return;
		}

		SmurfNode current=head;
		while(current!=null){
			current.getSmurf().setSize(current.getSmurf().getSize()+cm);
			current=current.getNext();
		}

		current=head;
		while(current.getNext()!=null){
			if(current.getNext().getSmurf().getSize()>SMURF_MAXIMAL_SIZE){
				current.setNext(current.getNext().getNext());
			}else{
				current=current.getNext();
			}
			
		}
	}
	
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	
	
	// Mit dieser Methode koennen Sie die Namen aller Schluempfe in einer
	// Schlumpfliste ausgeben lassen. Sie soll eine Hilfestellung sein um ihre
	// Tests in der "public static void main" zu erleichtern.
	// Den Inhalt einer Schlumpfliste "liste" koennen Sie mit dem Befehl
	//
	//                printSchlumpfListe(liste);
	//
	// auf der Konsole ausgeben lassen.
	public static void printSmurfList(SmurfList slist){
		SmurfNode iterator = slist.getHead();
		while (iterator != null){
			if (iterator.smurf != null){
				System.out.print(iterator.getSmurf().getName() + iterator.getSmurf().getSize()+", ");
			} else {
				System.out.print("NULL, ");
			}
			iterator = iterator.getNext();
		}
		System.out.println();
	}
	
	/*
	 * Hier kommt ihr Testcode hin
	 */
	public static void main(String[] args) {
		SmurfList list = new SmurfList();
		Smurf s1=new Smurf("Papa Schlumpf",17);
		Smurf s2=new Smurf("Schlumpfine", 13);
		Smurf s3=new Smurf("Schlaubi Schlumpf", 10);
		Smurf s4=new Smurf("Bilbo Beutlin", 23);
		Smurf s5=new Smurf("SUIII", 20);
		Smurf [] smurfs = new Smurf [] {s1,s2,s3,s4,s5};
		for(int i=0;i<smurfs.length;i++) {
			list.addSmurf(smurfs[i]);
		}
		printSmurfList(list);
		System.out.println("Existiert Papa Schlumpf in der Liste?    : "+list.containsSmurf(smurfs[0])+" An der Stelle "+list.smurfPosition(smurfs[0]));
		System.out.println("Existiert Bilbo Beutlin in der Liste?  : "+list.containsSmurf(smurfs[3])+" An der Stelle "+list.smurfPosition(smurfs[3]));
		
		printSmurfList(list);
		System.out.println("Schluempfe werden verkleinert!");
		list.downsizeSmurfs(4);
		printSmurfList(list);
		list.stretchSmurfs(4);
		System.out.println("Schluempfe werden vergrößert!");
		printSmurfList(list);
		list.stretchSmurfs(4);
		System.out.println("Schluempfe werden vergrößert!");
		printSmurfList(list);
	}
}