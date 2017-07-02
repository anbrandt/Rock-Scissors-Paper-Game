package com.andrzej.RPS_MVC;

import java.util.Scanner;

/**
 * Created by andrzej on 02.07.17.
 */
public class Model {
	//game logic here - player one versus player two, on the same computer
	//biznes logic here

	//class has three atributes of state of the game
	private final String ROCK = "rock";
	private final String PAPER = "paper";
	private final String SCISSORS = "scissors";

	private int points1player;
	private int points2player;

	private String namePlayerOne;
	private String namePlayerTwo;

	private final int ROUNDS = 5;
	Scanner scanner = new Scanner(System.in);


	public String getROCK() {
		return ROCK;
	}

	public String getPAPER() {
		return PAPER;
	}

	public String getSCISSORS() {
		return SCISSORS;
	}

	public int getPoints1player() {
		return points1player;
	}

	public void setPoints1player(int points1player) {
		this.points1player = points1player;
	}

	public int getPoints2player() {
		return points2player;
	}

	public void setPoints2player(int points2player) {
		this.points2player = points2player;
	}

	public String getNamePlayerOne() {
		return namePlayerOne;
	}

	public void setNamePlayerOne(String namePlayerOne) {
		this.namePlayerOne = namePlayerOne;
	}

	public String getNamePlayerTwo() {
		return namePlayerTwo;
	}

	public void setNamePlayerTwo(String namePlayerTwo) {
		this.namePlayerTwo = namePlayerTwo;
	}

	public int getROUNDS() {
		return ROUNDS;
	}


	public String player1Move() {
		System.out.println("Player 1 - choose Rock, Scissors, Paper");
		String p1move = scanner.nextLine();
		if(!(p1move.equals(ROCK) || p1move.equals(SCISSORS) || p1move.equals(PAPER))) {
			System.out.println("Wrong input!");
			return null;
		}
		return p1move;
	}
	public String player2Move() {
		System.out.println("Player 2 - choose Rock, Scissors, Paper");
		String p2move = scanner.nextLine();
		if(!(p2move.equals(ROCK) || p2move.equals(SCISSORS) || p2move.equals(PAPER))) {
			System.out.println("Wrong input!");
			return null;
		}
		return p2move;
	}

	public int calcResult(String p1hand, String p2hand) {
		if(p1hand.equals(p2hand)) {
			System.out.println("DRAW!");
			return 0;
		} else if
			((p1hand.equals(PAPER) && p2hand.equals(ROCK))
					|| (p1hand.equals(SCISSORS) && p2hand.equals(PAPER))
					|| (p1hand.equals(ROCK) && p2hand.equals(SCISSORS))) {
			System.out.println(getNamePlayerOne() + " win");
			return 1;
		}
		else {
			System.out.println(getNamePlayerTwo() + " win");
			return 2;
		}
	}




}
