
public class Workshop {
	
	public int money;
	public Car[] cars;
	public int repairedCarsPerDay,capacity;

	public int[] cost;
	
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public Workshop(int capacity, int speed){
		money=1000;
		repairedCarsPerDay=speed;
		cars=new Car[capacity];
		cost=new int[capacity];
	}

	
	// Aufgabe 2
	public boolean acceptCar(Car car){
		if(capacity<cars.length&&car.isDamaged()){
			int i=0;
			while(cars[i]!=null&&i<cars.length-1){
				i++;
			}
			cars[i]=car;
			capacity++;
			return true;
		}
		return false;
	}
	
			
	// Aufgabe 3
	public void nextDay(){
		int currentrepair=0;
		for(int i=0;currentrepair<repairedCarsPerDay&&i<cars.length;i++){
			if(cars[i]!=null){
				if(cars[i].isDamaged()){
					cost[i]=cars[i].repair();
					currentrepair++;
				}
			}
		}
	}
	
	
	// Aufgabe 4
	public int retrieveCar(Car car){

		for(int i=0;i<cars.length;i++){
			if(cars[i]==null){
				cost[i]=0;
			}
		}

		for(int i=0;i<cars.length;i++){
			if(car==cars[i]){
				if(!cars[i].isDamaged()){
					money+=cost[i]/5;
					cars[i]=null;
					return cost[i];
				}
			}
		}
		return 0;
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
		
	public int getMoney(){
		return money;
	}
		
	public static void main(String[] args) {
		

	}

}
