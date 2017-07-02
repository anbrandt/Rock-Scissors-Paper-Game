package com.andrzej.RPS_MVC;

import java.util.Scanner;

/**
 * Created by andrzej on 02.07.17.
 */
public class View {

	private Model model;


	public View(Model model) {
		this.model = model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	Scanner scanner = new Scanner(System.in);

	public void putPlayersName() {
		System.out.println("Player one write your name");
		String player1 = scanner.nextLine();
		model.setNamePlayerOne(player1);
		System.out.println("Player two write your name");
		String player2 = scanner.nextLine();
		model.setNamePlayerTwo(player2);
	}






}


