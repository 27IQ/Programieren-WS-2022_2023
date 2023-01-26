//---------------------------- Aufgabe 2 -------------------------
public class ClassWithProblems{
	
	//--------------  a)  -------------------
	public static void methodWithProblems1 (Human <Integer,Boolean> human) {
		human.setLeftPocket(42);
		human.setRightPocket(true);
		
	}
	
	//--------------  b)  -------------------
	public static int [] methodWithProblems2(Human<Integer,Integer> [] humansWithNumbers) {
		int [] result = new int [humansWithNumbers.length];
		
		for(int i=0;i<humansWithNumbers.length;i++) {
			result[i]=humansWithNumbers[i].getLeftPocket();
			result[i]+=humansWithNumbers[i].getRightPocket();
		}
		return result;
	}
	
}

