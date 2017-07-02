package com.andrzej.RPS_OOP;

import java.util.Scanner;

/**
 * Created by andrzej on 02.07.17.
 */
public class HumanPlayer implements Player {

	private String name;
	private Scanner scanner = new Scanner(System.in);

	private RPSgetter getter = new RPSgetter();
	public HumanPlayer(String name) {
		this.name = name;
	}

	@Override
	public String makeMove() {
		System.out.println("Choose between rock, scissors and paper: ");
		String choosed = scanner.nextLine();

		if(!(choosed.equals(getter.getPAPER()) || choosed.equals(getter.getROCK()) ||
		choosed.equals(getter.getSCISSORS()))) {
			return null;
		} else return choosed;
	}

	@Override
	public String getName() {
		return name;
	}
}
