package Entities;

public class Game {

	private int gameId;
	private String gameName;
	private double gamePrice;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, double gamePrice) {
	
	this.gameId = gameId;
	this.gameName = gameName;
	this.gamePrice = gamePrice;
	
	}

	public int getGameId() {
		return this.gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return this.gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
