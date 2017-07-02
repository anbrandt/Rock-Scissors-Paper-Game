package com.andrzej.RPS_basic;

/**
 * Created by andrzej on 02.07.17.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock, Papers, Scissors Game! 2 players");

		String result = makeAmove("rock", "paper");

		System.out.println(result);
		result = makeAmove("paper", "rock");
		System.out.println(result);

		result = makeAmove("scissors", "rock");
		System.out.println(result);


	}

	public static String makeAmove(String choosedMove1player, String choosedMove2player) {
		String rock = "rock";
		String scissors = "scissors";
		String paper = "paper";


		if (choosedMove1player.equals(rock) && choosedMove2player.equals(scissors)) {
			return "Player one won!";
		} else if (choosedMove1player.equals(scissors) && choosedMove2player.equals(rock)) {
			return "Player two won";
		} else if (choosedMove1player.equals(rock) && choosedMove2player.equals(paper)) {
			return "Player two won";
		} else if (choosedMove1player.equals(paper) && choosedMove2player.equals(rock)) {
			return "Player one won";
		} else if (choosedMove1player.equals(scissors) && choosedMove2player.equals(paper)) {
			return "Player one won";
		} else if (choosedMove1player.equals(paper) && choosedMove2player.equals(scissors)) {
			return "Player two won";
		} else return "Wrong move";

	}


}


