package com.andrzej.RPS_OOP;

import java.util.Random;

/**
 * Created by andrzej on 02.07.17.
 */
public class ComputerPlayer implements Player {

	private String name;

	private Random random = new Random();
	private final int OPTIONS = 3;

	private RPSgetter getter = new RPSgetter();

	public ComputerPlayer(String name) {
		this.name = name;
	}

	@Override
	public String makeMove() {
		int randomInt = random.nextInt(OPTIONS);
		String computerMove = null;

		switch (randomInt) {
			case 0:
				computerMove = getter.getPAPER();
				break;
			case 1:
				computerMove = getter.getROCK();
				break;
			case 2:
				computerMove = getter.getSCISSORS();
				break;
		}

		return computerMove;
	}

	@Override
	public String getName() {
		return name;
	}
}
