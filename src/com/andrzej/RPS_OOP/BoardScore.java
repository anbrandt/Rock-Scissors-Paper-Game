package com.andrzej.RPS_OOP;

/**
 * Created by andrzej on 02.07.17.
 */
public class BoardScore {

	private int points1player;
	private int points2player;

	private int maxRounds;
	private int currentRound;

	private String host;
	private String guest;

	public BoardScore(int maxRounds, String host, String guest) {
		this.maxRounds = maxRounds;
		this.host = host;
		this.guest = guest;
	}

	public void refreshTheBoard(int result) {
		currentRound++;

		String message = null;

		switch(result) {
			case 0:
				message = "draw";
				break;
			case 1:
				message = "win for " + host;
				points1player++;
				break;
			case 2:
				message = "win for " + guest;
				points2player++;
				break;
		}
		System.out.println("Round number is " + currentRound + ". " + message + "\n" +
				host +" " + points1player + "\n" +
				guest + " " +  points2player);
	}
}
