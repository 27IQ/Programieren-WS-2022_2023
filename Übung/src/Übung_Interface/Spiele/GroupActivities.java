package Übung_Interface.Spiele;

public interface GroupActivities {
	
	final int maxNumberOfPlayers = 20;
	final int minNumberOfPlayers = 2;
	final double maxPlayingTime = 24.0;
	final double minPlayingTime = 0.25;
	
	public double calculatePlayingTime();

}
