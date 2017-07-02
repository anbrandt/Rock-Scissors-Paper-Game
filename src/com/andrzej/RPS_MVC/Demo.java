package com.andrzej.RPS_MVC;

/**
 * Created by andrzej on 02.07.17.
 */
public class Demo {


	public static void main(String[] args) {

		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);

		controller.startTheGame();

	}
}
