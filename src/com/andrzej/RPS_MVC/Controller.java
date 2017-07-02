package com.andrzej.RPS_MVC;

/**
 * Created by andrzej on 02.07.17.
 */
public class Controller {
	//links the model and the view

	private Model model;
	private View view;


	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}


	public void setPlayerOneName(String name) {
		model.setNamePlayerOne(name);
	}

	public void setPlayerTwoName(String name) {
		model.setNamePlayerTwo(name);
	}

	public String getPlayerOneName() {
		return model.getNamePlayerOne();
	}

	public String getPlayerTwoName() {
		return model.getNamePlayerTwo();
	}

	public void startTheGame() {
		view.putPlayersName();
		int counter = 0;
		while (counter != 5) {
			String player1hand = model.player1Move();
			String player2hand = model.player2Move();

			int resultFromTheSingleGame = model.calcResult(player1hand, player2hand);
			if (resultFromTheSingleGame == 1) {
				model.setPoints1player(model.getPoints1player() + 1);
			} else if (resultFromTheSingleGame == 2) {
				model.setPoints2player(model.getPoints2player() + 1);
			}
			System.out.println(model.getPoints1player() + " points " + model.getNamePlayerOne() );
			System.out.println(model.getPoints2player() + " points " + model.getNamePlayerTwo() );
			counter++;

		}
	}

}





