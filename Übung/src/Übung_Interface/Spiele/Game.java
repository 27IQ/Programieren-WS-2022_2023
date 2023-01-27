package Übung_Interface.Spiele;

public class Game {

	private String name;

	private int player;

	public Game(String name) {
		this.name = name;
	}

	public String toString() {
		return "Das Spiel: "+ name + ".";
	}

	public int getPlayer() {
		return player;
	}

	protected void setPlayer(int player) {
		this.player = player;
	}
}
