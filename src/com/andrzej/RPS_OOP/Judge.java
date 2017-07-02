package com.andrzej.RPS_OOP;

/**
 * Created by andrzej on 02.07.17.
 */
public class Judge {

	//instead of choosing between player and human player i create two interface instances
	private Player player1;
	private Player player2;

	private int currentRound;
	private int maxRounds;



	public Judge(Player player1, Player player2, int maxRounds) {
		this.player1 = player1;
		this.player2 = player2;
		this.maxRounds = maxRounds;
	}
//	public Judge(Player player1, Player player2){
//		this(10, player1, player2);
//	}
	private RPSgetter getter = new RPSgetter();


	public int calcResult(String p1hand, String p2hand) {
		if(p1hand.equals(p2hand)) {
			System.out.println("It is a DRAW!");
			return 0;
		} else if(p1hand.equals(null) || p1hand.equals(null)) {
			return 0;
		} else if
				((p1hand.equals(getter.getPAPER()) && p2hand.equals(getter.getROCK()))
						|| (p1hand.equals(getter.getSCISSORS()) && p2hand.equals(getter.getPAPER()))
						|| (p1hand.equals(getter.getROCK()) && p2hand.equals(getter.getSCISSORS()))) {
			System.out.println(player1.getName() + " win");
			return 1;
		}
		else {
			System.out.println(player2.getName() + " win");
			return 2;
		}
	}

	public int playOneRound() {
		if(currentRound == maxRounds)
			return -1;
		currentRound++;
		String makeMove = player1.makeMove();
		String makeMove2 = player2.makeMove();

		return calcResult(makeMove,makeMove2);
	}

}
