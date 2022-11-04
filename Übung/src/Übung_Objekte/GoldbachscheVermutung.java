public class GoldbachscheVermutung {
	/*
	 * Die main-Methode. Wie immer kannst du hier eigene Testfaelle schreiben,
	 * es sind aber auch schon ein paar Testfaelle vorgegeben.
	 */

	public static void main(String[] args)	{
		int[] numbers = primeNumbers(4);
		System.out.println("4 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(8);
		System.out.println("8 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(10);
		System.out.println("10 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(12);
		System.out.println("12 = " + numbers[0] + " + " + numbers[1] + ".");
	}
	
	// Aufgabe 1
	public static int[] primeNumbers(int number) {
		int[] numbers =new int[2];
		int i=0,a=0;
		PrimeNumbers p=new PrimeNumbers(number);
		boolean matched=false;

		while(!matched){
			for(i=0;i<number-1;i++){
				for(a=0;a<number-1;a++){
					if(p.getPrimeNumber(i)+p.getPrimeNumber(a)==number){
						numbers[0]=p.getPrimeNumber(i);
						numbers[1]=p.getPrimeNumber(a);
						matched=true;
					}
				}
			}
		}
		
		return numbers;
	}
}