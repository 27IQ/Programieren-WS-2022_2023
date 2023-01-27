package Übung_Interface.Spiele;

                          //Aufgabe 1
public class BoardGame extends Game implements GroupActivities {

	public BoardGame(String name) {
		super(name);
		setPlayer(2);
	}
	
	public void setPlayer(int player) {
		if (player <= GroupActivities.maxNumberOfPlayers && player >= GroupActivities.minNumberOfPlayers) {
			super.setPlayer(player);
		}
	}

	
	// Zu bearbeitender Bereich :
	
    // Aufgabe 3
	public String toString() {
		return super.toString()+" (Brettspiel)";
	}
	//Aufgabe 2 

	@Override
	public double calculatePlayingTime() {
		double i;
		if(getPlayer()>10){
			i=1.5*getPlayer();
		}else{
		 	i=14-1.5*getPlayer();
		}

		if(i>maxPlayingTime)
		return maxPlayingTime;

		if(i<minPlayingTime)
		return minPlayingTime;

		return i;
	}

}
