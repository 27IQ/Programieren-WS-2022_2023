package Übung_Interface.Spiele;

public class BoardGameTester {

	public static void main(String[] args) {
		
		BoardGame boardGame1 = new BoardGame("Herr der Dinge");
		boardGame1.setPlayer(5);
		double gameTime = boardGame1.calculatePlayingTime();
		System.out.println("Tests der Methode calculatePlayingTime() :\n");
		System.out.println("Ihr Ergebnis:       " +gameTime);
		System.out.println("erwartetes Ergebnis: 6.5");
		boardGame1.setPlayer(18);
		gameTime=boardGame1.calculatePlayingTime();
		System.out.println("Ihr Ergebnis:       " +gameTime);
		System.out.println("erwartetes Ergebnis: 24.0");
		boardGame1.setPlayer(11);
		gameTime=boardGame1.calculatePlayingTime();
		System.out.println("Ihr Ergebnis:       " +gameTime);
		System.out.println("erwartetes Ergebnis: 16.5");
		boardGame1.setPlayer(9);
		gameTime=boardGame1.calculatePlayingTime();
		System.out.println("Ihr Ergebnis:       " +gameTime);
		System.out.println("erwartetes Ergebnis: 0.5");
		
		
		System.out.println("--------------------------------------------"
				+ "----------------------------------------------");
		System.out.println("--------------------------------------------"
				+ "----------------------------------------------");
		
		System.out.println("Tests der toString() Methode :\n");
		System.out.println("Ihr Ergebnis:         "+boardGame1.toString());
		System.out.println("erwartetes Ergebnis:   Das Spiel: Herr der Dinge. (Brettspiel)");
		boardGame1= new BoardGame("Zombie Hunter");
		System.out.println("Ihr Ergebnis:         "+boardGame1.toString());
		System.out.println("erwartetes Ergebnis:   Das Spiel: Zombie Hunter. (Brettspiel)");
		boardGame1 = new BoardGame("Schach");
		System.out.println("Ihr Ergebnis:         "+boardGame1.toString());
		System.out.println("erwartetes Ergebnis:   Das Spiel: Schach. (Brettspiel)");
		
		

	}
	
	

}
