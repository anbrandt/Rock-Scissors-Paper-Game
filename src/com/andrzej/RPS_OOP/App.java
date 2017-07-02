package com.andrzej.RPS_OOP;

/**
 * Using typical Object Oriented Programming approach
 * two players, one is computer player randomly picking hand
 * second is human player
 * - one interface Player
 */
public class App {

	public static void main(String[] args) {
	int numbersOfRounds = 5;
	HumanPlayer humanPlayer = new HumanPlayer("Andrzej");
	ComputerPlayer computerPlayer = new ComputerPlayer("Ijon");


	Judge judge = new Judge(humanPlayer, computerPlayer,  numbersOfRounds);
	BoardScore boardScore = new BoardScore(numbersOfRounds, humanPlayer.getName() ,computerPlayer.getName());

	int counter = 0;
	while (counter != numbersOfRounds) {
		int result = judge.playOneRound();
		boardScore.refreshTheBoard(result);
		counter++;
	}

	}
}
