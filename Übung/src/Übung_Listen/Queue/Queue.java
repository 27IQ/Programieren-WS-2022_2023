package Queue;
public class Queue {
	QueueNode first;
	QueueNode last;
	
	public void Warteschlange(){
		first	= null;
		last	= null;
	}
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	// Aufgabe 1
	public void push(int number){
		if(last==null){
			first=new QueueNode(number, null);
			last=first;
		}else{
			last.setNext(new QueueNode(number, null));
			last=last.getNext();
		}
	}
	// Aufgabe 2
	public int pop(){
		if(first!=null){
			QueueNode n=first;
			first=first.getNext();

			if(first==null){
				last=null;
			}

			return n.getNumber();
		}
		return Integer.MIN_VALUE;
	}
	// Aufgabe 3
	public int length(){
		int counter=1;
		if(first!=null){
			QueueNode current=first;

			while(current.getNext()!=null){
				current=current.getNext();
				counter++;
			}

			if(counter>0){
				return counter;
			}
		}

		return 0;
	}
	// Aufgabe 4
	public int sum(){
		if(first!=null){
			QueueNode current=first;
			int sum=0;
			while(current!=null){
				sum+=current.getNumber();
				current=current.getNext();
			}

			if(first.getNext()==null){
				sum+=first.getNumber();
			}

			return sum;
		}
		return 0;
	}
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	/*
	 * Testen Sie hier Ihre Implementierung.
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(4);		// Inhalt der Warteschlange: (4)
		queue.push(17);		// Inhalt der Warteschlange: (4, 17)
		queue.pop();		// ...                       (17)
		queue.push(33);		// 							 (17, 33)
		queue.push(-13);	//							 (17, 33, -13)
		queue.pop();		//							 (33, -13)
		System.out.println("Erwartete Länge der Warteschlange: 2");
		System.out.println("Tatsächliche Länge:               " + queue.length());
		System.out.println();
		System.out.println("Erwartete Summe über der Warteschlange: 20");
		System.out.println("Tatsächliche Summe:                     " + queue.sum());
	}
}
