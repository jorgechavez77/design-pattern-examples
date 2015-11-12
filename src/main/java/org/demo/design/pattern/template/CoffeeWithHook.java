package org.demo.design.pattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeinBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out
				.println("Would you like milk and sugar with your coffee (y/n)");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO Error when trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}

}
