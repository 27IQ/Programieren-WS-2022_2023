package Übung_Interface.Fahrzeuge;
/*
 * Diese Klasse enthaelt die main Methode.
 * Du kannst diese Klasse modifizieren, wie du willst.
 * Wenn du sie nicht modifizierst, und hier keine Syntaxfehler mehr auftreten,
 * solltest du diese Aufgabe korrekt geloest haben.
 */
public class Main
{
	/*
	 * Dies ist die main Methode.
	 * Hier werden deine Klassen und Methoden getestet.
	 * So lange hier noch Syntaxfehler sind, hast du noch nicht alle
	 * Klassen richtig voneinander erben lassen.
	 */
	public static void main(String[] args)
	{
		Vehicle flieger = new Airplane();
		flieger.move();
		Vehicle auto = new Car();
		System.out.println("Ein Auto hat so viele Raeder: " + ((Car) auto).getNumberOfWheels());
		auto = new PKW();
		auto = new Cabrio();
		((Cabrio) auto).openTheTop();
		flieger = new PassengerPlane();
		PassengerPlane pf = (PassengerPlane) flieger;
		System.out.println("In dem Passagierflugzeug sitzen so viele Menschen: " + pf.getNumberOfOccupants());
		Airworthy flugdings = new Drone();
		flugdings = new Helicopter();
		flugdings.fly();
		flugdings = new Drone();
		flugdings.fly();
		flugdings = new Airplane();
		flugdings.fly();
		Driveable fahrdings = new LKW();
		fahrdings.drive();
		fahrdings = new Airplane();
		fahrdings = new PKW();
		Loadable beladbaresDings = new LKW();
		System.out.println("In den LKW passt so viel Ladung: " + beladbaresDings.getCapacity());
		System.out.println("Der LKW hat Ladung von diesem Typ geladen: " + beladbaresDings.getLoadTyp());
		PassengerTransportable personendings = new PassengerPlane();
		PassengerTransportable personendings2 = new PKW();
		if(personendings.getNumberOfSeats()>personendings2.getNumberOfSeats())
		{
			System.out.println("Ein Passagierflugzeug hat mehr Sitzplaetze als ein PKW.");
		}
		else
		{
			System.out.println("Ein Passagierflugzeug hat nicht mehr Sitzplaetze als ein PKW.");
		}
	}
}