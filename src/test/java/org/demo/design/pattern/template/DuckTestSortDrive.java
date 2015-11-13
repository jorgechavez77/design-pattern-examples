package org.demo.design.pattern.template;

import java.util.Arrays;

import org.demo.design.pattern.template.example.Duck;
import org.junit.Test;

public class DuckTestSortDrive {

	@Test
	public void test() {
		Duck[] ducks = { new Duck("Duffy", 8), new Duck("Dewey", 2),
				new Duck("Howard", 7), new Duck("Louie", 2),
				new Duck("Donald", 10), new Duck("Huey", 2) };

		System.out.println("Before sorting:");
		display(ducks);

		Arrays.sort(ducks);

		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	private void display(Duck[] ducks) {
		for (Duck duck : ducks) {
			System.out.println(duck);
		}
	}
}
